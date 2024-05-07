package com.itheima.processor;

import com.itheima.advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 16:43
 * @Description
 */
public class MorkAopBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    /*@Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        //对UserServiceImpl中的show1和show2方法进行增强，增强方法存在于MyAdvice中
        //1，筛选service.impl报下的所有类的所有方法都可以进行增强，解决方案if-else
        //2，获取MyAdvice，从spring容器中获取MyAdvice
        //System.out.println(bean.getClass().getPackage().getName());
        if (bean.getClass().getPackage().getName().equals("com.itheima.service.impl")) {
            //生成当前Bean的Proxy对象
            Object beanProxy = Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (Object proxy, Method method, Object[] args) -> {
                        //执行增强对象的before方法
                        MyAdvice myAdvice = applicationContext.getBean(MyAdvice.class);
                        myAdvice.beforeAdvice();
                        //执行目标对象的目标方法
                        Object result = method.invoke(bean, args);
                        ////执行增强对象的after方法
                        myAdvice.afterAdvice();

                        return result;

                    }
            );
            return beanProxy;
        }
        return bean;
    }*/

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
