package com.itheima.test;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2024/03/28 17:51
 * @Description
 */
public class CGlibTest {
    public static void main(String[] args) {
        //CGlib基于父类（目标类）生成Proxy

        //目标对象
        Target target = new Target();
        //通知对象（增强对象）
        MyAdvice04 myAdvice04 = new MyAdvice04();

        //编写CGlib代码
        Enhancer enhancer = new Enhancer();
        //设置父类，生成的代理对象就是Target的子类
        enhancer.setSuperclass(Target.class);
        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            //intercept方法相当于jdk的Proxy的invoke方法
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAdvice04.before();
                Object result = method.invoke(target, objects);//执行目标方法
                myAdvice04.after();
                return result;
            }
        });
        //生成代理对象
        Target proxy = (Target) enhancer.create();
        proxy.show();//test
    }
}
