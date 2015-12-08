/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI;

import Models.Entity.Entity;
import View.Images.ImageLoader;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Maia
 */
public class OptionsFrame extends javax.swing.JFrame
{

    private final MainMenuFrame mainFrame;

    public OptionsFrame(MainMenuFrame mainFrame)
    {
        super("Options");
        
        try
        {
            BufferedImage image = ImageIO.read(ImageLoader.loadImage("Icon.png"));
            setIconImage(image);
        }
        catch (IOException ex)
        {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.mainFrame = mainFrame;

        initComponents();

        buttonGroup.add(showButton);
        buttonGroup.add(hideButton);

        if(Entity.hideStats)
        {
            buttonGroup.setSelected(hideButton.getModel(), true);
        }
        else
        {
            buttonGroup.setSelected(showButton.getModel(), true);
        }

        initListeners();
    }

    public void initListeners()
    {
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent windowEvent)
            {
                mainFrame.enableButtons();
                dispose();
            }
        });

        showButton.addItemListener(new ItemListener()
        {

            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    Entity.hideStats = false;
                }
            }
        });

        hideButton.addItemListener(new ItemListener()
        {

            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    Entity.hideStats = true;
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup = new javax.swing.ButtonGroup();
        showButton = new javax.swing.JRadioButton();
        hideButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup.add(showButton);
        showButton.setText("Show stats during combat");

        buttonGroup.add(hideButton);
        hideButton.setText("Hide stats during combat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showButton)
                    .addComponent(hideButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(showButton)
                .addGap(18, 18, 18)
                .addComponent(hideButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton hideButton;
    private javax.swing.JRadioButton showButton;
    // End of variables declaration//GEN-END:variables
}
