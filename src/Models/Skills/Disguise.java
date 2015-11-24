package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class Disguise extends Skill implements Serializable {
	
	
	public Disguise(Charisma attribute, int rank){
	
	super(attribute,rank,false);
	}
}
