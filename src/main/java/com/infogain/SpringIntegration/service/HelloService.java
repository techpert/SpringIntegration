package com.infogain.SpringIntegration.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	
	public HelloService() {
	}

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
