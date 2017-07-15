package org.hoss.login;

import org.hoss.login.handlers.CancelHandler;
import org.hoss.login.handlers.LoginHandler;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Login Please");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid,400,275);
		primaryStage.setScene(scene);
		scene.getStylesheets().add
		 (Login.class.getResource("Login.css").toExternalForm());
		
		Text scenetitle = new Text("Welcome");
		//For CSS
		scenetitle.setId("welcome-text");
		//this is now down in CSS
		//scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);	
		grid.add(hbBtn, 1, 4);
		
		Button exitBtn = new Button("Cancel");
		HBox hbExit = new HBox(10);
		exitBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbExit.getChildren().add(exitBtn);	
		
		final Text actiontarget = new Text();
		//for CSS
		actiontarget.setId("actiontarget");
		
        grid.add(actiontarget, 1, 6);
        
		exitBtn.setOnAction(new CancelHandler());
		exitBtn.setCancelButton(true);
		
		btn.setOnAction(new LoginHandler(actiontarget));
		grid.add(hbExit, 0, 4);
		
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
