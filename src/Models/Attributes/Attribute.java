package Models.Attributes;

import java.io.Serializable;

/**
 * Created by Rex on 11/5/2015.
 */

//Abstract class of attribute, used to model the table found
public abstract class Attribute implements Serializable {
    protected int abilityScore;
    protected int abilityModifier;
    protected int tempAdjustment;
    protected int tempModifier;


    public Attribute(int num){
        this.abilityScore = num;
        this.tempAdjustment = 0;
        this.tempModifier = 0;
        this.abilityModifier = calcModifier(this.abilityScore);
    }
    //Returns an int, calculates the modifier that will be used in rolls, from the table 1-3
    protected int calcModifier(int score){
        int result = -5;
        while(score != 1 && score > 1 ){
            score -= 2;
            result++;
        }
        return result;
    }

    //Getter and setter methods
    public int getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(int abilityScore) {
        this.abilityScore = abilityScore;
    }

    public int getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(int abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getTempAdjustment() {
        return tempAdjustment;
    }

    public void setTempAdjustment(int tempAdjustment) {
        this.tempAdjustment = tempAdjustment;
    }

    public int getTempModifier() {
        return tempModifier;
    }

    public void setTempModifier(int tempModifier) {
        this.tempModifier = tempModifier;
    }









}

