package Models.Races;

import Models.Attributes.Attribute;
import Models.Attributes.Attributes;
import Models.Attributes.Intelligence;

import java.io.Serializable;

/**
 * Created by Rex on 11/10/2015.
 */
public class Human extends Race implements Serializable{
    @Override
    public void modifyAttributes(Attributes attributes) {
        //Ignore this one, this is just required
    }

    public void modifyAttribute(Attribute attribute){

    }
}
