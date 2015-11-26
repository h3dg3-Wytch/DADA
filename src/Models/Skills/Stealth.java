package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class Stealth extends Skill implements Serializable{

	public Stealth(Dexterity attribute, int rank) {
		super(attribute, rank, false);
	}	
}

