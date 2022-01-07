package com.example.kafkacluster.Week5.KafkaCluster.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics="mytopic",groupId="mygroup")
	public void consumeFromTopic(String message) {
	System.out.println("Consumed message"+message);
	}
}
