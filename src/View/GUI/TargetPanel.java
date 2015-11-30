/**
 *
 * @author Morgan Miller
 */
package View.GUI;

import Models.Dice.Dice;
import Models.Entity.Entity;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TargetPanel extends JPanel
{

    private Entity entity;
    private JLabel label;
    private CombatFrame parent;
    private TargetPanel panel;

    public TargetPanel(Entity entity, CombatFrame parent)
    {
        super(new FlowLayout(FlowLayout.LEFT, 10, 5));
        this.entity = entity;
        this.parent = parent;
        this.panel = this;

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
                if (parent.getAction() == null)
                {
                    JOptionPane.showMessageDialog(parent, "No action selected", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (parent.getDie() == null)
                {
                    JOptionPane.showMessageDialog(parent, "No die selected", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    String die = parent.getDie();
                    int roll = 0;

                    switch (die)
                    {
                        case "4":
                        {
                            roll = Dice.rolld4();
                            break;
                        }
                        case "6":
                        {
                            roll = Dice.rolld6();
                            break;
                        }
                        case "8":
                        {
                            roll = Dice.rolld8();
                            break;
                        }
                        case "10":
                        {
                            roll = Dice.rolld10();
                            break;
                        }
                        case "12":
                        {
                            roll = Dice.rolld12();
                            break;
                        }
                        case "20":
                        {
                            roll = Dice.rolld20();
                            break;
                        }
                    };

                    System.out.println(roll);
                    entity.setHealthPoints(entity.getHealthPoints() - roll);

                    if (entity.getHealthPoints() < 0)
                    {
                        parent.removeTarget(panel);
                    }
                }

            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

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

    public Entity getEntity()
    {
        return entity;
    }
}
