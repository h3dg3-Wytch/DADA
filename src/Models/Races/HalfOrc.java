/**
 *
 * @author Morgan Miller
 */

package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import java.io.Serializable;

public class HalfOrc extends Race implements Serializable
{

<<<<<<< HEAD
    public enum AbilityBoost
    {

=======
    /** purpose of enum is to allow the user to select which ability
     *  gets the plus 2 variable
    */
    public enum AbilityBoost
    {
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
        STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;
    }

    private AbilityBoost abilityBoost;

    public HalfOrc(AbilityBoost abilityBoost)
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
<<<<<<< HEAD

=======
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
}
