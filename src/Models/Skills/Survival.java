package Models.Skills;

import Models.Attributes.Wisdom;

import java.io.Serializable;

public class Survival extends Skill implements Serializable{

	public Survival(Wisdom attribute, int rank) {
		super(attribute, rank, false);
	}	
}

