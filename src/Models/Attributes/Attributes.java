package Models.Attributes;

import java.io.Serializable;

/*
 created By Harsh Patel
 */
public class Attributes implements Serializable
{

    private Constitution constitution;
    private Wisdom wisdom;
    private Charisma charisma;
    private Intelligence intelligence;
    private Strength strength;
    private Dexterity dexterity;

    //Test comment
    public Attributes(Constitution constitution, Wisdom wisdom, Charisma charisma, Intelligence intelligence,
            Strength strength, Dexterity dexterity)
    {
        this.constitution = constitution;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.strength = strength;
        this.dexterity = dexterity;
    }

    public Attributes()
    {
        this.constitution = new Constitution(0);
        this.wisdom = new Wisdom(0);
        this.charisma = new Charisma(0);
        this.intelligence = new Intelligence(0);
        this.strength = new Strength(0);
        this.dexterity = new Dexterity(0);
    }

    public Dexterity getDexterity()
    {
        return dexterity;
    }

    public void setDexterity(Dexterity dexterity)
    {
        this.dexterity = dexterity;
    }

    public Constitution getConstitution()
    {
        return constitution;
    }

    public void setConstitution(Constitution constitution)
    {
        this.constitution = constitution;
    }

    public Wisdom getWisdom()
    {
        return wisdom;
    }

    public void setWisdom(Wisdom wisdom)
    {
        this.wisdom = wisdom;
    }

    public Charisma getCharisma()
    {
        return charisma;
    }

    public void setCharisma(Charisma charisma)
    {
        this.charisma = charisma;
    }

    public Intelligence getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence)
    {
        this.intelligence = intelligence;
    }

    public Strength getStrength()
    {
        return strength;
    }

    public void setStrength(Strength strength)
    {
        this.strength = strength;
    }
}
