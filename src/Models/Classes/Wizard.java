package Models.Classes;

import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Alex on 11/27/15.
 */
public class Wizard extends CharacterClass implements Serializable {

    private int skillRanksPerLevel;
    private int currentLevel;


    public Wizard(){

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

        int result = 0;
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
                return new Ability(20,"Scribe Scroll: the ability to store spells for further use in parchment");
            case 4:
                return new Ability(20, "Create Amulet: the ability to create magic items used to bolster your magic");
            case 8:
                return new Ability(20, "Call Familiar: the ability to call on your familiar creature for aide");
            case 12:
                return new Ability(20, "Meta-Magic: the ability to cast an additional spell in combat");
            case 16:
                return new Ability(20, "Create Wonder: The ability to create magicial artifacts able to do anything");
            case 20:
                return new Ability(20, "Enchant equpiment: The ability to store spells in your, and you allies equipment for later use");
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
