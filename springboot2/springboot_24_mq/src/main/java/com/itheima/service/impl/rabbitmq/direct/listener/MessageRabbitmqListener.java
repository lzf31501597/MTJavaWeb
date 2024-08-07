package com.itheima.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageRabbitmqListener {

    @RabbitListener(queues = "directQueue" )
    public void receive(String id){
        System.out.println("已完成短信发送业务 rabbitmqListener directQueue，id:"+id);
    }
}
