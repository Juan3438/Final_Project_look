package sample;

import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Enemy extends fighter implements Leader {

    private ogres followers;

    private String newLine = "\n";

    private Label enemyStats = new Label(setStats());

    private Circle enemyImg = new Circle(200,100,50);

    int leaderAttribute;

    public Enemy(int health,int attack, int speed){

        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.followers = new ogres(2,5,3,4);
    }

    @Override
    public void setLeaderAttribute(int leaderAttribute) { this.leaderAttribute = leaderAttribute; }

    @Override
    public String setStats() {
        return ("Health: " + getHealth()+ newLine + "Attack: " + getAttack() + newLine + "Speed: " + getSpeed());
    }

    public ogres getFollowers(){return followers;}

    public Label getEnemyStats(){return enemyStats;}

    public Circle getEnemyImg(){return enemyImg;}
}
