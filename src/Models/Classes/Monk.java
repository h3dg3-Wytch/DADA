package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by krushan on 11/29/15.
 */
public class Monk extends CharacterClass implements Serializable {
    private int skillRanksPerLevel;
    private int currentLevel;


    public Monk(){
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

    @Override
    public int[] calcSpellsPerDay(Entity entity) {
        return new int[0];
    }


    @Override
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Stunning Fists: The ability to gain Stunning fists as a bonus feat.");
            case 3:
                return new Ability(20, "Fast Movement: The ability for a monk to gain enhancement bonus to his land speed.");
            case 5:
                return new Ability(20, "High jump: The ability for a monk to add his level to all Acrobatics checks made to jump.");
            case 11:
                return new Ability(20, "Diamond Body: The ability to gain immunity to poisons of all kind.");
            case 17:
                return new Ability(20, "Timeless Body: The ability of a monk to no longer take penalties to his ability scores for aging and cannot be magically aged.");
            case 20:
                return new Ability(20, "Perfect Self: The ability to make a monk a magical creature.");
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
