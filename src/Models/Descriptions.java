package Models;

import java.io.Serializable;

public class Descriptions implements Serializable
{

    private String name, playerName, deity, homeland, size, gender, hairColor, eyeColor;
    private int age, weight;

    public Descriptions()
    {
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPlayerName(String s)
    {
        playerName = s;
    }

    public void setDeity(String s)
    {
        deity = s;
    }

    public void setHomeland(String s)
    {
        homeland = s;
    }

    public void setSize(String s)
    {
        size = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setHairColor(String s)
    {
        hairColor = s;
    }

    public void setEyeColor(String s)
    {
        eyeColor = s;
    }

    public void setAge(int i)
    {
        age = i;
    }

    public void setWeight(int i)
    {
        weight = i;
    }

    public String getName()
    {
        return name;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public String getDeity()
    {
        return deity;
    }

    public String getHomeland()
    {
        return homeland;
    }

    public String getSize()
    {
        return size;
    }

    public String getGender()
    {
        return gender;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }
}
