package Models;

import java.util.Random;


public class Dice {
	
	public static int rollDice(int min, int max){
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

}
