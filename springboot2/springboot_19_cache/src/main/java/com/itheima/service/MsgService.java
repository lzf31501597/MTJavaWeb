package com.itheima.service;



/**
 * @author
 * @version 1.0
 * @date 2024/06/27 14:05
 * @description
 */
public interface MsgService {

    public String get(String tele);
    public boolean check(String tele, String code);

}
