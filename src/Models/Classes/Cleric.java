package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by krushan on 11/29/15.
 */
public class Cleric extends CharacterClass implements Serializable {
    private int skillRanksPerLevel;
    private int currentLevel;


    public Cleric(){
        //The base die is 8
        setTypeOfDie(new Dice(8));

    }

    @Override
    public void baseAttackBonus(Entity entity) {
        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcFortSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcRefSave(Entity entity) {

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcWillSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    //Creates the spells per day array, an array that returns how many of spells of a certain type can be called
    //the indexs tie to the level of the spell i.e. the 0th index is how many 0 level spells you can cast per day
    //the 1st is for 1st level spells and so on.
    @Override
    public int[] calcSpellsPerDay(Entity entity) {

        int[] spellArray = new int[10];
        spellArray[0] = 3;
        spellArray[1]  = 2;
        for(int j = 0; j <= (entity.getLevel().getLevel() / 2); j++) {

            for (int i = 0; i < j ; i++) {
                if (spellArray[i] == 4) {
                    //do nothing
                } else if (spellArray[i] == 2) {
                    try {
                        spellArray[i++] += 1;
                    } catch (Exception e) {
                        //We are at the end of the array
                        spellArray[i] += 1;
                    }
                }else{
                    spellArray[i] += 1;
                }
            }

        }
        return spellArray;

    }

    @Override
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Aura: The ability to have a powerful aura corresponding to the deitys alignment");
            case 3:
                return new Ability(20, "Channel Energy(2d6): The ability to release a wave of energy by channeling the power of her faith through her holy(or unholy)symbol");
            case 5:
                return new Ability(20, "Channel Energy(3d6): The ability to release a wave of energy by channeling the power of her faith through her holy(or unholy)symbol");
            case 9:
                return new Ability(20, "Channel Energy(5d6): The ability to release a wave of energy by channeling the power of her faith through her holy(or unholy)symbol");
            case 15:
                return new Ability(20, "Channel Energy(8d6): The ability to release a wave of energy by channeling the power of her faith through her holy(or unholy)symbol");
            case 19:
                return new Ability(20, "Channel Energy(10d6): The ability to release a wave of energy by channeling the power of her faith through her holy(or unholy)symbol");
            default: return null;
        }
    }

    public int getSkillRanksPerLevel() {
        return skillRanksPerLevel;
    }

    public void setSkillRanksPerLevel(int skillRanksPerLevel) {
        this.skillRanksPerLevel = skillRanksPerLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }


}
