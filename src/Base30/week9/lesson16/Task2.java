package week9.lesson16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Калькулятор");
		primaryStage.setScene(createScene());
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

	public Scene createScene() {
		HBox hBox1 = new HBox(10);
		HBox hBox2 = new HBox(10);
		HBox hBox3 = new HBox(10);
		VBox box = new VBox(15);

		box.getChildren().add(hBox1);
		box.getChildren().add(hBox2);
		box.getChildren().add(hBox3);
	
			
		TextField text1 = new TextField("Введите первое число:");
		TextField text2 = new TextField("+");
		TextField text3 = new TextField("Введите второе число:");

		Button btn1 = new Button("=");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {	
			}
		});
		TextField text4 = new TextField("Сумма");

		hBox1.getChildren().add(text1);
		hBox1.getChildren().add(text2);
		hBox1.getChildren().add(text3);
		hBox2.getChildren().add(btn1);
		hBox3.getChildren().add(text4);

		Scene scene = new Scene(box, 450, 200);
		return scene;

	
	
	}
	
}
