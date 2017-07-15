package org.hoss.login.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class LoginHandler implements EventHandler<ActionEvent> {
	private Text actiontarget;
	
	public LoginHandler(Text actiontarget) {
		super();
		this.actiontarget = actiontarget;
	}

	@Override
	public void handle(ActionEvent event) {
		//this is now done in CSS
		//actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign in button pressed");
		
	}

}
