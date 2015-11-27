//Morgan Miller -- For SelectCombatFrame

package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import main.Participant;

public class TargetsPanel extends JPanel
{

    private final TargetsPanel panel = this;

    public TargetsPanel()
    {
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
         
        setLayout(layout);
        setBackground(Color.white);
        setBorder(BorderFactory.createTitledBorder("Targets"));
    }

    public void addParticipant(final Participant p)
    {
        Thread update = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                ParticipantPanel participant = new ParticipantPanel(p);
                panel.add(participant);
                panel.revalidate();
            }
        });
        SwingUtilities.invokeLater(update);
    }

}
