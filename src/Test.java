import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Attributes.Constitution;
import Models.Craft;
import Models.Attributes.Strength;
import Models.Races.Gnome;

/**
 * Created by Rex on 11/6/2015.
 */
public class Test {

    public static void main(String[] args){

       Attributes attributes = new Attributes();
        attributes.setStrength(new Strength(10));

       Gnome gnome = new Gnome();
        gnome.modifyAttributes(attributes);
        System.out.println(attributes.getStrength().getAbilityScore());





    }
}
