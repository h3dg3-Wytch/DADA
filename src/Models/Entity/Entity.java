package Models.Entity;

import Models.Attributes.Attributes;
import Models.Classes.CharacterClass;
import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.Skills.Skills;
import Models.etc.*;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Alex on 11/27/15.
 */
public abstract class Entity implements Serializable{

    private Descriptions descriptions;
    private Level level;
    private Attributes attributes;
    private ArrayList<Ability> abilities;
    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armory;
    private Skills skills;
    private CharacterClass characterClass;
    private ArrayList<Spell> spells;
    private Money money;

    private int healthPoints;
    private int armorClass;
    private int CMB;
    private int CMD;
    private int initiative;
    private int baseAttackBonus;
    private int touchArmor;
    private int flatFooted;

    private int fortitude;
    private int reflex;
    private int will;


    protected abstract void calculateHP();
    protected abstract void caluclateArmorClass();
    protected abstract void calculateCMB();
    protected abstract void calculateCMD();
    protected abstract void calculateInititiative();
    protected abstract void calculateBaseAttackBonus();
    protected abstract void calculateTouchArmor();
    protected abstract void calculateFlatFooted();

    public Descriptions getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Descriptions descriptions) {
        this.descriptions = descriptions;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Armor> getArmory() {
        return armory;
    }

    public void setArmory(ArrayList<Armor> armory) {
        this.armory = armory;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getCMB() {
        return CMB;
    }

    public void setCMB(int CMB) {
        this.CMB = CMB;
    }

    public int getCMD() {
        return CMD;
    }

    public void setCMD(int CMD) {
        this.CMD = CMD;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getBaseAttackBonus() {
        return baseAttackBonus;
    }

    public void setBaseAttackBonus(int baseAttackBonus) {
        this.baseAttackBonus = baseAttackBonus;
    }

    public int getTouchArmor() {
        return touchArmor;
    }

    public void setTouchArmor(int touchArmor) {
        this.touchArmor = touchArmor;
    }

    public int getFlatFooted() {
        return flatFooted;
    }

    public void setFlatFooted(int flatFooted) {
        this.flatFooted = flatFooted;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }
}
