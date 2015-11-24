package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;
public class Perform extends Skill implements Serializable {

	private String skillPerformed;
	public Perform(Charisma attribute, int rank, String nameofPerform) {
		super(attribute, rank, false);
		skillPerformed = nameofPerform;	
	}
	public String getPerformDescription(){
		return this.skillPerformed;
	}

}
