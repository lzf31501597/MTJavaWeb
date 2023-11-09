package com.edu.qqcommon;

/**
 * @author
 * @version 1.0
 * @date 2023/11/04 17:07
 * @Description
 */
public interface MessageType {
    //1.在接口中定义了一些常量
    //2.不同的常量值，表示不同的消息类型
    String MESSAGE_LOGIN_SUCCEED = "1";//表示登录成功
    String MESSAGE_LOGIN_FAIL = "2";//表示登录失败
    String MESSAGE_CONN_MES = "3";//普通信息
    String MESSAGE_GET_ONLINE_FRIEND = "4";//要求返回在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND = "5";//返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "6";//返回在线用户列表
    String MESSAGE_TO_ALL_MES = "7";//群发信息
    String MESSAGE_FILE_MES = "8";//文件消息发送
    String MESSAGE_OFFLINE_FILE_MES = "9";//离线文件消息发送
    String MESSAGE_OFFLINE_CONN_MES = "10";//离线普通信息
}
