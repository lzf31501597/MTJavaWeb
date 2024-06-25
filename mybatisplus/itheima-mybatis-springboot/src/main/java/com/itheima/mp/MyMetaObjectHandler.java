package com.itheima.mp;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/06/24 17:09
 * @description
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * @author
     * @description 插入数据是填充
     * @param metaObject
    **/
    @Override
    public void insertFill(MetaObject metaObject) {
        //先获取pwd的值，再进行判断，如果为空，就进行填充；如果不为空，就不做处理
        Object password = getFieldValByName("password", metaObject);
        if (password == null) {
            setFieldValByName("password", "888888", metaObject);
        }
    }

    /**
     * @author
     * @description 插入数据是填充
     * @param metaObject
    **/
    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
