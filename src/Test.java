
import Models.Attributes.Attributes;
import Models.Attributes.Charisma;
import Models.Attributes.Dexterity;
import Models.Databases.EntityManager;
import Models.Databases.EquipmentManager;
import Models.Dice.Dice;
import Models.Attributes.Strength;
import Models.Entity.*;
import Models.Entity.Character;
import Models.Equipment.Armor;
import Models.Equipment.Weapon;
import Models.Races.Gnome;
import Models.etc.Level;
import Models.etc.Money;
import View.CharacterImage;
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
     //We create a new Character
     Models.Entity.Character character = new Character();

     //We add things to the Descriptions class
     character.getDescriptions().setName("Vael");

     character.setMoney(new Money());
        character.getMoney().addMoney(5000,0,0);

        List<Character> characters = new ArrayList<>();
        characters = EntityManager.loadCharacters();
        for(Character c : characters){
            System.out.println(c.getDescriptions().getName());
        }

        //Ask if they wish level up
        character.setLevel(new Level());
        System.out.println(character.getLevel().getLevel());
        for(int i = 0; i < 20; i++) {
            character.getLevel().levelUp();
            System.out.println(character.getLevel().getLevel());
        }

        //Allow them to edit the 6 attributes if they so wish
        character.setAttributes(new Attributes());
        character.getAttributes().setCharisma(new Charisma(20));
        character.getAttributes().setStrength(new Strength(20));
        //etc

        //let them add gold (if they want to) like so
        character.setMoney(new Money());
        character.getMoney().addMoney(4,4,4);

        //Load the armory, let them requip items or build new ones
        List<Armor> armors = EquipmentManager.loadArmor();
        List<Weapon> weapon = EquipmentManager.loadWeapons();
        //Display the armor
        //If they want to make a new weapon or armor, do so like this
        //New Weapon, take a look athe constructor but on your ide it should fill in for you
        Weapon weapon1 = new Weapon("putDescription here", "properties", "name" , 0, 0, false, 0);
        Armor armor = new Armor(Armor.ArmorType.CLOTH, "description", "properties", "name", 0, 5, 0);

        Money money = new Money();
        money.setGold(1000);
        System.out.println(money.toString());

        //If the person wants new armor to be equipped, they have to make this check pass
        if(armor.canBePurchased(character.getMoney())){
           character.setCurrentlyEquippedArmor(armor);
            System.out.println("Purchased!");
            //If you want to you can tell them thier current gold
        }else {
            //If you want you can tell them they can't have it, up to you
            System.out.println("Didn't work");
        }

        if(weapon1.canBePurchased(character.getMoney())){
            character.setCurrentlyEquippedArmor(armor);
            //If you want to you can tell them thier current gold
        }else {
            //If you want you can tell them they can't have it, up to you
        }

        //Store all the items away






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