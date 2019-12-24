package com.mashibing.boot.com.mashibing.boot.rocketmq;

import rocketmq.consumer.RocketMqConsumer;
import rocketmq.productor.RocketMqProducer;

public class MqMainClass {
    public static void main(String[] args) throws Exception {
       RocketMqProducer.startProducer();
        RocketMqConsumer.startConsumer();
        for(;;){
            byte [] msgs=new byte[1024];
           System.in.read(msgs);
            RocketMqProducer.sendMsg(new String(msgs));
        }

    }
}
