//Nikhil Malani
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.stage.Stage;
import javafx.scene.Group;  
import javafx.scene.text.Text; 
import javafx.scene.layout.GridPane;

public class Lab3B extends Application{

public static void main(String[] args){
launch(args);
}
   
   @Override
   public void start(Stage primaryStage){
    //create new gridpane
    GridPane gp = new GridPane();
      // create a textfield for two numbers and a summation button
      //create text to show where it is located
    Text txt1 = new Text("Number 1: ");
    Text txt2 = new Text("Number 2: ");
    Text summation = new Text("Sum Button: \0");
    Text txt3 = new Text("Result: ");
    TextField number1 = new TextField();
    TextField number2 = new TextField();
    Button bt1 = new Button("\0 Sum \0");
    TextField result = new TextField();

      //add the objects into the gridpane layout and then set the location by the rows and columns
    gp.add(txt1, 0, 0);
    gp.add(txt2, 0, 1);
    gp.add(summation, 0, 2);
    gp.add(txt3, 0, 3);
    gp.add(number1, 1, 0);
    gp.add(number2, 1, 1);
    gp.add(result, 1, 3);
    gp.add(bt1, 1, 2);
    //create the action that the button with implement
    //also create a if else statment seeing what would happen if nothing is passed through
    //number 1 and number 2
   bt1.setOnAction(e -> {
   if(number1.getText().equals("") || number2.getText().equals("")){
   result.setText("Not valid!");
   }
   else{
    int sum = Integer.parseInt(number1.getText())+Integer.parseInt(number2.getText());
    result.setText(String.valueOf(sum));
   }
   });
   
   //set the scene, with the width and height
    Scene scene = new Scene(gp, 300, 150);
   //Display the layout
    primaryStage.setTitle("  Add two Integers ");
    primaryStage.setScene(scene);
    primaryStage.show();
   
   }





}