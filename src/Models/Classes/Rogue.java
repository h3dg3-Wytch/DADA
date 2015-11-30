package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Harsh Patel
 */
public class Rogue extends CharacterClass implements Serializable {

    private int skillRanksPerLevel;
    private int currentLevel;


    public Rogue(){
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

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcRefSave(Entity entity) {

        int result = 2;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public void calcWillSave(Entity entity) {

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

    @Override
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 1:
                return new Ability(20,"Trap Finding: The ability to add 1/2 her level to perception skill checks made to locate traps.");
            case 4:
                return new Ability(20, "Bleeding Attack : The ability can cause living opponents to bleed by hitting them with a sneak attack .");
            case 6:
                return new Ability(20, "Trap Sense: a rogue gains an intuitive sense that laerts her to danger from traps, giving her +2 bonus on reflex saves and +2 on dodge bonus.");
            case 12:
                return new Ability(20, "Trap Sense: a rogue gains an intuitive sense that laerts her to danger from traps, giving her +4 bonus on reflex saves and +4 on dodge bonus.");
            case 16:
                return new Ability(20, "Trap Spotter: Whenever a rogue with this talent comes within 10 feet of a trap, she receives an immediate Perception skill check to notice the trap. ");
            case 20:
                return new Ability(20, "Master Strike: a rogue becomes incredibly deadly when dealing sneak attack damage.");
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
