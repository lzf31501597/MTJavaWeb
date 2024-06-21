package com.itheima.mp.simple.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @version 1.0
 * @date 2024/06/18 15:10
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("tb_user")
public class User{
    //@TableId(value = "id", type = IdType.AUTO)
    private int id;
    @TableField(value = "username")
    private String name;
    private String password;


}