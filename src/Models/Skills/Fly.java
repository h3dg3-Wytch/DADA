package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class Fly extends Skill implements Serializable{

	public Fly(Dexterity attribute, int rank){
		
		super(attribute,rank,false);
	}

}
