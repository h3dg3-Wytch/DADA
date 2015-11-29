/**
 * Created by Morgan Miller on 11/5/2015.
 */

package Models.etc;


import java.util.ArrayList;

public class ToolTip extends ArrayList<ToolTipObject>
{
    public ToolTip()
    {
        
    }

    public String getDisplayString()
    {
        String toolTipText = "<html><table border=\"0\" cellpadding=\"0\">";
        String endText = "</table></html>";

        for(int i = 0; i < this.size(); i++)
        {
            toolTipText += "<tr><td>" + get(i).getLabel() +  "</td><td>&nbsp;&nbsp;"+ get(i).getValue() +  "</td></tr>";
        }

        toolTipText += endText;

        return toolTipText;
    }

}
