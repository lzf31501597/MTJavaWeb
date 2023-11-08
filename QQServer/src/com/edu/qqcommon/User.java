package com.edu.qqcommon;

import java.io.Serializable;

/**
 * @author
 * @version 1.0
 * @date 2023/11/04 16:58
 * @Description 用户账号信息
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId; //账号
    private String pwd;//账号密码

    public User(String userId, String pwd) {
        this.userId = userId;
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
