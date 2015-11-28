package Models.etc;

import Models.Dice.Dice;

import java.io.Serializable;

/**
 * Created by Alex on 11/27/15.
 */
public class Spell implements Serializable {

    private String spellName;
    private Dice die;
    private String description;
    private int spellLevel;
    //Higher levels can lead to more powerful spells
    private int levelMultiplier;

    public Spell(String spellName, int numberOfSides, String description, int spellLevel, Level casterLevel ){
        this.spellName = spellName;
        this.die = new Dice(numberOfSides);
        this.description = description;
        this.spellLevel = spellLevel;
        this.levelMultiplier = casterLevel.getLevel() / 4;
    }

    public String castSpell(){
        int result = die.rollDice();
        for(int i = 1; i < levelMultiplier; i++){
            result += die.rollDice();
        }
        return spellName + " was cast, with a total damage of " + result;
    }

    public Dice getDie() {
        return die;
    }

    public void setDie(Dice die) {
        this.die = die;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }
}
