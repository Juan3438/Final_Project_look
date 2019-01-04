package sample;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.control.*;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {
    int clicks;
    String text = "My Counter: "+ clicks;
    Label label= new Label(text);
    boolean timer = false ;
    public void textDone() {
        label.setText("Done!");
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Button Game");

        Button button1 = new Button("Red");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        Button button2 = new Button("Blue");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        Button button3 = new Button("Green");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        Button button4 = new Button("Yellow");
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        HBox container = new HBox(button1,button2,button3,button4,label);
        Scene scene = new Scene(container,500,300);

        button1.setPrefSize(100,100);
        button2.setPrefSize(100,100);
        button3.setPrefSize(100,100);
        button4.setPrefSize(100,100);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


