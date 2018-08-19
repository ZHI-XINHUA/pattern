package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类实现InvocationHandler接口，重写invoke方法。 创建动态代理实例。
 */
public class ProxySubject implements InvocationHandler {
    //目标对象（被代理对象）
    private Object targetObj;


    /**
     * 创建动态代理类的实例
     * @param targetObj
     * @return
     */
    public Object newProxyInstance(Object targetObj){
        this.targetObj = targetObj;
        // 第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        // 第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        // 第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        // 根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
                targetObj.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用前增强
        doBeforeRequest();

        //调用真实的主题类（即被代理类）
        Object obj = method.invoke(this.targetObj,args);

        //调用后增强
        doAfterRequest();

        return obj;
    }

    /**
     * 真实主题前的增强方法,客户端无需关注增强，所以不公开
     */
    private void doBeforeRequest(){
        System.out.println("代理主题：调用前的增强操作......");
    }

    /**
     * 真实主题后的增强方法，客户端无需关注增强，所以不公开
     */
    private void doAfterRequest(){
        System.out.println("代理主题：调用后的增强操作......");
    }
}
