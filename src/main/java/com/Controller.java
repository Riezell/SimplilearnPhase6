package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/")
	public String guest() {
		return "Welcome to Amsterdam"; 
	}
	@GetMapping(value = "say/ {name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to Heineken Experience "+name; 
	}

}
