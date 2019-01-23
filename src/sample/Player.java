package sample;

import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Player extends fighter implements Leader {

    warrior underling;
    String newLine = "\n";

    private Label playerStats = new Label(setStats());

    private Circle playerImg = new Circle(100,100,25);

    int leaderAttribute;

    public Player(int health,int attack,int speed){

        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.underling = new warrior(3,10,2,5);

    }

    @Override
    public void setLeaderAttribute(int leaderAttribute) {
        this.leaderAttribute = leaderAttribute;
    }
    @Override
    public String setStats(){
        return ("Health: " + getHealth()+ newLine + "Attack: " + getAttack() + newLine + "Speed: " + getSpeed());
    }


    public warrior getUnderling(){
        return underling;
    }

    public Label getPlayerStats() {
        return playerStats;
    }

    public Circle getPlayerImg() {
        return playerImg;
    }
}
