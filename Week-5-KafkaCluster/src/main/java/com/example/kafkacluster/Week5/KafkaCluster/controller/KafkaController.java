package com.example.kafkacluster.Week5.KafkaCluster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkacluster.Week5.KafkaCluster.Service.Producer;

@RestController
public class KafkaController {
	@Autowired
	Producer prod;
	
	@PostMapping("/post")
	public void sendMessage(@RequestParam("msg") String msg) {
		prod.publishToTopic(msg);
	}
}
