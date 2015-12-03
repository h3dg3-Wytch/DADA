
import Models.Attributes.Attributes;
import Models.Attributes.Charisma;
import Models.Attributes.Dexterity;
import Models.Classes.Wizard;
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
import org.w3c.dom.Attr;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;

/**
 * Created by Rex on 11/6/2015.
 */
public class Test {
//testetsteststeet

    public static void main(String[] args) {
        try {
            System.out.println(new File("").getAbsolutePath());
            View.CharacterImage charImage = new View.CharacterImage("La", "Gnome", "Wizard", "m", "c");
            BufferedImage image = charImage.setImage();
            File outputfile = new File("temp.png");
            ImageIO.write(image, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//     Monster monster = new Monster();
//     monster.setTypeOfDiceUsed(new Dice(6));
//     Dice dice =   monster.figureOutDice();
        //    System.out.println(dice.rollDice());
//
//     Character character = new Character();
//     Dice dice = new Dice(20);
//     int[] array = dice.generateIntialDice();
//     Attributes attributes = new Attributes();
//     attributes.setCharisma(new Charisma(array[1]));
//     attributes.setDexterity(new Dexterity((array[0])));
//     attributes.setStrength(new Strength(array[0]));
//     character.setAttributes(attributes);
//     character.setCharacterClass(new Wizard());
//     character.caluclateArmorClass();
//
//     Monster monster = new Monster();
//     monster.setTypeOfDiceUsed(dice);
//
//     monster.setAttributes(attributes);
//     monster.setToughnessOfHide(5);
//     monster.caluclateArmorClass();
//     monster.calculateHP();
//     monster.setLevel(new Level());
//
//     character.attack(monster);
//
//     System.out.println("Character V Monster");
//     for(int i = 0; i < 20; i++) {
//       System.out.print(i + " ");
//       if(character.attack(monster)){
//        System.out.println(monster.getHealthPoints());
//       }else{
//        System.out.println("You missed!");
//       }
//     }
//     System.out.println("Monster v Character");
//     for(int i = 0; i < 20; i++) {
//      System.out.print(i + " ");
//      if(monster.attack(character)){
//       System.out.println(character.getHealthPoints());
//      }else{
//       System.out.println("You missed!");
//      }
//     }
//     System.out.println("Character V character");
//     for(int i = 0; i < 20; i++) {
//      System.out.print(i + " ");
//      if(character.attack(character)){
//       System.out.println(character.getHealthPoints());
//      }else{
//       System.out.println("You missed!");
//      }
//     }
//     System.out.println("monster V monster");
//     for(int i = 0; i < 20; i++) {
//      System.out.print(i + " ");
//      if(monster.attack(monster)){
//       System.out.println(monster.getHealthPoints());
//      }else{
//       System.out.println("You missed!");
//      }
//     }
//
//
//
//
//
//
//
//
//
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
