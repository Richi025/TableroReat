package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(
		value= "/status", 
		method = RequestMethod.GET,
		produces = "application/json"
		)
	public String status() {
		return "{\"status\":\"Greetings from Spring Boot. "
		+ java.time.LocalDate.now() + ", "
		+ java.time.LocalTime.now()
		+ ". " + "The server is Runnig!\"}";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	    return String.format("Helloooo %s!", name);
	}

	

	@RequestMapping(
		value= "/helloPost", 
		method = RequestMethod.POST,
		produces = "application/json"
		)
	public String helloPost (@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}