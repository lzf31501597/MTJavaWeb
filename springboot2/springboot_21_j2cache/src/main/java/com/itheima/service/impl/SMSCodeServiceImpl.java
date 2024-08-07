package com.itheima.service.impl;


import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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

    @Autowired
    private CacheChannel cacheChannel;

    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        cacheChannel.set("sms", tele, code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {

        String code = cacheChannel.get("sms", smsCode.getTele()).asString();

        return smsCode.getCode().equals(code);
    }

}
