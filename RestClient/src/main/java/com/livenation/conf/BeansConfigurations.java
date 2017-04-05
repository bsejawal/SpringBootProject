package com.livenation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeansConfigurations {

	@Bean
	public RestTemplate restTEmplate(){
		return new RestTemplate();
	}
}
