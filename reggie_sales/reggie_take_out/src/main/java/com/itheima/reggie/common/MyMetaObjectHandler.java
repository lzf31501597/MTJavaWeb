package com.itheima.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author ＄{USER}
 * @version 1.0
 * @date 2024/06/06 16:53
 * @Description 自定义元数据处理器
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * @Author
     * @Description 插入操作，自动填充
     * @Date
     * @Param metaObject
     * @Return
    **/
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充 insertFill。。。");
        log.info(metaObject.toString());

        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("createUser", BaseContext.getCurrentId());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());

    }

    /**
     * @Author
     * @Description 更新操作，自动填充
     * @Date
     * @Param metaObject
     * @Return
    **/
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充 updateFill。。。");
        log.info(metaObject.toString());

        Long id = Thread.currentThread().getId();
        log.info("线程id：{}" + id);

        Long loginId = BaseContext.getCurrentId();
        log.info("登录操作Id：{}" + loginId);


        metaObject.setValue("updateTime", LocalDateTime.now());
        //metaObject.setValue("updateUser", new Long(1));
        metaObject.setValue("updateUser", BaseContext.getCurrentId());

    }
}
