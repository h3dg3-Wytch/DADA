package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class SleightofHand extends Skill implements Serializable{

	public SleightofHand(Dexterity attribute, int rank) {
		super(attribute, rank, false);
	}	
}

