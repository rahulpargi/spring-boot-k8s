package com.k8.eks.EKS.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics="spring-msk-app", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message Received %s ", message));
    }
}
