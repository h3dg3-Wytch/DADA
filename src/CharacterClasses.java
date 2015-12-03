

import Models.Classes.*;

import java.io.Serializable;

/**
 * Created by Alex on 11/30/15.
 */
public class CharacterClasses implements Serializable {

    public static Barbarian barbarian  = new Barbarian();
    public static Bard bard= new Bard();
    public static Cleric cleric = new Cleric();
    public static Druid druid = new Druid();
    public static Fighter fighter = new Fighter();
    public static Monk monk= new Monk();
    public static Paladin paladin = new Paladin();
    public static Ranger ranger = new Ranger();
    public static Rogue rogue = new Rogue();
    public static Sorcerer sorcerer = new Sorcerer();
    public static Wizard wizard = new Wizard();
    
    public CharacterClasses(){
        
    }
}
