package Models.Entity;

import Models.Equipment.Armor;

/**
 * Created by Alex on 11/28/15.
 */
public class Character extends Entity {

    private Armor currentlyEquipedArmor;
    private Armor shield;


    public void setCurrentlyEquipedArmor(Armor currentlyEquipedArmor) {
        this.currentlyEquipedArmor = currentlyEquipedArmor;
    }

    @Override
    protected void calculateHP() {
        setHealthPoints(getCharacterClass().getTypeOfDie().rollDice());
    }

    @Override
    protected void caluclateArmorClass() {

        setArmorClass(10 + currentlyEquipedArmor.getACBonus() + getAttributes().getDexterity().getAbilityModifier());

    }

    @Override
    protected void calculateCMB() {

    }

    @Override
    protected void calculateCMD() {

    }

    @Override
    protected void calculateInititiative() {

    }

    @Override
    protected void calculateBaseAttackBonus() {

    }

    @Override
    protected void calculateTouchArmor() {

    }

    @Override
    protected void calculateFlatFooted() {

    }

    public Armor getCurrentlyEquipedArmor() {
        return currentlyEquipedArmor;
    }
}
