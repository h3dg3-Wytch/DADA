
package Models.Classes;

import Models.Dice.Dice;
import Models.Entity.Entity;
import Models.etc.Ability;
import Models.etc.Level;

import java.io.Serializable;

/**
 * Created by Harsh Patel
 */
public class Fighter extends CharacterClass implements Serializable {

    private int skillRanksPerLevel;
    private int currentLevel;


    public Fighter(){
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

        int result = 0;
        int bonus = entity.getLevel().getLevel() / 2;

        result += bonus;
        entity.setBaseAttackBonus(result);

    }

   
    @Override
    public Ability getAbility(Level level) {
        switch (level.getLevel()){
            case 2:
                return new Ability(20,"Bravery:  This ability gains +1 bonus on will saves against fear.");
            case 5:
                return new Ability(20, "Weapon Training: A fighter can select Blades, Bows or Hammer. Whenever he attacks with that weapon, he gains +1 bonus on attack and damage rolls.");
            case 8:
                return new Ability(20, "Bonus Feat: The ability to gain bonus feat in addition to those gained from normal advancement. bonus feat must be combat feats.");
            case 11:
                return new Ability(20, "Armor Training: The ability to be more maneuverable while wearing armor.");
            case 16:
                return new Ability(20, "Bonus Feat: The ability to gain bonus feat in addition to those gained from normal advancement. bonus feat must be combat feats. ");
            case 20:
                return new Ability(20, "Weapon Mastery: The ability allows to choose one weapon. any attack made with that weapon automatically confirm all critical threats and have their damage multiplier increased by 1x");
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