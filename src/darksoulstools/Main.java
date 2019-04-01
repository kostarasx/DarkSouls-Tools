package darksoulstools;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;


/**
 * The main class of the app<br>
 * Show the the window and the first scene of the app<br>
 * Control the setting of the app
 * @author Kostas Chasapis
 *
 */
public class Main extends Application {

	public static Stage primaryStage;
	public final static double VOLUME = 1;
	
	/**
	 * The function that loads the window and the welcome scene of the app<br>
	 * The windows app cant be resizable
	 * @param primaryStage The windows app
	 * @author Kostas Chasapis
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Dark Souls Tools");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		AnchorPane welcomeLayout = loader.load();
		Scene welcomeScene = new Scene(welcomeLayout);
		Main.primaryStage.setScene(welcomeScene);
		Main.primaryStage.setResizable(false);
		Main.primaryStage.show();
	}

	/**
	 * The main function
	 * @param args Arguments given to program when launching
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
