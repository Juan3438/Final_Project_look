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

public class Main extends Application {
    int clicks;
    String text = "My Counter: "+ clicks;
    Label label= new Label(text);
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Button Game");

        Button button = new Button ("My Button");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clicks++;
                label.setText("My Counter: "+ clicks);
                Timer timer = new Timer();
                TimerTask time =
                timer.schedule(textDone(),10000);
            }
            public void textDone(){
                label.setText("Done!");
            }
        });
        HBox container = new HBox(button,label);
        Scene scene = new Scene(container,500,300);

        button.setMaxSize(100,100);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


