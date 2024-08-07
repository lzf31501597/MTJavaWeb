package com.itheima.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageRabbitmqListener2 {

    @RabbitListener(queues = "directQueue2" )
    public void receive(String id){
        System.out.println("已完成短信发送业务 rabbitmqListener22 directQueue，id:"+id);
    }
}
