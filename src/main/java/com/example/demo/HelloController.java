package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/{name}")
	String home(@PathVariable String name ) {
		return "Hello " + name;
	}
	
	@RequestMapping("/hello")
	HelloObject hello(@RequestParam(value = "name", defaultValue = "worlddd") String name){
		return new HelloObject(counter.incrementAndGet(), String.format(template, name));
	} 
}
