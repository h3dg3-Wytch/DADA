package Models.Entity;

import Models.Dice.Dice;
import Models.etc.Descriptions;
import Models.etc.Level;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Alex on 11/28/15.
 */
public class Monster extends Entity implements Serializable {

    private Dice typeOfDiceUsed;
    private int toughnessOfHide;
    private int experienceDropped;


    public void Monster()
    {
        id = UUID.randomUUID();
    }

    @Override
    public void calculateHP()
    {
        setHealthPoints(typeOfDiceUsed.rollDice() * getLevel().getLevel());

    }

    @Override
    public void caluclateArmorClass()
    {
        setArmorClass(10 + toughnessOfHide + getAttributes().getDexterity().getAbilityModifier());

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
        setBaseAttackBonus(typeOfDiceUsed.rollDice() + getAttributes().getStrength().getAbilityModifier());

    }

    @Override
    public void calculateTouchArmor()
    {
        setTouchArmor(10 + getAttributes().getDexterity().getAbilityModifier());
    }

    @Override
    public void calculateFlatFooted()
    {
        setFlatFooted(10);

    }

    @Override
    public void calculateFortitude() {
      setFortitude(getLevel().getLevel() / 2);
    }

    @Override
    public void calculateReflex() {
        setReflex(getLevel().getLevel() / 2);
    }

    @Override
    public void calculateWill() {
         setWill(getLevel().getLevel() / 2);
    }

    @Override
    public int compareTo(Entity e)
    {
        return Integer.compare(this.getInitiative(), e.getInitiative());
    }

    public void setDice(Dice dice) {
        this.typeOfDiceUsed = dice;
    }

    public Dice getTypeOfDiceUsed() {
        return typeOfDiceUsed;
    }

    public void setTypeOfDiceUsed(Dice typeOfDiceUsed) {
        this.typeOfDiceUsed = typeOfDiceUsed;
    }

    public int getToughnessOfHide() {
        return toughnessOfHide;
    }

    public void setToughnessOfHide(int toughnessOfHide) {
        this.toughnessOfHide = toughnessOfHide;
    }

    public int getExperienceDropped() {
        return experienceDropped;
    }

    public void setExperienceDropped(int experienceDropped) {
        this.experienceDropped = experienceDropped;
    }


    public void calculateEverything(){

        calculateBaseAttackBonus();
        calculateTouchArmor();
        calculateFlatFooted();
        caluclateArmorClass();
        calculateCMD();
        calculateCMB();
        calculateFortitude();

        calculateHP();
        calculateFortitude();
        calculateReflex();
        calculateWill();
        calculateInititiative();
    }

    //True if the attack was succesful, false otherwise
    public boolean attack(Entity e){
        int result = getBaseAttackBonus() + Dice.rolld20();
        if(result > e.getArmorClass()){
            int damage;
            damage = getTypeOfDiceUsed().rollDice();
            e.setHealthPoints(e.getHealthPoints() - damage);
            return true;
        }else {
            return false;
        }
    }
}
