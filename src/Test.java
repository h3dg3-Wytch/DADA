import Models.Dice;

/**
 * Created by Alex on 11/22/15.
 */
public class Test {

    public static void main(String[] args){

        System.out.println("Rolling d4");
        for(int i =0; i < 5; i++){
            System.out.print(Dice.rolld4() + " ");
        }

        System.out.println("\nRolling d6");
        for(int i =0; i < 5; i++){
            System.out.print(Dice.rolld6() + " ");
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
        }


    }
}
