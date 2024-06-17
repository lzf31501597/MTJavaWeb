package com.itheima.reggie.common;

/**
 * @author
 * @version 1.0
 * @date 2024/06/07 13:47
 * @description 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
