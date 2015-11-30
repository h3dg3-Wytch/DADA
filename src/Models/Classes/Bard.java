package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by krushan on 11/29/15.
 */
public class Bard extends CharacterClass implements Serializable {
    private int skillRanksPerLevel;
    private int currentLevel;

    public Bard(){
        setTypeofDie(new Dice(8));
    }

    public void baseAttackBonus(Entity entity){
        int result = 0;
        int bonus = entity.getLevel().getLevel()/2;

        result += bonus;
        entity.setBaseAttackBonus(result);
    }
    public void calcFortSave(Entity entity){
        int result =0;
        int bonus = entity.getLevel().getLevel()/2;

        result+=bonus;
        entity.setBaseAttackBonus(result);
    }
    public void calcRefSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }
    public void calcWillSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }
    public int[] calcSpellsPerDay(Entity entity) {

        int[] spellArray = new int[6];
        spellArray[0] = 1;
        spellArray[1] = 0;

        for(int j = 0; j <= (entity.getLevel().getLevel() / 2); j++) {

            for (int i = 0; i < j ; i++) {
                if (spellArray[i] == 5) {
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


    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Distraction: The ability to counter magic effects that depend on sight");
            case 5:
                return new Ability(20, "Lore Master: The ability to become a master of lore.");
            case 8:
                return new Ability(20, "Jack of all trades: The ability to use any skill.");
            case 14:
                return new Ability(20, "Frightening Tune: The ability to cause fear in his enemies");
            case 17:
                return new Ability(20, "Inspire Courage: The ability to inspire courage in his allies.");
            case 20:
                return new Ability(20, "Deadly Perfomance: The ability to cause one enemy to die from joy or sorrow.");
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

}
