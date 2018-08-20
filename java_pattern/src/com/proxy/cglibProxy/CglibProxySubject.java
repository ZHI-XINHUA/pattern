package com.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xh.zhi on 2018-8-20.
 */
public class CglibProxySubject implements MethodInterceptor{

    /**
     * 创建代理对象
     * @param clazz 代理目标目标
     * @return
     */
    public Object createProxyInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 在代理实例上处理方法调用并返回结果
     * @param proxy  代理类
     * @param method  被代理的方法
     * @param objects  该方法的参数数组
     * @param methodProxy 代理实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //调用前增强
        doBeforeRequest();

        //调用真实的主题类（即被代理类）
       Object obj =  methodProxy.invokeSuper(proxy,objects);

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
