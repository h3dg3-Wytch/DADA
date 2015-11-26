package Models.Skills;

import Models.Attributes.Intelligence;

import java.io.Serializable;

public class Appraise extends Skill implements Serializable {

   public Appraise(Intelligence attribute,int rank){
	   
	   super(attribute, rank, false);
	   
   }

   

}
