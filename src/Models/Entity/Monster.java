package Models.Entity;

import Models.etc.Descriptions;
import java.io.Serializable;

/**
 * Created by Alex on 11/28/15.
 */
public class Monster extends Entity implements Serializable
{

    public void Monster()
    {
        Descriptions descriptions = new Descriptions();
        setDescriptions(descriptions);
    }

    @Override
    public void calculateHP()
    {

    }

    @Override
    public void caluclateArmorClass()
    {

    }

    @Override
    public void calculateCMB()
    {

    }

    @Override
    public void calculateCMD()
    {

    }

    @Override
    public void calculateInititiative()
    {

    }

    @Override
    public void calculateBaseAttackBonus()
    {

    }

    @Override
    public void calculateTouchArmor()
    {

    }

    @Override
    public void calculateFlatFooted()
    {

    }

    @Override
    public void calculateFortitude() {

    }

    @Override
    public void calculateReflex() {

    }

    @Override
    public void calculateWill() {

    }

    @Override
    public int compareTo(Entity e)
    {
        return Integer.compare(this.getInitiative(), e.getInitiative());
    }
}
