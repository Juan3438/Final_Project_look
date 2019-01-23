package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class gameControl  {

    private Player hero;
    private Enemy villain;

    private window scene;

    public gameControl(Player hero , Enemy villain){


        this.hero = hero;
        this.villain = villain;

        this.scene = new window(hero,villain);
        hero.setLeaderAttribute(5);
        villain.setLeaderAttribute(2);

    }


    public Scene getPage(){
        return scene.getScene();
    }

    public Scene getMenuScreen(){
        return scene.getMenuScreen();
    }


}
