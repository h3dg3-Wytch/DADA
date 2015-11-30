package Models.Dice;

import java.util.ArrayList;
import java.util.Random;


public class Dice {

	private int diceID;

	public Dice(int diceID){
		this.diceID = diceID;
	}

	public int rollDice(){
		switch(diceID){
			case 4:
				return rolld4();
			case 6:
				return rolld6();
			case 8:
				return rolld8();
			case 10:
				return rolld10();
			case 12:
				return rolld12();
			case 20:
				return rolld20();

		}
		return 1;
	}

	private static  int rollDice(int min, int max){
		//We Generate a random object, which is more preferable then Math.random()
		Random random = new Random();

		//generates a random number from the bounds we give it.
		// nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
		int result = random.nextInt((max-min) + 1) + min;
		return result;
	}

	public static int rolld6(){
		return rollDice(1,6);
	}

	public static int rolld4(){
		return rollDice(1,4);
	}

	public static int rolld8(){
		return rollDice(1, 8);
	}
	public static int rolld10(){
		return rollDice(1, 10);
	}
	public static int rolld12(){
		return rollDice(1, 12);
	}
	public static int rolld20(){
		return rollDice(1, 20);
	}

	public int[] generateIntialDice(){
		int[] result = new int[6];
        for(int i = 0; i < 6; i++){
			int[] array = new int[4];
			//The first inner loop, add numbers to each
			for(int j = 0; j < 4; j++){
				int num = rolld6();
				array[j] = num;
			}
			//the min algo that makes the lowest number disappear
			int min = array[0];
			for(int j = 0; j < 4; j++){
				if(min > array[j]){
					min = j;
				}
			}
            try {
				array[min] = 0;
			}catch(Exception e){
				array[0] = 0;
			}
			//Add up each value in this array
			int temp = 0;
			for(int j =0; j < 4; j++){
				temp += array[j];
			}

			result[i] = temp;
		}

		return result;
	}

}
