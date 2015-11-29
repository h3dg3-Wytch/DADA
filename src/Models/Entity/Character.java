package Models.Entity;

import Models.Equipment.Armor;
import Models.etc.Descriptions;
import Models.etc.ToolTip;
import Models.etc.ToolTipObject;

/**
 * Created by Alex on 11/28/15.
 */
public class Character extends Entity
{

    private Armor currentlyEquipedArmor;
    private Armor shield;

    public void Character()
    {
        Descriptions descriptions = new Descriptions();
        setDescriptions(descriptions);
    }
    public void setCurrentlyEquipedArmor(Armor currentlyEquipedArmor)
    {
        this.currentlyEquipedArmor = currentlyEquipedArmor;
    }

    @Override
    protected void calculateHP()
    {
        setHealthPoints(getCharacterClass().getTypeOfDie().rollDice());
    }

    @Override
    protected void caluclateArmorClass()
    {

        setArmorClass(10 + currentlyEquipedArmor.getACBonus() + getAttributes().getDexterity().getAbilityModifier());

    }

    @Override
    protected void calculateCMB()
    {

    }

    @Override
    protected void calculateCMD()
    {

    }

    @Override
    protected void calculateInititiative()
    {

    }

    @Override
    protected void calculateBaseAttackBonus()
    {

    }

    @Override
    protected void calculateTouchArmor()
    {

    }

    @Override
    protected void calculateFlatFooted()
    {

    }

    public Armor getCurrentlyEquipedArmor()
    {
        return currentlyEquipedArmor;
    }

    @Override
    public int compareTo(Entity e)
    {
        return Integer.compare(this.getInitiative(), e.getInitiative());
    }
}
