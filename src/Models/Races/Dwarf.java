/**
 *
 * @author Morgan Miller
 */

package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import java.io.Serializable;

public class Dwarf extends Race implements Serializable
{

    @Override
    public void modifyAttributes(Attributes attributes)
    {
        Attribute con  = attributes.getConstitution();
        Attribute wis = attributes.getWisdom();
        Attribute cha = attributes.getCharisma();

        con.setAbilityScore((con.getAbilityScore() + 2));
        wis.setAbilityScore((wis.getAbilityScore() + 2));
        cha.setAbilityScore((cha.getAbilityScore() - 2 ));
    }
    
}
