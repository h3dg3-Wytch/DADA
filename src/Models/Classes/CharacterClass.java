package Models.Classes;

import Models.etc.Ability;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Alex on 11/27/15.
 */
public abstract class CharacterClass implements Serializable {

    protected ArrayList<Ability> classAbilites;
}
