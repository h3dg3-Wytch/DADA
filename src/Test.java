<<<<<<< HEAD

import Models.Dice.Dice;

=======
<<<<<<< HEAD
<<<<<<< HEAD
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Attributes.Constitution;
import Models.Craft;
import Models.Attributes.Strength;
import Models.Races.Gnome;

/**
 * Created by Rex on 11/6/2015.
 */
public class Test {
//testetsteststeet
    public static void main(String[] args){

       Attributes attributes = new Attributes();
        attributes.setStrength(new Strength(10));

       Gnome gnome = new Gnome();
        gnome.modifyAttributes(attributes);
        System.out.println(attributes.getStrength().getAbilityScore());



=======
=======
>>>>>>> b087b2f1654f4985871504bd780980154d704c4a
import Models.Dice;
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281

/**
 * Created by Alex on 11/22/15.
 */
public class Test {

    public static void main(String[] args){
        Dice d4 = new Dice(4);

        System.out.println("Rolling d4");
        for(int i =0; i < 5; i++){
            System.out.print(d4.rollDice() + " ");
        }

<<<<<<< HEAD
=======
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
        }
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> b087b2f1654f4985871504bd780980154d704c4a


>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
    }
}
