package com.gcpdemo.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestClass {
	@RequestMapping("/hello")
public String helloTest()
{
	return "Hello Test";
}
}
