package org.hoss.helloworld.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HelloWorldHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello World to you!");
		
	}

}
