
import Models.Attributes.Attributes;
import Models.Dice.Dice;
import Models.Attributes.Strength;
import Models.Entity.*;
import Models.Entity.Character;
import Models.Races.Gnome;
import View.CharacterImage;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;
import java.util.ArrayList;

/**
 * Created by Rex on 11/6/2015.
 */
public class Test {
//testetsteststeet

    public static void main(String[] args) {
     //We create a new Character
     Models.Entity.Character character = new Character();

     //We add things to the character
     character.getDescriptions().setName("Vael");

     Dice die = new Dice(0);

    die.generateIntialDice();

        

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
