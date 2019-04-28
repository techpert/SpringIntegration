package com.infogain.SpringIntegration.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.SpringIntegration.channels.inputchannel.DemoInputChannel;
import com.infogain.SpringIntegration.channels.outputchannels.DemoOutputChannel;
import com.infogain.SpringIntegration.serviceActivator.DemoServiceActivator;

@RestController
public class DemoEndPoint {
	
@Autowired
DemoServiceActivator demoServiceActivator;
	@GetMapping(value = "/activate")
	public String getMessage(String message) {
		demoServiceActivator.activate(message);
		return message;
	
	}

	@GetMapping(value = "/receive")
	public String getMessage() {
		demoServiceActivator.activate(message);
		return message;
	
	}
}
