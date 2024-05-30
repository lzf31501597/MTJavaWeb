package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2024-05-29
 */
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String className;

    private String address;

    private Integer monitor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMonitor() {
        return monitor;
    }

    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Class{" +
        "id=" + id +
        ", className=" + className +
        ", address=" + address +
        ", monitor=" + monitor +
        "}";
    }
}
