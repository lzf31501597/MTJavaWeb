package com.itheima.utils;

import com.itheima.service.BookService;
import com.itheima.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/07/24 17:47
 * @description
 */
@Component
public class CodeUtils {

    private  String[] patchCode = {"000000", "00000", "0000", "000", "00", "0", ""};

    /* @Autowired
    private SMSCodeService smsCodeService; */

    public String generator(String tele){
        int hashCode = tele.hashCode();

        int encryption = 20206666;
        long result = hashCode ^ encryption;

        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;

        long code  = result % 1000000;
        code = code < 0 ? -code : code;

        String codeStr = code + "";
        int len = codeStr.length();

        return patchCode[len] + codeStr;

    }

    /* public static void main(String[] args) {
         *//* String generator = new CodeUtils().generator("18866668888");
        System.out.println(generator); *//*

        System.out.println(new CodeUtils().generator("18866668888"));
    } */

    @Cacheable(value = "smsCode", key = "#tele")
    public String get(String tele){
        //String cacheCode = smsCodeService.sendCodeToSMS(tele);

        return null;
    }
}
