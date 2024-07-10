package com.itheima.controller.bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author
 * @version 1.0
 * @date 2024/07/08 17:56
 * @description
 */
public class BaseClass {

    //private static final Class clazz = null;
    //public static final Logger log = LoggerFactory.getLogger(BookController.class);
    private Class clazz;
    public static Logger log;

    public BaseClass() {
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }

    /* static{
        clazz = this.getClass();
    } */

}
