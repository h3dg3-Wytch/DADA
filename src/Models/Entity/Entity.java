package Models.Entity;

import Models.Attributes.Attributes;
import Models.Classes.CharacterClass;
import Models.Races.Race;
import Models.Dice.Dice;
import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.Skills.Skills;
import Models.etc.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Alex on 11/27/15.
 */
public abstract class Entity implements Serializable, Comparable<Entity>
{
    protected UUID id;
    private Descriptions descriptions = new Descriptions();
    private Level level = new Level();
    private Attributes attributes = new Attributes();
    private ArrayList<Ability> abilities;
    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armory;

    @Override
    public int compareTo(Entity o) {
        return 0;
    }


    private Skills skills;
    private CharacterClass characterClass;
    private Race race;
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

    public abstract void calculateHP();

    public abstract void caluclateArmorClass();

    public abstract void calculateCMB();

    public abstract void calculateCMD();

    public abstract void calculateInititiative();

    public abstract void calculateBaseAttackBonus();

    public abstract void calculateTouchArmor();

    public abstract void calculateFlatFooted();

    public abstract void calculateFortitude();
    public abstract void calculateReflex();
    public abstract void calculateWill();

    public Descriptions getDescriptions()
    {
        return descriptions;
    }

    public void setDescriptions(Descriptions descriptions)
    {
        this.descriptions = descriptions;
    }

    public Level getLevel()
    {
        return level;
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    public Attributes getAttributes()
    {
        return attributes;
    }

    public void setAttributes(Attributes attributes)
    {
        this.attributes = attributes;
    }

    public ArrayList<Ability> getAbilities()
    {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities)
    {
        this.abilities = abilities;
    }

    public ArrayList<Weapon> getWeapons()
    {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons)
    {
        this.weapons = weapons;
    }

    public ArrayList<Armor> getArmory()
    {
        return armory;
    }

    public void setArmory(ArrayList<Armor> armory)
    {
        this.armory = armory;
    }

    public Skills getSkills()
    {
        return skills;
    }

    public void setSkills(Skills skills)
    {
        this.skills = skills;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CharacterClass getCharacterClass()
    {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass)
    {
        this.characterClass = characterClass;
    }

    public ArrayList<Spell> getSpells()
    {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells)
    {
        this.spells = spells;
    }

    public Money getMoney()
    {
        return money;
    }

    public void setMoney(Money money)
    {
        this.money = money;
    }

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }

    public int getArmorClass()
    {
        return armorClass;
    }

    public void setArmorClass(int armorClass)
    {
        this.armorClass = armorClass;
    }

    public int getCMB()
    {
        return CMB;
    }

    public void setCMB(int CMB)
    {
        this.CMB = CMB;
    }

    public int getCMD()
    {
        return CMD;
    }

    public void setCMD(int CMD)
    {
        this.CMD = CMD;
    }

    public int getInitiative()
    {
        return initiative;
    }

    public void setInitiative(int initiative)
    {
        this.initiative = initiative;
    }

    public int getBaseAttackBonus()
    {
        return baseAttackBonus;
    }

    public void setBaseAttackBonus(int baseAttackBonus)
    {
        this.baseAttackBonus = baseAttackBonus;
    }

    public int getTouchArmor()
    {
        return touchArmor;
    }

    public void setTouchArmor(int touchArmor)
    {
        this.touchArmor = touchArmor;
    }

    public int getFlatFooted()
    {
        return flatFooted;
    }

    public void setFlatFooted(int flatFooted)
    {
        this.flatFooted = flatFooted;
    }

    public int getFortitude()
    {
        return fortitude;
    }

    public void setFortitude(int fortitude)
    {
        this.fortitude = fortitude;
    }

    public int getReflex()
    {
        return reflex;
    }

    public void setReflex(int reflex)
    {
        this.reflex = reflex;
    }

    public int getWill()
    {
        return will;
    }

    public void setWill(int will)
    {
        this.will = will;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getToolTip()
    {
        ToolTip tooltip = new ToolTip();
        tooltip.add(new ToolTipObject("Level: ",Integer.toString(level.getLevel())));
        tooltip.add(new ToolTipObject("HP: ", Integer.toString(getHealthPoints())));
        tooltip.add(new ToolTipObject("AC: ", Integer.toString(armorClass)));
        tooltip.add(new ToolTipObject("STR: ", Integer.toString(attributes.getStrength().getAbilityScore())));
        tooltip.add(new ToolTipObject("DEX: ", Integer.toString(attributes.getDexterity().getAbilityScore())));
        tooltip.add(new ToolTipObject("CON: ", Integer.toString(attributes.getConstitution().getAbilityScore())));
        tooltip.add(new ToolTipObject("INT: ", Integer.toString(attributes.getIntelligence().getAbilityScore())));
        tooltip.add(new ToolTipObject("WIS: ", Integer.toString(attributes.getWisdom().getAbilityScore())));
        tooltip.add(new ToolTipObject("CHA: ", Integer.toString(attributes.getCharisma().getAbilityScore())));
        
        return tooltip.getDisplayString();
    }
}
