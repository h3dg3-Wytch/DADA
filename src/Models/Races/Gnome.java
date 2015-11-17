package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import org.w3c.dom.Attr;

import java.io.Serializable;

/**
 * Created by Rex on 11/10/2015.
 */
public class Gnome extends Race implements Serializable {
    @Override
    public void modifyAttributes(Attributes attributes) {
        Attribute cha = attributes.getCharisma();
        Attribute con = attributes.getConstitution();
        Attribute str = attributes.getStrength();

        cha.setAbilityScore((cha.getAbilityScore() + 2));
        con.setAbilityScore((con.getAbilityScore() + 2));
        str.setAbilityScore((str.getAbilityScore() - 2 ));

    }
}
