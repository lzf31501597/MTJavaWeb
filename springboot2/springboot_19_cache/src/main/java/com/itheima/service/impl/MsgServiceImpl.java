package com.itheima.service.impl;

import com.itheima.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author
 * @version 1.0
 * @date 2024/07/23 17:37
 * @description
 */

@Service
public class MsgServiceImpl implements MsgService {

    private HashMap<String, String> cache = new HashMap<String, String>();

    @Override
    public String get(String tele) {
        String code = tele.substring(tele.length() - 6);
        cache.put(tele, code);
        return code;
    }

    @Override
    public boolean check(String tele, String code) {
        String queryCode = cache.get(tele);

        return code.equals(queryCode);
    }
}
