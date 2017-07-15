package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {
	
	@FXML private PasswordField passwordField;
	
	@FXML private TextField userField;
	
	@FXML private Text actiontarget;
	
	@FXML protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign In pressed");
		System.out.println("Username : "+userField.getText());
	}

	
}
