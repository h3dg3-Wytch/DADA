/**
 *
 * @author Morgan Miller
 */
package View.GUI;

import Models.Entity.Entity;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TargetsPanel extends JPanel
{
    private final CombatFrame parent;
    private final TargetsPanel panel = this;

    public TargetsPanel(CombatFrame parent)
    {
        this.parent = parent;
        
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
         
        setLayout(layout);
        setBackground(Color.white);
        setBorder(BorderFactory.createTitledBorder("Targets"));
    }

    public void addEntity(final Entity e)
    {
        Thread update = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                TargetPanel target = new TargetPanel(e, parent);
                panel.add(target);
                panel.revalidate();
            }
        });
        SwingUtilities.invokeLater(update);
    }
    
    public void removeTarget(TargetPanel target)
    {
        panel.remove(target);
        panel.revalidate();
    }
}
