package com.itheima.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.itheima.reggie.common.R;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author
 * @version 1.0
 * @date 2024/06/04 12:36
 * @Description グローバル異常な処理
 */


@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GloablExceptionHandler {

   /**
    * @Author
    * @Description グローバル例外処理メソッド
    * @Date 16:30 2024/06/04
    * @param exception
    * @return
   **/
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException exception){
        log.error(exception.getMessage());

        if (exception.getMessage().contains("Duplicate entry")) {
            String[] split = exception.getMessage().split(" ");
            String msg = split[2] + "用户已存在！！！";
            return R.error(msg);
        }
        
        return R.error("不能插入重复数据！！！");
    }

    /**
     * @Description カスタム例外処理
     * @param exception
     * @return
     **/
    @ExceptionHandler(CustomException.class)
    public R<String> exceptionHandler(CustomException exception){
        log.error(exception.getMessage());

        return R.error(exception.getMessage());
    }

}
