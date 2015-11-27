/**
 * Created by Morgan Miller on 11/5/2015.
 */
package Models.Skills;

import Models.Attributes.Intelligence;

import java.io.Serializable;

public class Knowledge extends Skill implements Serializable
{

    public enum KnowledgeType
    {

        ARCANA, DUNGEONEERING, ENGINEERING, GEOGRAPHY, HISTORY, LOCAL,
        NATURE, NOBILITY, PLANES, RELIGION;

    }

    private KnowledgeType type;

    public Knowledge(Intelligence attribute, int rank, KnowledgeType type)
    {
        super(attribute, rank, false);
        this.type = type;
    }

    public String getDescription()
    {
        // better descrptions can be put here
        switch (type)
        {
            case ARCANA:
            {
                return "Arcana";
            }
            case DUNGEONEERING:
            {
                return "Dungeoneering";
            }
            case ENGINEERING:
            {
                return "Engineering";
            }
            case GEOGRAPHY:
            {
                return "Geography";
            }
            case HISTORY:
            {
                return "History";
            }
            case LOCAL:
            {
                return "Local";
            }
            case NATURE:
            {
                return "Nature";
            }
            case NOBILITY:
            {
                return "Nobility";
            }
            case PLANES:
            {
                return "Planes";
            }
            case RELIGION:
            {
                return "Religion";
            }
            default:
            {
               return "No information";
            }
        }
    }

}
