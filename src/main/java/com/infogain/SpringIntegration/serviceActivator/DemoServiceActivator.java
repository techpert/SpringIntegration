package com.infogain.SpringIntegration.serviceActivator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import com.infogain.SpringIntegration.channels.inputchannel.DemoInputChannel;
import com.infogain.SpringIntegration.channels.outputchannels.DemoOutputChannel;
@Component

public class DemoServiceActivator {
	@Autowired
	DemoInputChannel demoInputChannel;
	@Autowired
	DemoOutputChannel demoOutputChannel;
	@ServiceActivator(inputChannel = "demoInputChannel", outputChannel = "demoOutputChannel" )
	public void activate(String message)
	{
		try {
			demoInputChannel.send(new GenericMessage<String>(message),0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return (String) demoOutputChannel.receive(0).getPayload();

	}
	
}
