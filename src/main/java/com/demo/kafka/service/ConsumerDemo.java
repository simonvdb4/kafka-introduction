package com.demo.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerDemo {
    private static final Logger log = LoggerFactory.getLogger(ConsumerDemo.class);

    @KafkaListener(topics = "#{'${spring.kafka.template.default-topic}'}", groupId = "group_id") // groupId = consumer group id
    public void consumeMessage(String message) {
        log.info("Consumed message: {}", message);
    }
}
