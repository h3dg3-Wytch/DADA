/**
 *
 * @author Morgan Miller
 */

package Models.etc;

public class Money
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

    @Override
    public String toString()
    {
        return gold + ", " + silver + ", " + copper;
    }
}
