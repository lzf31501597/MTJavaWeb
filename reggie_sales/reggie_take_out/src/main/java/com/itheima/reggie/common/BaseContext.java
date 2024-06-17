package com.itheima.reggie.common;

/**
 * @author
 * @version 1.0
 * @date 2024/06/06 22:54
 * @Description 基于ThreadLocal封装工具类，用于保存和获取当前登录用户id
 */
public class BaseContext {

    private static ThreadLocal<Long> threadLocal =  new ThreadLocal<>();

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }
}
