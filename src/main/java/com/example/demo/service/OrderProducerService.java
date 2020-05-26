package com.example.demo.service;

import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * 生产者,发送消息
 * @author perdant
 */
@Service
public class OrderProducerService {
    @Value("${kafka.topic.my-topic}")
    private String myTopic;
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(Order order) {
        kafkaTemplate.send(myTopic,order);
    }
}
