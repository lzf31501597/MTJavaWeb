package com.itheima.domain;

import lombok.*;

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
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;


}
