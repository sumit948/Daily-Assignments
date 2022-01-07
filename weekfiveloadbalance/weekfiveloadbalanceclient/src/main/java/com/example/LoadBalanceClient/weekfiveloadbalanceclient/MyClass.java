package com.example.LoadBalanceClient.weekfiveloadbalanceclient;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Mono;

public class MyClass {
	@Autowired
    private WebClient.Builder webClientBuilder;
    public Mono<String> doOtherStuff() {
        return webClientBuilder.build().get().uri("http://stores/stores").retrieve().bodyToMono(String.class);
    }
}
