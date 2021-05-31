package fragment;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FirstController {
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;

	// Event Listener on Button[#btn1].onAction
	@FXML
	public void event_start_train(ActionEvent event) throws IOException {

		AnchorPane root = FXMLLoader.load(Main.class.getResource("/model/Second.fxml"));
//		AnchorPane anchorPane = new AnchorPane();

//		anchorPane.getChildren().add(tableView);
		// root.getChildren().add(anchorPane);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	// Event Listener on Button[#btn2].onAction
	@FXML
	public void event_join_train(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource("/model/ProgressBar2.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}

	// Event Listener on Button[#btn3].onAction
	@FXML
	public void event_start_predict(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource("/model/Predict.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
}
