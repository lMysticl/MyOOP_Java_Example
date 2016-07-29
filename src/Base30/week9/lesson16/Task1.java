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

public class Task1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My first app");
		primaryStage.setScene(createScene1());
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private TextField text2 = new TextField("Текст");

	public Scene createScene1() {
		HBox box = new HBox(10);

		Button btn1 = new Button("кнопочка 1");
		Button btn2 = new Button("кнопочка 2");
		TextField text = new TextField("Текст");

		box.getChildren().add(btn1);
		box.getChildren().add(btn2);
		box.getChildren().add(text);
		box.getChildren().add(text2);

		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("btn1");
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				text2.setText("btn2");
			}
		});
		Scene scene = new Scene(box, 500, 400);
		return scene;
	}

	public Scene createScene2() {

		HBox hBox1 = new HBox(10);
		HBox hBox2 = new HBox(20);
		VBox mainBox = new VBox(20);

		mainBox.getChildren().add(hBox1);
		mainBox.getChildren().add(hBox2);

		Button btn1 = new Button("кнопочка 1");
		Button btn2 = new Button("кнопочка 2");
		//////////////////////// hBox1

		hBox1.getChildren().add(btn1);
		hBox1.getChildren().add(btn2);
		//////////////////////// hBox2
		Button btn3 = new Button("кнопочка 3");
		Button btn4 = new Button("кнопочка 4");

		hBox2.getChildren().add(btn3);
		hBox2.getChildren().add(btn4);
		Scene scene = new Scene(mainBox, 300, 200);
		return scene;
	}
}