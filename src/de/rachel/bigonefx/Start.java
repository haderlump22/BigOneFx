package de.rachel.bigonefx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Start extends Application {

	@Override
	public void start(Stage primaryStage) {

		// create VBox for menu
		VBox MenuBox = new VBox();

		// create Stackpane for the Workarea
		StackPane Workarea = new StackPane();

		// create Container for Menu and Workarea
		BorderPane ContainerPane = new BorderPane();
		ContainerPane.setLeft(MenuBox);
		ContainerPane.setCenter(Workarea);
		// create Masterscene
		Scene scene = new Scene(ContainerPane);

		// (4) Fenster konfigurieren und anzeigen
		primaryStage.setTitle("BigOne");
		primaryStage.setScene(scene);
		primaryStage.setHeight(768);
		primaryStage.setWidth(1024);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
