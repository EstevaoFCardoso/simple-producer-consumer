package com.estudos.service

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class StringProducerService(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {
    private val log = LoggerFactory.getLogger(StringProducerService::class.java)

    fun sendMessage(message: String) {
        kafkaTemplate.send("str-topic", message)
    }
}