package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class Intimidate extends Skill implements Serializable{

	public Intimidate(Charisma attribute, int rank) {
		super(attribute, rank, false);
		
	}

}
