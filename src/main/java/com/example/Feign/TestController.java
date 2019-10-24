package com.example.Feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class TestController {

	@GetMapping("/hello/{name}")
	public String sayHelloUser(@PathVariable String name) {
		return "Hello, " + name;
	}
}
