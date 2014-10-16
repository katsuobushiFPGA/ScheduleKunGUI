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
			stage.setTitle("ScheduleKun(KARI) Sub Tool");
			stage.show();
		}
}
