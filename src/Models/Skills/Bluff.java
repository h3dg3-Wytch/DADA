package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class Bluff extends Skill implements Serializable {

	public Bluff(Charisma attribute, int rank){
		
		super(attribute,rank, false);
	}
}
