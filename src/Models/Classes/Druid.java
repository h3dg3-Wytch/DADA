package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by krushan on 11/29/15.
 */
public class Druid {
    private int skillRanksPerLevel;
    private int currentLevel;


    public Druid(){
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
        spellArray[1]  = 1;
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
                return new Ability(20,"Nature Bond: The ability to bond with nature.");
            case 4:
                return new Ability(20, "Resist Nature's Lure: The ability to gain a +4 bonus on saving throws against the spell like and supernatural abilites of fey. ");
            case 8:
                return new Ability(20, "Wild Shape 3/day: The ability to turn herself into any small or medium animal and back again 3 times per day.");
            case 13:
                return new Ability(20, "A Thousand faces: The ability to change her appearance at will.");
            case 15:
                return new Ability(20, "Timeless Body: A Druid no longer takes ability score penalties for aging and cannot be magically aged.");
            case 20:
                return new Ability(20, "Wild Shape (at will): The ability to turn herself into any small or medium animal and back again at her will.");
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
