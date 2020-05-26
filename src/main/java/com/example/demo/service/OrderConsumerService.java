package com.example.demo.service;

import com.example.demo.controller.OrderController;
import com.example.demo.pojo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * 消费者，接收消息
 * @author perdant
 */
@Service
public class OrderConsumerService {
    @Value("${kafka.topic.my-topic}")
    private String myTopic;
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @KafkaListener(topics = {"${kafka.topic.my-topic}"}, groupId = "group1")
    public void consumeMessage(Order order) {
        logger.info("消费者消费{}的消息 -> {}", myTopic, order.toString());
    }
}
