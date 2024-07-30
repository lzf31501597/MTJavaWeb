package com.itheima.service.impl;

import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

/**
 * @author
 * @version 1.0
 * @date 2024/07/24 17:40
 * @description
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;



    //1-redis,ehcache缓存

    /* @Override
    //@Cacheable(value = "smsCode", key = "#tele")
    @CachePut(value = "smsCode", key = "#tele")
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {

        String code = smsCode.getCode();
        String cacheCode = codeUtils.get(smsCode.getTele());

        return code.equals(cacheCode);
    } */

    /* @Cacheable(value = "smsCode", key = "#tele")
    public String get(String tele){
        String cacheCode = sendCodeToSMS(tele);

        return cacheCode;
    } */

    //2-xmemcached缓存
    @Autowired
    private MemcachedClient memcachedClient;

    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        try {
            memcachedClient.set(tele, 10, code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }


    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = null;
        try {
            code = memcachedClient.get(smsCode.getTele().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smsCode.getCode().equals(code);
    }
}
