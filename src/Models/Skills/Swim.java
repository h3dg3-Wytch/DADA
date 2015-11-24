package Models.Skills;

import Models.Attributes.Strength;

import java.io.Serializable;

public class Swim extends Skill implements Serializable{

	public Swim(Strength attribute, int rank) {
		super(attribute, rank, false);
	}	
}

