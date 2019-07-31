package com.gcpdemo.poc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloTestClass {
	private final Logger logger = LoggerFactory.getLogger(HelloTestClass.class);
	
	
	@RequestMapping("/")
	public String helloOk()
	{
		logger.info("This is a from home page");
		return "Calling from / home page";
	}
	
	@RequestMapping("/hello")
public String helloTest()
{
	logger.info("This is a test");
	return "Hello Test";
}
	@RequestMapping("/rest")
	public String helloRest()
	{
		logger.info("Hello from Rest controller");
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8081/hello";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl , String.class);
		return "Rest Response"+response;
	}
}
