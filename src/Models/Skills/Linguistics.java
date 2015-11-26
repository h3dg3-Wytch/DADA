package Models.Skills;

import Models.Attributes.Intelligence;

import java.io.Serializable;


public class Linguistics extends Skill implements Serializable{
private String languagelearned;	

public Linguistics(Intelligence attribute, int rank, String languagelearned){
	super(attribute,rank,false);
	this.languagelearned = languagelearned;
}
public String getLanguageLearned(){
	return this.languagelearned;
}
}
