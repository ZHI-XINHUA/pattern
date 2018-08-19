package com.proxy.staticProxy;

/**
 * 代理主题角色：代理主题角色内部包含对真实主题的引用，从而可以在任何时候操作真实主题对象；
 * 代理主题角色提供一个与真实主题角色相同的接口，以便可以在任何时候都可以替代真实主题；控制对
 * 真实主体的引用，负责需要的时候创建真实的主题对象（和删除）；代理角色通常在将客户端调用传给真实的主题之前或之后，
 * 都执行某个操作（增强操作），而不是单纯地将调用传递给真实主题对象
 */
public class ProxySubject implements Subject{

    //引用一个真实主题（利用多肽特性，代理多个真实主题）
    private Subject realSubject;

    /**
     * 实例代理主题
     * @param realSubject 传入真实主题
     */
    public ProxySubject(RealSubject realSubject){
         this.realSubject = realSubject;
     }

    @Override
    public void doRequest() {
         //调用前增强
        doBeforeRequest();

        realSubject.doRequest();

        //调用后增强
        doAfterRequest();
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
