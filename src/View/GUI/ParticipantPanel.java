//Morgan Miller  --- for SelectCombatFrame

package View.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Participant;

public class ParticipantPanel extends JPanel
{

    private JLabel label;
    private Participant participant;

    private final int str = 0;
    private int index = 0;

    public ParticipantPanel(Participant participant)
    {
        super(new FlowLayout(FlowLayout.LEFT, 10, 5));
        this.participant = participant;

        label = new JLabel(participant.getName());
        label.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

        label.setToolTipText(participant.getToolTip());

        add(label);
        setBackground(Color.white);

        initListeners();

    }

    private void initListeners()
    {
        label.addMouseListener(new MouseListener()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                label.setForeground(Color.blue);
                label.setToolTipText(participant.getToolTip());
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                label.setForeground(Color.black);
            }
        });

    }

}
