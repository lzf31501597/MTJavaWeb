package com.itheima.domain;

/**
 * @author
 * @version 1.0
 * @date 2024/05/17 17:25
 * @Description
 */
public class Book {

    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 价格=" + price +
                '}';
    }
}
