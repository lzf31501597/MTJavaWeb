package com.itheima.pojo;

import java.util.Arrays;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2024/04/17 15:35
 * @Description
 */
public class User {

    private String username;
    private Integer age;
    private String[] hobbies;
    private Date birthday;
    private Addess address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Addess getAddress() {
        return address;
    }

    public void setAddress(Addess address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
