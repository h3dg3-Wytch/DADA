package Models.Skills;

import Models.Attributes.Wisdom;

import java.io.Serializable;
public class Profession extends Skill implements Serializable {

	private String professionDescription;
	public Profession(Wisdom attribute, int rank,String nameofProfession) {
		super(attribute, rank, false);
		professionDescription = nameofProfession;
	}
	public String getProfessionDescription() {
		return professionDescription;
	}
	
	

}
