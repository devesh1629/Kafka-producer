package com.example.project;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic newTopic() {
        return new NewTopic("devesh-topic-2", 7, (short) 1);
    }
}
