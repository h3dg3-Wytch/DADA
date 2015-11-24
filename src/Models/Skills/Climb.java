package Models.Skills;

import Models.Attributes.Intelligence;

import java.io.Serializable;

public class Climb extends Skill implements Serializable{

	public Climb(Intelligence attribute, int rank){
		
		super(attribute,rank,false);
		
	}
}
