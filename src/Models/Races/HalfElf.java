
package Models.Races;

<<<<<<< HEAD
import java.io.Serializable;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import org.w3c.dom.Attr;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Races.Race;
=======
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
import java.io.Serializable;

/**
 * Created by krushan on 11/23/15.
 */
<<<<<<< HEAD

    public class HalfElf extends Race implements Serializable {

        public enum AbilityBoost {

            STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;
        }

        private AbilityBoost abilityBoost;

        public HalfElf(AbilityBoost abilityBoost) {
            this.abilityBoost = abilityBoost;
        }

        @Override
        public void modifyAttributes(Attributes attributes) {
            switch (abilityBoost) {
                case STRENGTH: {
                    Attribute str = attributes.getStrength();
                    str.setAbilityScore((str.getAbilityScore() + 2));
                    break;
                }
                case DEXTERITY: {
                    Attribute dex = attributes.getDexterity();
                    dex.setAbilityScore((dex.getAbilityScore() + 2));
                    break;
                }
                case CONSTITUTION: {
                    Attribute con = attributes.getConstitution();
                    con.setAbilityScore((con.getAbilityScore() + 2));
                    break;
                }
                case INTELLIGENCE: {
                    Attribute intl = attributes.getIntelligence();
                    intl.setAbilityScore((intl.getAbilityScore() + 2));
                    break;
                }
                case WISDOM: {
                    Attribute wis = attributes.getWisdom();
                    wis.setAbilityScore((wis.getAbilityScore() + 2));
                    break;
                }
                case CHARISMA: {
                    Attribute cha = attributes.getCharisma();
                    cha.setAbilityScore((cha.getAbilityScore() + 2));
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

=======
public class HalfElf extends Race implements Serializable {

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
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
