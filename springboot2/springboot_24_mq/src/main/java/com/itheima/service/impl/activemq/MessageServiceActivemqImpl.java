package com.itheima.service.impl.activemq;

import com.itheima.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author
 * @version 1.0
 * @date 2024/08/02 13:41
 * @description
 */
//@Service
public class MessageServiceActivemqImpl implements MessageService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单，已纳入处理队列，id："+id);
        jmsMessagingTemplate.convertAndSend("order.queue.id", id);
    }

    @Override
    public String doMessage() {
        String id = jmsMessagingTemplate.receiveAndConvert("order.queue.id", String.class);
        System.out.println("已完成短信发送业务，id："+id);
        return id;
    }
}
