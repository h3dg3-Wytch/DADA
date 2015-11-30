package Models.Entity;

import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.etc.Descriptions;

/**
 * Created by Alex on 11/28/15.
 */
public class Character extends Entity
{
    private Weapon currentlyEquippedWeapon;
    private Armor currentlyEquippedArmor;
    private Armor shield;
    private int[] image;

    public void Character()
    {
        Descriptions descriptions = new Descriptions();
        setDescriptions(descriptions);
    }
    public void setCurrentlyEquippedArmor(Armor currentlyEquippedArmor)
    {
        this.currentlyEquippedArmor = currentlyEquippedArmor;
    }

    @Override
    protected void calculateHP()
    {
        setHealthPoints(getCharacterClass().getTypeOfDie().rollDice());
    }

    @Override
    protected void caluclateArmorClass()
    {
        if(shield == null) {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + getAttributes().getDexterity().getAbilityModifier());
        }else {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + shield.getACBonus() + getAttributes().getDexterity().getAbilityModifier());
        }

    }

    @Override
    protected void calculateFortitude() {
        getCharacterClass().calcFortSave(this);
    }

    @Override
    protected void calculateReflex() {

        getCharacterClass().calcRefSave(this);

    }

    @Override
    protected void calculateWill() {

        getCharacterClass().calcWillSave(this);

    }

    @Override
    protected void calculateCMB()
    {
        setCMB(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier());

    }

    @Override
    protected void calculateCMD()
    {
        setCMB(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier());
    }

    @Override
    protected void calculateInititiative()
    {
        setCMB(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier() + getAttributes().getDexterity().getAbilityModifier());
    }

    @Override
    protected void calculateBaseAttackBonus()
    {
        if (currentlyEquippedWeapon.isRanged()) {
            setBaseAttackBonus(currentlyEquippedWeapon.getAttackBonus() + getAttributes().getDexterity().getAbilityModifier());
        } else {
            setBaseAttackBonus(currentlyEquippedWeapon.getAttackBonus() + getAttributes().getStrength().getAbilityModifier());
        }
    }

    @Override
    protected void calculateTouchArmor()
    {
       setTouchArmor( 10 + getAttributes().getDexterity().getAbilityModifier());
    }

    @Override
    protected void calculateFlatFooted()
    {
        if(shield == null) {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus());
        }else {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + shield.getACBonus());
        }
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }
    
    public Armor getCurrentlyEquippedArmor()
    {
        return currentlyEquippedArmor;
    }

    @Override
    public int compareTo(Entity e)
    {
        return Integer.compare(this.getInitiative(), e.getInitiative());
    }
}
