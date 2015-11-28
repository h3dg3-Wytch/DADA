package Models.etc;

import Models.Dice.Dice;

import java.io.Serializable;

/**
 * Created by Alex on 11/27/15.
 */
public class Ability implements Serializable {

    private Dice diceUsed;
    private String description;

    public Ability(int typeOfDice, String description){
        this.diceUsed = new Dice(typeOfDice);
        this.description = description;

    }
    public Ability(String description){
        this.description = description;

    }

}
