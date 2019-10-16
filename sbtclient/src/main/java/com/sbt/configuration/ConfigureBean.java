package com.sbt.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigureBean {
	
	@Bean
	public RestOperations getRestOperationsBean(ClientHttpRequestFactory reqFactory) {
		return new RestTemplate(reqFactory);
	}

	
	@Bean
	public ClientHttpRequestFactory createClientHttpRequestFactory(@Value("${read.timeout}") int readTimeout,@Value("${connection.timeout}") int connectionTimeout) {
		HttpComponentsClientHttpRequestFactory httpReqFactory = new HttpComponentsClientHttpRequestFactory();
		httpReqFactory.setReadTimeout(readTimeout);
		httpReqFactory.setConnectionRequestTimeout(connectionTimeout);
		return httpReqFactory;
		
	}
}
