/**
 *
 * @author Morgan Miller
 */

package Models.etc;

import java.io.Serializable;

public class Level implements Serializable
{

    private int experience;

    public void giveExperience(int experience)
    { if(getLevel() != 20) {
        this.experience += experience;
    }
    }


    public int getLevel()
    {
        if (experience < 2000)
        {
            return 1;
        }
        else if (experience >= 2000 && experience < 5000)
        {
            return 2;
        }
        else if (experience >= 5000 && experience < 9000)
        {
            return 3;
        }
        else if (experience >= 9000 && experience < 15000)
        {
            return 4;
        }
        else if (experience >= 15000 && experience < 23000)
        {
            return 5;
        }
        else if (experience >= 23000 && experience < 35000)
        {
            return 6;
        }
        else if (experience >= 35000 && experience < 51000)
        {
            return 7;
        }
        else if (experience >= 51000 && experience < 75000)
        {
            return 8;
        }
        else if (experience >= 75000 && experience < 105000)
        {
            return 9;
        }
        else if (experience >= 105000 && experience < 155000)
        {
            return 10;
        }
        else if (experience >= 155000 && experience < 220000)
        {
            return 11;
        }
        else if (experience >= 220000 && experience < 315000)
        {
            return 12;
        }
        else if (experience >= 315000 && experience < 445000)
        {
            return 13;
        }
        else if (experience >= 445000 && experience < 635000)
        {
            return 14;
        }
        else if (experience >= 635000 && experience < 890000)
        {
            return 15;
        }
        else if (experience >= 890000 && experience < 1300000)
        {
            return 16;
        }
        else if (experience >= 1300000 && experience < 1800000)
        {
            return 17;
        }
        else if (experience >= 1800000 && experience < 2550000)
        {
            return 18;
        }
        else if (experience >= 2550000 && experience < 3600000)
        {
            return 19;
        }
        else
        {
            return 20;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void levelUp(){
        if(getLevel() != 20) {
            int tmp = getLevel();
            while (tmp == getLevel()) {
                giveExperience(1000);
            }
        }
    }

}
