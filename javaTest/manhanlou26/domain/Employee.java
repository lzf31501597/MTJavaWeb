package com.javaTest.manhanlou26.domain;

/**
 * @author
 * @version 1.0
 * @date 2023/12/08 17:49
 * @Description
 * id int primary key auto_increment, #自增
 * empId varchar(50) unique not null default '',#员工号
 * pwd char(32) not null default '',#密码md5
 * name varchar(50) not null default '',#姓名
 * job varchar(50) not null default '' #岗位
 */
public class Employee {

    private Integer id;
    private String empid;
    private String pwd;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(Integer id, String empid, String pwd, String name, String job) {
        this.id = id;
        this.empid = empid;
        this.pwd = pwd;
        this.name = name;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
