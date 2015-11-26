package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class HandleAnimal extends Skill implements Serializable {

	public HandleAnimal(Charisma attribute, int rank) {
		super(attribute, rank, false);
		
	}

}
