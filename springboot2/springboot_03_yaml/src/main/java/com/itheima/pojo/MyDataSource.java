package com.itheima.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/06/26 15:49
 * @description
 */

 //1，定义数据模型封装yaml文件中对应的数据
 //2，定义为spring管控的bean
 @Component
 //3,指定加载的数据
 @ConfigurationProperties(prefix = "spring.datasource")

public class MyDataSource {

    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
