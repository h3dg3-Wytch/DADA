/**
 *
 * @author Morgan Miller
 */

package Models.Equipment;

import Models.etc.Money;

import java.io.Serializable;

public class Armor implements Serializable
{
    public enum ArmorType
    {

        CLOTH, LEATHER, MAIL, PLATE;

    }

    private ArmorType type;

    private String description, properties, name;
    private int weight, acBonus;
    private int gold;

    public int getAcBonus() {
        return acBonus;
    }

    public void setAcBonus(int acBonus) {
        this.acBonus = acBonus;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Armor(ArmorType type, String description, String properties, String name, int weight, int acBonus, int gold) {
        this.type = type;
        this.description = description;
        this.properties = properties;
        this.name = name;
        this.weight = weight;
        this.acBonus = acBonus;
        this.gold = gold;
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

    public ArmorType getType()
    {
        return type;
    }

    public int getACBonus()
    {
        return acBonus;
    }
    
    public String getProperties()
    {
        return properties;
    }
    //Can see if you can purchase this item
    public boolean canBePurchased(Money money){
        System.out.println(money.getGold());
        System.out.println(gold);
        if((money.getGold() - this.gold) >= 0) {
            money.setGold(money.getGold() - gold);
            return true;
        }else{
            return false;
        }

    }
}
