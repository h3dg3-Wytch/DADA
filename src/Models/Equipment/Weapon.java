/**
 *
 * @author Morgan Miller
 */

package Models.Equipment;

import Models.Entity.Entity;
import Models.etc.Money;

import java.io.Serializable;

public class Weapon implements Serializable
{

    private String description, properties, name;
    private int weight, attackBonus;
    private boolean isRanged;
    private int gold;

    public Weapon(String description, String properties, String name, int weight, int attackBonus, boolean isRanged, int gold) {
        this.description = description;
        this.properties = properties;
        this.name = name;
        this.weight = weight;
        this.attackBonus = attackBonus;
        this.isRanged = isRanged;
        this.gold = gold;
    }

    public Weapon() {
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

    public boolean isRanged() {
        return isRanged;
    }

    public void setIsRanged(boolean isRanged) {
        this.isRanged = isRanged;
    }


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


