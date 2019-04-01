package darksoulstools.view;


import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import darksoulstools.Main;
import darksoulstools.Soundtrack;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * The controller class of the Welcome scene<br>
 * Control the actions of the scene<br>
 * @author Kostas Chasapis
 *
 */
public class MainViewController implements Initializable{

	public static Soundtrack theme;

	/**
	 * When the user click anywhere to the screen the scene changes to Main Menu Scene
	 * @param event 
	 * @throws IOException
	 */
	@FXML
	public void mouseClicked(MouseEvent event) throws IOException
	{

		Parent mainMenu = FXMLLoader.load(getClass().getResource("/darksoulstools/mainmenu/MainMenu.fxml"));
		Scene mainMenuScene = new Scene(mainMenu);
		Main.primaryStage.setScene(mainMenuScene);
	}

	/**
	 * When the press a button anywhere to the screen the scene changes to Main Menu Scene
	 * @param event Keyboard press event
	 * @throws IOException
	 */
	@FXML
	public  void keyPressed(KeyEvent event) throws IOException {
		Parent mainMenu = FXMLLoader.load(getClass().getResource("/darksoulstools/mainmenu/MainMenu.fxml"));
		Scene mainMenuScene = new Scene(mainMenu);
		Main.primaryStage.setScene(mainMenuScene);
		
	}
	
	/**
	 * When the fxml filed loads call the soundtrack class to play the theme
	 * @author Kostas Chasapis
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theme = new Soundtrack();
		theme.playSoundtrack("/music/welcomemenu.mp3");
		
	}
}
