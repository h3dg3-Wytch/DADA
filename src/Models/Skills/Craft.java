package Models.Skills;

import Models.Attributes.Strength;

import java.io.Serializable;

/**
 * Created by Rex on 11/8/2015.
 */
public class Craft extends Skill implements Serializable {

    private String craftDescription;

    public Craft(Strength attribute, int rank, String nameOfCraft, boolean isClassSkill) {
        super(attribute, rank, false);
        craftDescription = nameOfCraft;
    }

    public String getCraftDescirption(){
        return this.craftDescription;
    }


}
