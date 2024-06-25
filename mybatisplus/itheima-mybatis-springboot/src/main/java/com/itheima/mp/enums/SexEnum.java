package com.itheima.mp.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author
 * @version 1.0
 * @date 2024/06/25 10:26
 * @description
 */
public enum SexEnum implements IEnum<Integer> {

    MAN(1,"男"),
    WOMAN(2, "女");

    private int value;
    private String desc;

    @Override
    public Integer getValue() {
        return this.value;
    }

    SexEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }


}
