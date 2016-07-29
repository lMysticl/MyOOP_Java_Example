package week9.lesson16;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task3 extends Application{

 @Override
 public void start(Stage primaryStage) throws Exception {
  primaryStage.setTitle("MY APPLICATION");
  primaryStage.setScene(createScene1());
  primaryStage.show();  
 }
 public static void main(String[] args) {
  launch(args);
 }

 public Scene createScene1(){
  Group root = new Group();
  //
  Label label1 = new Label("Comment 1");
  label1.setLayoutX(5);
  label1.setLayoutY(14);
  //
  Button button1 = new Button("Button 1");
  button1.setLayoutX(80);
  button1.setLayoutY(10);
  //
  Button button2 = new Button("Button 2");
  button2.setLayoutX(80);
  button2.setLayoutY(50);  
  button2.setMaxWidth(100);
  //
  TextField text = new TextField();
  text.setLayoutX(20);
  text.setLayoutY(80);
  text.setMinWidth(80);
  //
  root.getChildren().add(label1);
  root.getChildren().add(button1);
  root.getChildren().add(button2);
  root.getChildren().add(text);
  //  
  Scene scene = new Scene(root, 800, 600);
  return scene;
 }
 public Scene createScene2(){
  GridPane grid = new GridPane();
  grid.setAlignment(Pos.BOTTOM_CENTER);
  grid.setHgap(20);
  grid.setVgap(10);
  grid.setPadding(new Insets(25, 25, 25, 25));
  //  
  Button button1 = new Button("Button 1");
  Button button2 = new Button("Button 2");
  Button button3 = new Button("Button 3");
  Button button4 = new Button("Button 4");
  //
  grid.add(button1, 0, 0);
  grid.add(button2, 2, 1);
  grid.add(button3, 1, 0);
  grid.add(button4, 1, 1);
  
  //  
  Scene scene = new Scene(grid, 600, 400);
  return scene;
 }
 public Scene createScene3(){
  HBox hBox = new HBox(30);//10

  Button btn1 = new Button("Button 1");
  Button btn2 = new Button("Button 2");
  Button btn3 = new Button("Button 3");
  Button btn4 = new Button("Button 4");
  
  hBox.setStyle("-fx-border:5px solid #ed1c24");
  
  hBox.setAlignment(Pos.TOP_RIGHT);
  hBox.getChildren().add(btn1);
  hBox.getChildren().add(btn2);
  hBox.getChildren().add(btn3);
  hBox.getChildren().add(btn4);
  //  
  Scene scene = new Scene(hBox, 600, 400);
  return scene;
 }
 public Scene createScene4(){
  VBox vBox = new VBox(20);//10

  Button btn1 = new Button("Button 1");
  Button btn2 = new Button("Button 2");
  Button btn3 = new Button("Button 3");
  Button btn4 = new Button("Button 4");
  
  vBox.setAlignment(Pos.TOP_CENTER);
  vBox.getChildren().add(btn1);
  vBox.getChildren().add(btn2);
  vBox.getChildren().add(btn3);
  vBox.getChildren().add(btn4);
  //  
  Scene scene = new Scene(vBox, 600, 400);
  return scene;
 } 
 
 @SuppressWarnings("unchecked")
 
public Scene createScene5(){
  GridPane grid = new GridPane();
  grid.setAlignment(Pos.CENTER);
  grid.setHgap(20);
  grid.setVgap(10);
  grid.setPadding(new Insets(25, 25, 25, 25));
  //
  Button btn1 = new Button("Button 1");
  Button btn2 = new Button("Button 2");
  //
  
  @SuppressWarnings("rawtypes")
  
class MyEvent<T> implements EventHandler{
   String name;
   public MyEvent(String n){
    name = n;
   }
   @Override
   public void handle(Event event) {
    if(btn1==event.getSource())System.out.println("btn1");
    System.out.println(name);
    
   }
  }
  btn1.setOnAction(new MyEvent<ActionEvent>("1"));
  btn2.setOnAction(new MyEvent<ActionEvent>("2"));
  
  //
  grid.add(btn1,0,0);
  grid.add(btn2,1,0);
  //  
  Scene scene = new Scene(grid, 600, 400);
  return scene;
 }
}
