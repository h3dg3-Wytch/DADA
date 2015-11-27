package Models;

import Models.Attributes.Attributes;
import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.Skills.Skills;
import Models.etc.Descriptions;
import Models.etc.Level;

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
    private Feat feat;

    private int healthPoints;
    private int armorClass;
    private int CMB;
    private int CMD;
    private int initiative;
    private int baseAttackBonus;
    private int touchArmor;
    private int flatFooted;

    protected void calculateHP;
    protected void 




}
