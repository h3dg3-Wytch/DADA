package Models.Skills;

import Models.Attributes.Dexterity;

import java.io.Serializable;

public class EscapeArtist extends Skill implements Serializable{

	public EscapeArtist(Dexterity attribute, int rank){
		
		super(attribute,rank, false);
	}
}
