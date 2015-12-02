/**
 *
 * @author Morgan Miller
 */

package Models.etc;

import Models.Dice.Dice;

import java.io.Serializable;

public class Money implements Serializable
{

    private int gold, silver, copper;

    public Money()
    {
        // to be implemented when character classes are done
    }

    public void addMoney(int gold, int silver, int copper)
    {
        // convert
        if (copper >= 100)
        {
            silver += copper / 100;
            copper = copper % 100;
        }

        if (silver >= 100)
        {
            gold += silver / 100;
            silver = silver % 100;
        }

        this.copper += copper;
        this.silver += silver;
        this.gold += gold;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getCopper() {
        return copper;
    }

    public void setCopper(int copper) {
        this.copper = copper;
    }

    public void useMoney(int gold, int silver, int copper)
    {
        // convert
        if (copper >= 100)
        {
            silver += copper / 100;
            copper = copper % 100;
        }

        if (silver >= 100)
        {
            gold += silver / 100;
            silver = silver % 100;
        }

        this.copper -= copper;

        this.silver -= silver;
        this.gold -= gold;
    }

    public int generateStartingGold(){
        return Dice.rolld6() * 50;
    }

    @Override
    public String toString()
    {
        return gold + ", " + silver + ", " + copper;
    }
}
