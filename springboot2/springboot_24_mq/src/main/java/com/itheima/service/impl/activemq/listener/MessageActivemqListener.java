package com.itheima.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class MessageActivemqListener {

    @JmsListener(destination = "order.queue.id")
    @SendTo(value = "order.other.queue.id" )
    public String recevie(String id){
        System.out.println("order.queue.id 已完成短信发送业务，id:"+id);
        return "new:"+id;
    }

    @JmsListener(destination = "order.other.queue.id")
    public String recevieOther(String id){
        System.out.println("order.other.queue.id 已完成短信发送业务，id:"+id);
        return "new:"+id;
    }
}
