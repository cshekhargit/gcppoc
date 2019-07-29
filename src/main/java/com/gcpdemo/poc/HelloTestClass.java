package com.gcpdemo.poc;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloTestClass {
	private final Logger logger = LoggerFactory.getLogger(HelloTestClass.class);
	
	@RequestMapping("/hello")
public String helloTest()
{
	logger.info("This is a test");
	return "Hello Test";
}
}
