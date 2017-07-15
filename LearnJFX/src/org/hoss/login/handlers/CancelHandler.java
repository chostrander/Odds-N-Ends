package org.hoss.login.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Exiting Application..");
		System.exit(0);
		
	}

}
