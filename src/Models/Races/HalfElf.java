
package Models.Races;

import java.io.Serializable;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import org.w3c.dom.Attr;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Races.Race;
import java.io.Serializable;

/**
 * Created by krushan on 11/23/15.
 */
public class HalfElf extends Race implements Serializable {

    public class HalfElf extends Race implements Serializable
{

    public enum AbilityBoost
    {

        STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;
    }

    private AbilityBoost abilityBoost;

    public HalfElf(AbilityBoost abilityBoost)
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
