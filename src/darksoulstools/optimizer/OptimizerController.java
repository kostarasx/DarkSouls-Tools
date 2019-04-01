package darksoulstools.optimizer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class OptimizerController implements Initializable { 

	@FXML
	private RadioButton ds1RadioBtn;
	@FXML
	private RadioButton ds2RadioBtn;
	@FXML
	private RadioButton ds3RadioBtn;
	
	@FXML
	public void radioSelected(ActionEvent event) throws IOException{
		if (ds1RadioBtn.isSelected()) {
			Parent ds1Menu = FXMLLoader.load(getClass().getResource("/darksoulstools/optimizer/DS1Optimizer.fxml"));
			Scene ds1Scene = new Scene(ds1Menu);
			
			//This line gets the Stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

			window.setScene(ds1Scene);
			window.show();
		}
		else if (ds2RadioBtn.isSelected()) {
			System.out.println("2");
		}
		else if (ds3RadioBtn.isSelected()) {
			Parent ds3Menu = FXMLLoader.load(getClass().getResource("/darksoulstools/optimizer/DS3Optimizer.fxml"));
			Scene ds3Scene = new Scene(ds3Menu);
			
			//This line gets the Stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

			window.setScene(ds3Scene);
			window.show();
			
		}
	}
	@FXML
	public void backBtnClicked(ActionEvent event) throws IOException{	
		Parent mainMenu = FXMLLoader.load(getClass().getResource("/darksoulstools/mainmenu/MainMenu.fxml"));
		Scene mainMenuScene = new Scene(mainMenu);

		//This line gets the Stage information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(mainMenuScene);
		window.show();
	}

	@FXML
	public void extiBtnClicked(ActionEvent event) throws IOException
	{
		Platform.exit();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
