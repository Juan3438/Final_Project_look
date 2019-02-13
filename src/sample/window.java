package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class window {

    Label logo = new Label("This is the games logo");

    int width = 500;
    int height = 500;

    Player hero;
    VBox playerStats;

    Enemy villain;
    HBox NPC;

    VBox page;

    Button playGame = new Button("Play Game");
    Button editArmy = new Button("Edit Army");

    Parent MenuScreen = FXMLLoader.load(getClass().getResource("Menu.fxml"));
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

    public void start(ActionEvent actionEvent){
        Scene holder = new Scene(root,100,100);
    }

    public window(Player hero, Enemy villain) throws IOException {

        this.hero = hero;
        this.villain = villain;

        this.playerStats = new VBox(hero.getPlayerStats(),hero.getPlayerImg());
        this.NPC = new HBox(villain.getEnemyStats(),villain.getEnemyImg());
        this.page = new VBox(NPC,playerStats);

    }

    public Scene getScene(){
        Scene scene = new Scene(page,width,height);
        return scene;
    }

    public Scene getMenuScreen(){

        Scene menuScreen = new Scene(MenuScreen,600,600);
        return menuScreen;
    }


}
