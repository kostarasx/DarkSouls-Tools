package darksoulstools.mainmenu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import darksoulstools.Main;
import darksoulstools.view.MainViewController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
/**
 * The controller class of the Main Menu scene<br>
 * Control the buttons of the scene<br>
 * @author Kostas Chasapis
 *
 */
public class MainMenuController  implements Initializable {

	@FXML
	/**
	 * When optimizer button selected open the Optimizer scene
	 * @param event Then action event of the button. Show when the button is clicked
	 * @throws IOException
	 */
	public void optimizerBtnClicked(ActionEvent event) throws IOException {
		Parent welcomeMenu = FXMLLoader.load(getClass().getResource("/darksoulstools/optimizer/OptimizerTool.fxml"));
		Scene welcomeMenuScene = new Scene(welcomeMenu);
		Main.primaryStage.setScene(welcomeMenuScene);
	}


	@FXML
	/**
	 * When back button selected return to welcome scene of the app<br>
	 * Stop the music  so can start from the start
	 * @param event Then action event of the button
	 * @throws IOException
	 */
	public void backBtnClicked(ActionEvent event) throws IOException{	
		MainViewController.theme.stopSoundtrack();
		Parent welcomeMenu = FXMLLoader.load(getClass().getResource("/darksoulstools/view/MainView.fxml"));
		Scene welcomeMenuScene = new Scene(welcomeMenu);
		Main.primaryStage.setScene(welcomeMenuScene);
		//MainViewController.theme.playSoundtrack("/music/welcomemenu.mp3");
	}

	@FXML
	/**
	 * When exit button selected close the app
	 * @param event Then action event of the button
	 * @throws IOException
	 */
	public void extiBtnClicked(ActionEvent event) throws IOException{
		Platform.exit();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
