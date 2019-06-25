// Main.java

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Insets;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.FlowPane;

public class Main extends Application {

    //using correct method name; before it was star() and not start(). Fixed it

    @Override

    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane();

        root.setHgap(10);

        root.setVgap(10);

        root.setPadding(new Insets(25, 25, 25, 25));

        Button btn1 = new Button("button 1");

        Button btn2 = new Button("button 2");

        Button btn3 = new Button("button 3");

        Button btn4 = new Button("button 4");

        Button btn5 = new Button("button 5");

        Button btn6 = new Button("button 6");

        Handler h1 = new Handler("button1 was clicked");

        Handler h2 = new Handler("button2 was clicked");

        Handler h3 = new Handler("button3 was clicked");

        Handler h4 = new Handler("button4 was clicked");

        Handler h5 = new Handler("button5 was clicked");

        Handler h6 = new Handler("button6 was clicked");

        //button names were wrong before, fixed it

        btn1.setOnAction(h1);

        btn2.setOnAction(h2);

        btn3.setOnAction(h3);

        btn4.setOnAction(h4);

        btn5.setOnAction(h5);

        btn6.setOnAction(h6);

        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);

        //properly creating a Scene using root pane

        Scene scene = new Scene(root, 500, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}

//Handler.java (both files should be seperate)

//there was no 'class' keyword before; fixed it

public class Handler extends Main implements EventHandler<ActionEvent> {

    String message;

    public Handler(String message) {

        this.message = message;

    }

    @Override

    public void handle(ActionEvent a) {

        System.out.println(this.message);

    }

}