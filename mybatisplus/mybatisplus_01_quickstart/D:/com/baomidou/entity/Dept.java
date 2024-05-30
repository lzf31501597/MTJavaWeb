package com.baomidou.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2024-05-29
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer deptno;

    private String dname;

    private String loc;


    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "deptno=" + deptno +
        ", dname=" + dname +
        ", loc=" + loc +
        "}";
    }
}
