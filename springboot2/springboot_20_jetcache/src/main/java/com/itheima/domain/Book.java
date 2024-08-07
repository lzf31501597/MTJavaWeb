package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * @version 1.0
 * @date 2024/06/26 17:13
 * @description
 */
//@TableName(value = "tb_book")
@Data
public class Book implements Serializable {
    private Integer id;
    private String type;
    private String name;
    private String description;

   /*  @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } */
}
