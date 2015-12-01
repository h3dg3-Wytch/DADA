package Models.etc;

import java.io.Serializable;

public class Descriptions implements Serializable
{

    private String name, description, playerName, deity, homeland, size, gender, palette;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private int age, weight;

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

    public String getPalette() {
        return palette;
    }

    public void setPalette(String palette) {
        this.palette = palette;
    }

    public void setGender(String s)
    {
        gender = s;
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
