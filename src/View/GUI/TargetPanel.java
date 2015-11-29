/**
 *
 * @author Morgan Miller
 */
package View.GUI;

import Models.Entity.Entity;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TargetPanel extends JPanel
{

    private Entity entity;
    private JLabel label;
    
    public TargetPanel(Entity entity)
    {
        super(new FlowLayout(FlowLayout.LEFT, 10, 5));
        this.entity = entity;

        label = new JLabel(entity.getDescriptions().getName());
        label.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

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
                label.setToolTipText(entity.getToolTip());
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                label.setForeground(Color.black);
            }
        });

    }
}
