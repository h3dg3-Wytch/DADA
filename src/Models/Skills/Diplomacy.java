package Models.Skills;

import Models.Attributes.Charisma;

import java.io.Serializable;

public class Diplomacy  extends Skill implements Serializable{

   public Diplomacy (Charisma attribute, int rank){
	   
	   super(attribute, rank,false);
   } 

}
