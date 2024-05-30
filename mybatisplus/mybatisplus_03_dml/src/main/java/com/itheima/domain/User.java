package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author
 * @version 1.0
 * @date 2024/05/28 18:04
 * @Description
 */

// lombok
/*@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode*/
@Data
//@TableName("mybatisplus_user")
public class User {
    //@TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "pwd", select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;

    //逻辑删除字段，记录数据是否逻辑删除
    //@TableLogic(value = "0", delval = "1")
    private Integer deleted;
    @Version
    private Integer version;


}
