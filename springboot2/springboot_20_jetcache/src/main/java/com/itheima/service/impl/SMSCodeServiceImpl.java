package com.itheima.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

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
    //1-jetcache缓存
    //remote
    //@CreateCache(area = "sms",name = "jetCache_", expire = 10, timeUnit = TimeUnit.SECONDS)
    //local  , cacheType = CacheType.LOCAL
    @CreateCache(name = "jetCache_", expire = 100, timeUnit = TimeUnit.SECONDS, cacheType = CacheType.LOCAL)
    private Cache<String, String> jetcache;


    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        jetcache.put(tele, code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {

        String code = jetcache.get(smsCode.getTele());

        return smsCode.getCode().equals(code);
    }



    //2-xmemcached缓存
    /* @Autowired
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
    } */
}
