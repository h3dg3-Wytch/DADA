package Models;

import Models.Attributes.Attribute;

import java.io.Serializable;

/**
 * Created by Rex on 11/8/2015.
 */

//An abstract version of the Skills
public abstract class  Skill implements Serializable {
    //Using inheritance, we keep a broad attribute variable, because each skill
    //is linked to a SPECIFIC attribute. THIS ATTRIBUTE WILL NEVER CHANGE.
    protected Attribute attribute;
    protected int abilityModifier;
    // The amount of ranks in a skill
    protected int ranks;
    protected int miscMod;
    //Whether this is a class skill or not.
    protected boolean isClassSkill;

    public Skill(Attribute attribute, int rank, boolean isClassSkill){
        this.attribute = attribute;
        this.abilityModifier = attribute.getAbilityModifier();
        this.ranks = rank;
        this.miscMod = 0;
        this.isClassSkill = isClassSkill;
    }

    public Attribute getAttribute(){
        return this.attribute;
    }

    public int getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(int abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public int getMiscMod() {
        return miscMod;
    }

    public void setMiscMod(int miscMod) {
        this.miscMod = miscMod;
    }

    public boolean isClassSkill() {
        return isClassSkill;
    }

    public void setClassSkill(boolean classSkill) {
        isClassSkill = classSkill;
    }


}
