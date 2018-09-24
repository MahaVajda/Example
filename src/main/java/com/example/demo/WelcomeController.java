package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class WelcomeController {
	
	@RequestMapping("/den/{name}")
	String dobryDen(@PathVariable String name) {
		return "Dobry den pan/pani " + name; 
	}

}
