package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Harsh Patel
 */
public class Paladin extends CharacterClass implements Serializable {

    private int skillRanksPerLevel;
    private int currentLevel;


    public Paladin(){
        //The base die is 10
        setTypeOfDie(new Dice(10));

    }

    @Override
    public void baseAttackBonus(Entity entity) {
        int result = 1;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcFortSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setFortitude(result);

    }

    @Override
    public void calcRefSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setReflex(result);

    }

    @Override
    public void calcWillSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setWill(result);

    }

    //Creates the spells per day array, an array that returns how many of spells of a certain type can be called
    //the indexs tie to the level of the spell i.e. the 0th index is how many 0 level spells you can cast per day
    //the 1st is for 1st level spells and so on.
    @Override
    public int[] calcSpellsPerDay(Entity entity) {

        int[] spellArray = new int[4];
        spellArray[0] = 0;
        spellArray[1]  = 0;
        for(int j = 0; j <= (entity.getLevel().getLevel() / 5); j++) {

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
                return new Ability(20,"Smit Evil 1/Day: Once per day, A paladin can call out to the powers of good to aid her in her struggle against evil.");
            case 5:
                return new Ability(20, "Divine bond : The Ability to form a divine bond with her god.");
            case 8:
                return new Ability(20, "Aura of Resolves: The Ability to be immune to charm spells and spell-like abilities.");
            case 12:
                return new Ability(20, "Aura of Faith: A paladin�s weapons are treated as good-aligned for the purposes of overcoming damage reduction.");
            case 16:
                return new Ability(20, "Smit Evil 6/Day: Six times per day, A paladin can call out to the powers of good to aid her in her struggle against evil. ");
            case 20:
                return new Ability(20, "Holy Champion: A paladin becomes a conduit for the power of her god.");
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