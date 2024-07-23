package com.itheima.controller.utils;

import lombok.Data;

/**
 * @author
 * @version 1.0
 * @date 2024/06/28 15:08
 * @description
 */
@Data
public class R {

    private Boolean flag;
    private Object data;
    private String msg;


    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
