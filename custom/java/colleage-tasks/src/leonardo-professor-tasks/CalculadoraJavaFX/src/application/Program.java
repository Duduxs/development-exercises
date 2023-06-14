package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Program extends Application {

	private static Stage stage;
	private static Scene scene;
	

	@Override
	public void start(Stage primaryStage) {
		try {
			Program.stage = primaryStage;
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));
			scene = new Scene(parent, Color.TRANSPARENT);
			removeBar();
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Stage getStage() {
		return stage;
	}

	public static Scene getScene() {
		return scene;
	}

	public static void main(String[] args) {

		launch(args);
	}

	public void removeBar() {
		stage.resizableProperty().setValue(Boolean.FALSE);
		stage.initStyle(StageStyle.UTILITY);
		stage.initStyle(StageStyle.UNDECORATED);
	}

}