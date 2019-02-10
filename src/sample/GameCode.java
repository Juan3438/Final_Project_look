package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameCode extends Application {



    @Override
    public void start(final Stage primaryStage) throws Exception  {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Early Game");

        Player hero = new Player(10,3,2);
        Enemy villain = new Enemy(5,2,4);

        gameControl game = new gameControl(
                hero,
                villain

        );

        Scene menuScreen = game.getMenuScreen();
        primaryStage.setScene(menuScreen);

        primaryStage.show();

        try{

        }catch()(

        );{

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}


