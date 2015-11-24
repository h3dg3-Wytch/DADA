package Models.Skills;

import Models.Attributes.Wisdom;

import java.io.Serializable;

public class Perception extends Skill implements Serializable{

	public Perception(Wisdom attribute, int rank, boolean isClassSkill) {
		super(attribute, rank, false);
	}	
}
