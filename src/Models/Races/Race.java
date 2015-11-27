package Models.Races;

import Models.Attributes.Attributes;

import java.io.Serializable;

/**
 * Created by Rex on 11/10/2015.
 */
public abstract class Race implements Serializable {

    public Race(){

    }

    public abstract void modifyAttributes(Attributes attributes);

}
