import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Assignment3 extends Application {

/*The keyboard key values*/
private static final String[][] key_values = {
        { "7", "8", "9", "/" },
        { "4", "5", "6", "*" },
        { "1", "2", "3", "-" },
        { "0", "", "=", "+" }
};

private Button btn[][] = new Button[4][4]; //all the keys
TextField calculator_screen;  //the calculator screen

boolean Equal;
String exp;
int flag=0,repeat=0;
String sample = "0";
String sample2 = "0";
Double num1=0.0,num2=0.0,total=0.0;
Double Num=0.0;
Double temp_sum=0.0;

public static void main(String[] args) 
{ 
    launch(args);
    //System.out.print("123456789");

}


@Override public void start(Stage stage) {

    //The outside layout
   //the size vertically

    final VBox layout = new VBox(30); 
    
    /*The inside layout for keys or buttons*/
    TilePane keypad = new TilePane(); //even it is called keypad, it is a layout
    keypad.setVgap(7);
    keypad.setHgap(7); //set the gap between keys


    /*Create Calculator Screen */
    calculator_screen =  new TextField();
    calculator_screen.setAlignment(Pos.CENTER_RIGHT); //make the screen in the center of the calculator
    calculator_screen.setEditable(false); //make sure the screen cannot be typed in manually
    calculator_screen.setPrefWidth(700); //set the windth of the screen

    /*Create Calculator keyboard*/
    keypad.setPrefColumns(key_values[0].length); 
    
    //set the preferred number of columns
    for (int i = 0; i < 4; i++) 
    {
        for (int j = 0; j < 4; j++) 
        {
            btn[i][j] = new Button(key_values[i][j]);
            final int x = i;
            final int y = j;

            /*Add button event*/
            btn[i][j].setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    if(Equal){
                        calculator_screen.clear();
                        Equal = false;
                    }
                    calculator_screen.appendText(key_values[x][y]);
                    exp = calculator_screen.getText().toString();

                }

        }

                    );

            keypad.getChildren().add(btn[i][j]);
        }
}
//create the action for =
    /*  btn[3][2].setOnAction(new EventHandler<ActionEvent>()
      {
      
         );
      */

    //Put the calculator screen and keypad into a VBox layout
    layout.setAlignment(Pos.CENTER);
    layout.getChildren().addAll(calculator_screen, keypad);
    calculator_screen.prefWidthProperty().bind(keypad.widthProperty());
    
    stage.setTitle("Calculator");
    stage.initStyle(StageStyle.UTILITY);
    stage.setResizable(false);
    Scene scene = new Scene(layout);
    stage.setScene(scene);
    stage.show();
}
}