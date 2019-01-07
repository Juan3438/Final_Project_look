package sample;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.*;

import java.util.Timer;
import java.util.TimerTask;

public class GameCode extends Application {
    int clicks;
    double width = 500;
    double height = 300;

    String text = "Clicks Counted: "+ clicks;

    Label label= new Label(text);
    Label counter = new Label("Time Left:");

    boolean timer = false ;

    public void textDone() {
        label.setText("Done!");
    }

    Button button1 = new Button("Red");

    @Override
    public void start(final Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Button Game");


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clicks++;
                label.setText("Clicks Counted: " + clicks);
                button1.setTranslateX(Math.random()*(width-50));
                button1.setTranslateY(Math.random()*(height-50));
                if(!timer){
                    timer = true;
                }
            }
        });


        VBox container = new VBox(label,button1);

        Scene scene = new Scene(container,width,height);

        button1.setPrefSize(50,50);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


