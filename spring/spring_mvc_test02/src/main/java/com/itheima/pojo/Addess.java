package com.itheima.pojo;

/**
 * @author
 * @version 1.0
 * @date 2024/04/17 15:36
 * @Description
 */
public class Addess {

    private String city;
    private String area;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Addess{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
