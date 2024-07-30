package com.itheima.service;

import com.itheima.domain.SMSCode;

/**
 * @author
 * @version 1.0
 * @date 2024/07/24 16:12
 * @description
 */
public interface SMSCodeService {

    public String sendCodeToSMS(String tele);
    public boolean checkCode(SMSCode smsCode);

}
