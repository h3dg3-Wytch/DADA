package Models.Entity;

import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.etc.Descriptions;

import java.util.UUID;

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

        id = UUID.randomUUID();

    }
    public void setCurrentlyEquippedArmor(Armor currentlyEquippedArmor)
    {
        this.currentlyEquippedArmor = currentlyEquippedArmor;
    }

    @Override
    public void calculateHP()
    {
        setHealthPoints(getCharacterClass().getTypeOfDie().rollDice() * getLevel().getLevel());
    }

    @Override
    public void caluclateArmorClass()
    {
        if(shield == null) {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + getAttributes().getDexterity().getAbilityModifier());
        }else {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + shield.getACBonus() + getAttributes().getDexterity().getAbilityModifier());
        }

    }

    @Override
    public void calculateFortitude() {
        getCharacterClass().calcFortSave(this);
    }

    @Override
    public void calculateReflex() {

        getCharacterClass().calcRefSave(this);

    }

    @Override
    public void calculateWill() {

        getCharacterClass().calcWillSave(this);

    }

    @Override
    public void calculateCMB()
    {
        setCMB(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier());

    }

    @Override
    public void calculateCMD()
    {
        setCMD(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier());
    }

    @Override
    public void calculateInititiative()
    {
        setInitiative(getBaseAttackBonus() + getAttributes().getStrength().getAbilityModifier() + getAttributes().getDexterity().getAbilityModifier());
    }

    @Override
    public void calculateBaseAttackBonus()
    {
        if(currentlyEquippedWeapon != null) {
            if (currentlyEquippedWeapon.isRanged()) {
                setBaseAttackBonus(currentlyEquippedWeapon.getAttackBonus() + getAttributes().getDexterity().getAbilityModifier());
            } else {
                setBaseAttackBonus(currentlyEquippedWeapon.getAttackBonus() + getAttributes().getStrength().getAbilityModifier());
            }
        }else {

        }
    }

    @Override
    public void calculateTouchArmor()
    {
       setTouchArmor( 10 + getAttributes().getDexterity().getAbilityModifier());
    }

    public Weapon getCurrentlyEquippedWeapon() {
        return currentlyEquippedWeapon;
    }

    public void setCurrentlyEquippedWeapon(Weapon currentlyEquippedWeapon) {
        this.currentlyEquippedWeapon = currentlyEquippedWeapon;
    }

    public Armor getShield() {
        return shield;
    }

    public void setShield(Armor shield) {
        this.shield = shield;
    }

    @Override
    public void calculateFlatFooted()
    {
        if(shield == null) {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus());
        }else {
            setArmorClass(10 + currentlyEquippedArmor.getACBonus() + shield.getACBonus());
        }
    }

    public void calculateEverything(){

        calculateBaseAttackBonus();
        calculateTouchArmor();
        calculateFlatFooted();
        caluclateArmorClass();
        calculateCMD();
        calculateCMB();
        calculateFortitude();
        caluclateArmorClass();
        calculateHP();
        calculateFortitude();
        calculateReflex();
        calculateWill();
        calculateInititiative();
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
