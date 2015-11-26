package Models.Skills;

import Models.Attributes.Intelligence;

import java.io.Serializable;

public class SpellCraft extends Skill implements Serializable{

	public SpellCraft(Intelligence attribute, int rank) {
		super(attribute, rank, false);
	}	
}

