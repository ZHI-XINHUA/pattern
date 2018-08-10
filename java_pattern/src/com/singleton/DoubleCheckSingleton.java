package com.singleton;

/**
 * 双重检查实现单例模式
 */
public class DoubleCheckSingleton {
    //静态对象
    private static DoubleCheckSingleton singleton;

    //静态对象,强行保证线程中对变量所做的任何写入操作对其他线程都是即时可见的
    //private static volatile DoubleCheckSingleton singleton;

    //私有化构造函数,防止外部实例化
    private DoubleCheckSingleton(){}

    //实例化对象
    public static DoubleCheckSingleton getInstance(){
        if(singleton==null){//为空才去同步实例化对象，对比同步方法的方式，这里避免了实例化后的也被同步
            synchronized (DoubleCheckSingleton.class){//如果A、B线程进入同步临界区，A线程先获得锁
                if (singleton==null){//A线程实例为空，创建实例对象，然后释放锁。B线程获得锁，发现对象不为空，则跳过创建实例。
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return  singleton;
    }
}
/**
 * 深入jvm探索，因为虚拟机在执行创建实例的这一步操作的时候并非是原子性操作。当遇到jvm对字节码调优，调整指令的顺序的时候就会出现问题。
 * 首先要明白在JVM创建新的对象时，主要要经过三步：
 *  1.分配内存
 *  2.初始化构造器
 *  3.将对象指向分配的内存的地址
 *
 *  jvm正常情况按照上述步骤是上述代码是没有问题的，这种情况下JVM是完成了整个对象的构造才将内存的地址交给了对象。
 *
 *  当JVM会针对字节码进行调优，调整指令的顺序：2和3顺序发生改变时，这时将会先将内存地址赋给对象，
 *  针对上述的双重加锁，就是说先将分配好的内存地址指给singleton，然后再进行初始化构造器，
 *  这时候后面的线程去请求getInstance方法时，会认为singleton对象已经实例化了，直接返回一个引用。
 *  如果在初始化构造器之前，这个线程使用了singleton，就会产生莫名的错误。
 *
 *  针对JVM节码进行调优带来的问题，我们可以给变量singleton添加volatile修饰。
 *  给静态的实例属性加上关键字volatile，标识这个属性是不需要优化的。
 *  因为加入了volatile关键字，就等于禁止了JVM自动的指令重排序优化，并且强行保证线程中对变量所做的任何写入操作对其他线程都是即时可见的。
 */