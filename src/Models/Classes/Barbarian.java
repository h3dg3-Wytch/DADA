package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by krushan on 11/29/15.
 */
public class Barbarian extends CharacterClass implements Serializable {
    private int skillRanksPerLevel;
    private int currentLevel;

    public Barbarian(){
        setTypeofDie(new Dice(12));
    }

    public void baseAttackBonus(Entity entity){
        int result = 1;
        int bonus = entity.getLevel().getLevel()/2;

        result += bonus;
        entity.setBaseAttackBonus(result);
    }
    public void calcFortSave(Entity entity){
        int result =2;
        int bonus = entity.getLevel().getLevel()/2;

        result+=bonus;
        entity.setBaseAttackBonus(result);
    }
    public void calcRefSave(Entity entity) {

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }
    public void calcWillSave(Entity entity) {

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Fast Movement: The ability to move at +10 speed.");
            case 4:
                return new Ability(20, "Rage Powers: The ability to rage  ");
            case 7:
                return new Ability(20, "Damage Reduction: The ability reduce damage drawn towards her.");
            case 14:
                return new Ability(20, "Indomitable Will: The ability to gain +4 bonus on Will saves. ");
            case 17:
                return new Ability(20, "Tireless Rage: The ability to no longer be fatigued after a rage.");
            case 20:
                return new Ability(20, "Mighty Rage: The ability to enter a rage and give bonus to Strength and Constitution.");
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
