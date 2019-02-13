package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;


public class Controller {
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) throws IOException {
        helloWorld.setText("Starting...");
        Scene start = FXMLLoader.load(getClass().getResource("Menu.fxml"));

    }
    public void toStart(ActionEvent actionEvent){

    }
}
