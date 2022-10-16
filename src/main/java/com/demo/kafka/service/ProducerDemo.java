package com.demo.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerDemo {

    private static final Logger log = LoggerFactory.getLogger(ProducerDemo.class);

    @Value("${spring.kafka.template.default-topic}")
    private static String topic;

    final
    KafkaTemplate<String, String> producerKafkaTemplate; // properties of producer see `application.yml`

    public ProducerDemo(KafkaTemplate<String, String> producerKafkaTemplate) {
        this.producerKafkaTemplate = producerKafkaTemplate;
    }

    /**
     * send data to Kafka topic
     */
    public void sendMessage(String message) {
        log.info("Producing message: {}", message);
        this.producerKafkaTemplate.send(topic, message);
    }
}
