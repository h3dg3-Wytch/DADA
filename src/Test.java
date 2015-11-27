
import Models.Dice.Dice;


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

    }
}
