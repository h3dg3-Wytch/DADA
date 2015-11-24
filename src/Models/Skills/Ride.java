package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class Ride extends Skill implements Serializable{

	public Ride(Dexterity attribute, int rank, boolean isClassSkill) {
		super(attribute, rank, false);
	}	
}
