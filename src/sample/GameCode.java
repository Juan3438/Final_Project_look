package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameCode extends Application {



    @Override
    public void start(final Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Early Game");

       /* Player hero = new Player(100,100,10);
        Enemy villain = new Enemy(100,50,20);
        gameControl game = new gameControl(hero,villain);
        Scene menuScreen = game.getMenuScreen();
        primaryStage.setScene(menuScreen);
*/

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}


