package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Attributes.Intelligence;

import java.io.Serializable;

/**
 * Created by Rex on 11/10/2015.
 */
public class Human extends Race implements Serializable{


    /** purpose of enum is to allow the user to select which ability
     *  gets the plus 2 variable
     */
    public enum AbilityBoost
    {

        STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;
    }

    private AbilityBoost abilityBoost;

    public Human(AbilityBoost abilityBoost)
    {
        this.abilityBoost = abilityBoost;
    }

    @Override
    public void modifyAttributes(Attributes attributes)
    {
        switch (abilityBoost)
        {
            case STRENGTH:
            {
                Attribute str = attributes.getStrength();
                str.setAbilityScore((str.getAbilityScore() + 2));
                break;
            }
            case DEXTERITY:
            {
                Attribute dex = attributes.getDexterity();
                dex.setAbilityScore((dex.getAbilityScore() + 2));
                break;
            }
            case CONSTITUTION:
            {
                Attribute con = attributes.getConstitution();
                con.setAbilityScore((con.getAbilityScore() + 2));
                break;
            }
            case INTELLIGENCE:
            {
                Attribute intl = attributes.getIntelligence();
                intl.setAbilityScore((intl.getAbilityScore() + 2));
                break;
            }
            case WISDOM:
            {
                Attribute wis = attributes.getWisdom();
                wis.setAbilityScore((wis.getAbilityScore() + 2));
                break;
            }
            case CHARISMA:
            {
                Attribute cha = attributes.getCharisma();
                cha.setAbilityScore((cha.getAbilityScore() + 2));
                break;
            }
            default:
            {
                break;
            }
        }
    }
}
