package com.itheima.mp.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.itheima.mp.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
//@KeySequence(value = "SEQ_USER", clazz = Long.class)
public class User extends Model<User> implements Serializable {
    //@TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField(value = "username")
    private String name;
    private int age;
    //查询时不返回该字段值，插入数据时进行填充
    @TableField(select = false, fill = FieldFill.INSERT)
    private String password;
    @TableField(value = "email")
    private String email;
    @TableField(exist = false)
    private String address;
    private String user_name;

    @Version //乐观锁的版本字段
    private int version;

    @TableLogic //逻辑删除字段。1-删除，2-未删除
    private Integer deleted;

    private SexEnum sex;


}
