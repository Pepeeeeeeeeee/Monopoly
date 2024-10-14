package kdg.monopoly.controllers;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import kdg.monopoly.models.Player;
import kdg.monopoly.models.Property;
import kdg.monopoly.classes.PropertyStorage;

public class GameController {
    @FXML
    public Rectangle box;

    private int doubleCounter;
    public int roundNumber;
    public int diceFace1;
    public int diceFace2;

    public Player player = new Player();
    public PropertyController propertyController = new PropertyController();

    public int[] diceRoll(){
        diceFace1 = (int) (Math.random() * 6) + 1;
        diceFace2 = (int) (Math.random() * 6) + 1;
        int[] roll = new int[2];
        roll[0] = diceFace1;
        roll[1] = diceFace2;
        return roll;
    }

    public void checkDoubles(){
        if (diceFace1 == diceFace2) doubleCounter++;
        else doubleCounter = 0;
    }

    public void movePlayer(){
        roundNumber++;
        int[] diceRol = diceRoll();


        int roll = diceRol[0] + diceRol[1];

        checkDoubles();
        if (doubleCounter >= 3) moveToJail();

        int currentPosition = player.getCurrentPosition();
        int newPosition = currentPosition + roll;

        if(newPosition >= 39){
            int mean = newPosition - 39;
            player.setCurrentPosition(mean);
            player.setMoney(player.getMoney() + 200);
        }
        else{
            player.setCurrentPosition(newPosition);
        }

        if(player.getCurrentPosition() == 30) moveToJail();

       // propertyController.buyProperty(player.getCurrentPosition());

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(box);
        translate.setDuration(Duration.millis(1000));
        translate.setByX(roll*100);
        translate.play();
    }

    public void moveToJail(){
        player.setCurrentPosition(11);
    }

}
