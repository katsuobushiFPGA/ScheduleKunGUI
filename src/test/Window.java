package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window extends Application{


		@Override
		public void start(Stage stage) throws IOException {
			stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
					"layout.fxml"))));
			stage.show();
		}

}
/*
	@Override
	public void start(Stage primaryStage) {
	    primaryStage.setTitle("Text Generator");
	    BorderPane borderPane = new BorderPane();
	    Label topLabel = new Label("スケジュール君(仮)補助ツール");
	    topLabel.setLayoutX(12);
	    topLabel.setLayoutY(100);
	    borderPane.setTop(topLabel);

	    GridPane semaphorePane = new GridPane();

	    Label permitsLabel = new Label("利用可能な許可数:");
	    semaphorePane.add(permitsLabel, 0, 0);


	    TextField permitsField = new TextField();
	    semaphorePane.add(permitsField, 1, 0);

	    Button tryButton = new Button("Try acquire");
	    semaphorePane.add(tryButton, 0, 1);

	    TextField resultField = new TextField();
	    semaphorePane.add(resultField, 1, 1);

	    Button releaseButton = new Button("Release");
	    semaphorePane.add(releaseButton, 0, 2);

	    borderPane.setCenter(semaphorePane);

	    primaryStage.setScene(new Scene(borderPane, 600, 400));
	    primaryStage.show();
	}*/
