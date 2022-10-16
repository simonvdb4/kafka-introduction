package com.demo.kafka.controller;

import com.demo.kafka.service.ProducerDemo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final ProducerDemo producerDemo;

    public KafkaController(ProducerDemo producerDemo) {
        this.producerDemo = producerDemo;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producerDemo.sendMessage(message);
    }
}
