package com.estudos.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaAdminConfig(
    private val properties: KafkaProperties
) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val configs = mapOf(
            AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG to properties.bootstrapServers
        )
        return KafkaAdmin(configs)
    }

    @Bean
    fun topics(): KafkaAdmin.NewTopics {
        return KafkaAdmin.NewTopics(
            TopicBuilder.name("str-topic").partitions(2).replicas(1).build()
        )
    }
}