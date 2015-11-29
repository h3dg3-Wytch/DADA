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
    protected void calculateHP()
    {

    }

    @Override
    protected void caluclateArmorClass()
    {

    }

    @Override
    protected void calculateCMB()
    {

    }

    @Override
    protected void calculateCMD()
    {

    }

    @Override
    protected void calculateInititiative()
    {

    }

    @Override
    protected void calculateBaseAttackBonus()
    {

    }

    @Override
    protected void calculateTouchArmor()
    {

    }

    @Override
    protected void calculateFlatFooted()
    {

    }

    @Override
    public int compareTo(Entity e)
    {
        return Integer.compare(this.getInitiative(), e.getInitiative());
    }
}
