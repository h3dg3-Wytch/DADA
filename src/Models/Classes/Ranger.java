
package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Harsh Patel
 */
public class Ranger extends CharacterClass implements Serializable {

    private int skillRanksPerLevel;
    private int currentLevel;


    public Ranger(){
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
        entity.setBaseAttackBonus(result);

    }

    @Override
    public int[] calcSpellsPerDay(Entity entity) {
        return new int[0];
    }

    @Override
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Track: The ability to add half of his level to survival skill checks made to follow or identify tracks.");
            case 4:
                return new Ability(20, "Hunter's bond: The ability  to form bond with his hunting companion.");
            case 8:
                return new Ability(20, "Swift Tracker : The ability  to move at normal speed while using survival to follow tracks without taking -5 penalty.");
            case 12:
                return new Ability(20, "Camouflage: The ability to hide in any of his favored terrains.");
            case 17:
                return new Ability(20, "Improved evasion: The ability  to avoid even magical and unusual attacks with hreat agility.");
            case 20:
                return new Ability(20, "Master Hunter: The ability to become a master hunter.");
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