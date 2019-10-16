package com.sbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import com.sbt.model.LocationTimeOutVO;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SbtclientApplication implements CommandLineRunner{
	
	@Autowired
	private RestOperations operations;
	
	@Value("${rest.url}")
	private String url;

	public static void main(String[] args) {
		SpringApplication.run(SbtclientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	
		ResponseEntity<List<LocationTimeOutVO>> response = operations.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<LocationTimeOutVO>>(){});
		List<LocationTimeOutVO> locationTimeOutVO = response.getBody();
		
		System.out.println(locationTimeOutVO);
		
		
/*		LocationTimeOutList respList = restTemplate.getForObject(url, LocationTimeOutList.class);
		List<LocationTimeOutVO> locationList = respList.getLocationList();
		System.out.println(locationList);
*/	
	}

}
