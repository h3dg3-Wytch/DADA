/**
 *
 * @author Morgan Miller
 */

package Models.Equipment;

import java.io.Serializable;

public class Weapon implements Serializable
{
    private String description, properties, name;
    private int weight, attackBonus;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void setAttackBonus(int bonus)
    {
        this.attackBonus = bonus;
    }
    public void setProperties(String properties)
    {
        this.properties = properties;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getAttackBonus()
    {
        return attackBonus;
    }
    
    public String getProperties()
    {
        return properties;
    }
}
