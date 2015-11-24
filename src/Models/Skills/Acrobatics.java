package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class Acrobatics extends Skill implements Serializable{ 

	public Acrobatics(Dexterity attribute, int rank){
		
		super(attribute,rank, false);
	
}


}
