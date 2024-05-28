package com.itheima.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author
 * @version 1.0
 * @date 2024/05/27 15:10
 * @Description
 */

@Component
@ConfigurationProperties("enterprise")
public class Enterprise {

    private Integer age;
    private String name;
    private String tel;
    private String[] subject;

    @Override
    public String toString() {
        return "Enterprise{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
}
