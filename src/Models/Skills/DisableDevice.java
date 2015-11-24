package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class DisableDevice extends Skill implements Serializable {

	public DisableDevice(Dexterity attribute, int rank){
		
		super(attribute,rank,false);
	}
}
