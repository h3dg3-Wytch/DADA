/**
 *
 * @author Morgan Miller
 */
package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import java.io.Serializable;

public class Halfling extends Race implements Serializable
{

    @Override
    public void modifyAttributes(Attributes attributes)
    {
        Attribute dex = attributes.getDexterity();
        Attribute cha = attributes.getCharisma();
        Attribute str = attributes.getStrength();

        dex.setAbilityScore((dex.getAbilityScore() + 2));
        cha.setAbilityScore((cha.getAbilityScore() + 2));
        str.setAbilityScore((str.getAbilityScore() - 2));
    }

}
