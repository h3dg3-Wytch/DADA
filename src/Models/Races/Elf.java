
package Models.Races;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Races.Race;
import java.io.Serializable;

import java.io.Serializable;
import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import org.w3c.dom.Attr;
/**
 * Created by krushan on 11/15/15.
 */
public  class Elf extends Race implements Serializable{
        public void modifyAttributes(Attributes attributes){
            Attribute dex = attributes.getDexterity();
            Attribute intl = attributes.getIntelligence();
            Attribute con = attributes.getConstitution();

            dex.setAbilityScore((dex.getAbilityScore())+2);
            intl.setAbilityScore((intl.getAbilityScore())+2);
            con.setAbilityScore((con.getAbilityScore())-2);
        }

}
