package com.itheima.exception;

/**
 * @author
 * @version 1.0
 * @date 2024/05/21 11:19
 * @Description
 */
public class BusinessException extends RuntimeException{

    private Integer code;


    public Integer getCode() {
        return code;
    }

    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
