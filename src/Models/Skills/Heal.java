package Models.Skills;

import Models.Attributes.Wisdom;

import java.io.Serializable;

public class Heal extends Skill implements Serializable {


	public Heal(Wisdom attribute, int rank) {
		super(attribute, rank, false);
		
	}

	
}
