/**
 * Created by Morgan Miller on 11/5/2015.
 */

package Models.etc;

public class ToolTipObject
{
    private String label = "", value = "";
    public ToolTipObject(String label, String value)
    {
        this.label = label;
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public String getLabel()
    {
        return label;
    }
}
