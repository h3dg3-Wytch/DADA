package Models.Dice;

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

	private  int rollDice(int min, int max){
		//We Generate a random object, which is more preferable then Math.random()
		Random random = new Random();

		//generates a random number from the bounds we give it.
		// nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
		int result = random.nextInt((max-min) + 1) + min;
		return result;
	}

	public int rolld6(){
		return rollDice(1,6);
	}

	public int rolld4(){
		return rollDice(1,4);
	}

	public int rolld8(){
		return rollDice(1, 8);
	}
	public int rolld10(){
		return rollDice(1, 10);
	}
	public int rolld12(){
		return rollDice(1, 12);
	}
	public int rolld20(){
		return rollDice(1, 20);
	}

}
