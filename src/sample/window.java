package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

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


    VBox menuPage = new VBox(logo,playGame,editArmy);

    public window(Player hero, Enemy villain){

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

        Scene menuScreen = new Scene(menuPage,600,600);
        return menuScreen;
    }

    public void gameLoop(){



    }
}
