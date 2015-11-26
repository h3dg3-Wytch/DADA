package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class UseMagicDevice extends Skill implements Serializable{

	public UseMagicDevice(Charisma attribute, int rank) {
		super(attribute, rank, false);
	}	
}

