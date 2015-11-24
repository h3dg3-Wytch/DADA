package Models.Skills;

import Models.Attributes.Wisdom;

import java.io.Serializable;

public class SenseMotive extends Skill implements Serializable{

	public SenseMotive(Wisdom attribute, int rank) {
		super(attribute, rank, false);
	}	
}

