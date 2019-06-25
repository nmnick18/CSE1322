import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;  

public class Lab3A extends Application{
   public static void main(String[] args){
   launch(args);
   }
   Button bt, bt2, bt3, bt4, bt5, bt6;
   @Override
   public void start(Stage primaryStage){
   
   FlowPane root = new FlowPane();
   root.setHgap(100);
   root.setVgap(150); 
     
   bt = new Button("Button 1");
   bt2 = new Button("Button 2");
   bt3 = new Button("Button 3");
   bt4 = new Button("Button 4");
   bt5 = new Button("Button 5");
   bt6 = new Button("Button 6");
   
   Handler h = new Handler("button 1 pressed");
   Handler h2 = new Handler("button 2 pressed");
   Handler h3 = new Handler("button 3 pressed");
   Handler h4 = new Handler("button 4 pressed");   
   Handler h5 = new Handler("button 5 pressed");   
   Handler h6 = new Handler("button 6 pressed");   
   
    bt.setOnAction(h);
    bt2.setOnAction(h2);
    bt3.setOnAction(h3);
    bt4.setOnAction(h4);
    bt5.setOnAction(h5);
    bt6.setOnAction(h6);
    
   root.getChildren().addAll(bt, bt2, bt3, bt4, bt5, bt6);
   
   Scene scene = new Scene(root, 600, 300);
   primaryStage.setScene(scene);
   primaryStage.setTitle("Results");
   primaryStage.show();
   
   
   }

}

class Handler implements EventHandler<ActionEvent> {
    String message;
    public Handler(String message) {
        this.message = message;
     String result = message;
    }
    @Override
    public void handle(ActionEvent a) {
        System.out.println(message);
    }

}