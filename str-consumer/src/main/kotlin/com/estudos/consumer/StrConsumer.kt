package com.estudos.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class StrConsumer{

    private val log = LoggerFactory.getLogger(StrConsumer::class.java)

    @KafkaListener(topics = ["str-topic"], groupId = "group-1", containerFactory = "strContainerFactory")
    fun listener(message: String) {
        log.info("::: Receive message {}", message)
    }
}
