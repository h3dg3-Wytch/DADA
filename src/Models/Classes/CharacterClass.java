package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Alex on 11/27/15.
 */
public abstract class CharacterClass implements Serializable {

    private Dice typeOfDie;



    public void setTypeOfDie(Dice typeOfDie) {
        this.typeOfDie = typeOfDie;
    }

    public abstract void baseAttackBonus(Entity entity);
    public abstract void calcFortSave(Entity entity);
    public abstract void calcRefSave(Entity entity);
    public abstract void calcWillSave(Entity entity);

    public abstract int[] calcSpellsPerDay(Entity entity);
    public abstract Ability getAbility(Level level);

    public Dice getTypeOfDie() {
        return typeOfDie;
    }

}
