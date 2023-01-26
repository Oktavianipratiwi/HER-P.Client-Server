package com.okta.pustaka;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




public class PustakaApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
