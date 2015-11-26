/**
 *
 * @author Morgan Miller
 */

package Models.Equipment;

public class Armor
{
    public enum ArmorType
    {

        CLOTH, LEATHER, MAIL, PLATE;

    }

    private ArmorType type;

    private String description, name;
    private int weight, acBonus;

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

    public void setType(ArmorType type)
    {
        this.type = type;
    }

    public void setACBonus(int bonus)
    {
        this.acBonus = bonus;
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

    public ArmorType getType()
    {
        return type;
    }

    public int getACBonus()
    {
        return acBonus;
    }
}
