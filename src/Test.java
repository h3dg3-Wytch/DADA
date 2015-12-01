
import Models.Attributes.Attributes;
import Models.Attributes.Charisma;
import Models.Attributes.Dexterity;
import Models.Databases.EntityManager;
import Models.Databases.EquipmentManager;
import Models.Databases.SpellManager;
import Models.Dice.Dice;
import Models.Attributes.Strength;
import Models.Entity.*;
import Models.Entity.Character;
import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.Races.Gnome;
import Models.etc.Descriptions;
import Models.etc.Level;
import Models.etc.Money;
import Models.etc.Spell;
import View.CharacterImage;
import com.sun.org.glassfish.gmbal.Description;
import org.w3c.dom.Attr;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rex on 11/6/2015.
 */
public class Test {
//testetsteststeet

    public static void main(String[] args) {

     //Load all the monsters and allow them yo be displayed
     List<Monster> monsterList = new ArrayList<Monster>();
     monsterList.add(new Monster());
     EntityManager.saveMonsters(monsterList);

     monsterList = EntityManager.loadMonsters();


     Monster monster = monsterList.get(0);



 //The users will then be able to name what type of creature it is

     monster.setDescriptions(new Descriptions());
     monster.getDescriptions().setName("Goblin");

     //the user will be allowed to set the 6 attributes to however they wish
     Attributes attributes = new Attributes();
     monster.setAttributes(attributes);
     monster.getAttributes().setCharisma(new Charisma(5));
     monster.getAttributes().setStrength(new Strength(10));
     monster.getAttributes().setDexterity(new Dexterity(10));
     //etc

     //Ask how old the mosnter is, this is its level 1-20
     Level newLevel = new Level();
     int input = 5;
     for(int i = 0 ; i < input; i++){
      newLevel.levelUp();
     }

     monster.setLevel(newLevel);



     //The user will ask how strong the hide of this monster will be, this is the armor class
     int userInput = 5;
     monster.setArmorClass(userInput);

//     //The user will ask strong the monster is,weak. normal, or strong, and can assign a dice value to it
     //weak = 4 sided dice
     //normal = 6 sided dice
     //strong = 10 sided dice
     Dice dice = new Dice(6);
     monster.setDice(dice);

//     //Ak how mcuh exp this monster will drop
     monster.setExperienceDropped(4000);

  //Ask if you want this monster to know any spells from the SpellManager or if they want to create any new spells
     List<Spell> spells = SpellManager.loadSpells();
     //let them choose how many they want, then add as many as they want
     if(monster.getSpells() == null){
      monster.setSpells(new ArrayList<>());
      monster.getSpells().add(new Spell());
     } else {
      monster.getSpells().add(new Spell());
     }

     //If they want to create a new spell, here is how you do it. Please look at the spell constructor to understand
     // all the parameters
     Spell newSpell = new Spell("The name", 5, " The description", 9, monster.getLevel());
     //Store it
     List<Spell> newSpells = new ArrayList<>();
     newSpells.add(newSpell);
     //If you can go back to spell select and allow them to continue selecting spells



 //Calculate everything
     monster.calculateEverything();

 //Store this creature back into the EntityManager
     ArrayList<Monster> monsterList1 = new ArrayList<>();
     monsterList1.add(monster);
     EntityManager.saveMonsters(monsterList1);

     //You are done!









//     System.out.println(character.getFortitude());
//
        //If the class is a wizard or sorcerer, have them select two spells
        //Morgan will add the spellManager

        //Go ahead and create the visual representation of the character, you are done with character creation!





        

        /*
         Attributes attributes = new Attributes();
         attributes.setStrength(new Strength(10));

         Gnome gnome = new Gnome();
         gnome.modifyAttributes(attributes);
         System.out.println(attributes.getStrength().getAbilityScore());

         // Created by Alex on 11/22/15.

        
         Dice d4 = new Dice(4);

         System.out.println("Rolling d4");
         for(int i =0; i < 5; i++){
         System.out.print(d4.rollDice() + " ");
         }
        
         System.out.println("\nRolling d8");
         for(int i =0; i < 5; i++){
         System.out.print(Dice.rolld8() + " ");
         }

         System.out.println("\nRolling d10");
         for(int i =0; i < 5; i++){
         System.out.print(Dice.rolld10() + " ");
         }

         System.out.println("\nRolling d12");
         for(int i =0; i < 5; i++){
         System.out.print(Dice.rolld12() + " ");
         }

         System.out.println("\nRollding d20");
         for(int i = 0; i < 5; i++){
         System.out.print(Dice.rolld20() + " ");
                
         }*/
    }
}