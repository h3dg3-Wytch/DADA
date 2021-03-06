package View.GUI;

import Models.Databases.EntityManager;
import Models.Entity.Entity;
import Models.Entity.Monster;
import View.Images.ImageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CombatFrame extends javax.swing.JFrame
{

    private List<Entity> entities;
    private ArrayList<Models.Entity.Character> characters;
    private ArrayList<Monster> monsters;
    private TargetsPanel targetsPanel;
    private Entity currentEntity;
    private int turnIndex;
    private final MainMenuFrame mainFrame;

    public CombatFrame(List<Models.Entity.Character> characters, List<Monster> monsters, MainMenuFrame mainFrame)
    {
        super("Combat");

        try
        {
            BufferedImage image = ImageIO.read(ImageLoader.loadImage("Icon.png"));
            setIconImage(image);
        }
        catch (IOException ex)
        {
            Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.entities = new ArrayList();
        this.characters = new ArrayList(characters);
        this.monsters = new ArrayList(monsters);
        this.mainFrame = mainFrame;

        for (int i = 0; i < this.characters.size(); i++)
        {
            entities.add(this.characters.get(i));
        }

        for (int i = 0; i < this.monsters.size(); i++)
        {
            entities.add(this.monsters.get(i));
        }

        Collections.sort(entities);
        Collections.reverse(entities);
        turnIndex = 0;
        currentEntity = entities.get(turnIndex);

        initComponents();
        initGUI();

        buttonGroup1.add(attackOption);
        buttonGroup1.add(spellHealOption);
        buttonGroup1.add(spellCombatOption);
        buttonGroup1.add(spellProtectiveOption);
        buttonGroup1.add(spellWeakeningOption);
        buttonGroup1.setSelected(attackOption.getModel(), true);

        buttonGroup2.add(d4);
        buttonGroup2.add(d6);
        buttonGroup2.add(d8);
        buttonGroup2.add(d10);
        buttonGroup2.add(d12);
        buttonGroup2.add(d20);
        buttonGroup2.setSelected(d4.getModel(), true);

        initListeners();
    }

    private void initGUI()
    {
        attackOption.setActionCommand("attack");
        spellHealOption.setActionCommand("spellHeal");
        spellCombatOption.setActionCommand("spellCombat");
        spellProtectiveOption.setActionCommand("spellProtective");
        spellWeakeningOption.setActionCommand("spellWeakening");

        d4.setActionCommand("4");
        d6.setActionCommand("6");
        d8.setActionCommand("8");
        d10.setActionCommand("10");
        d12.setActionCommand("12");
        d20.setActionCommand("20");

        nameLabel.setText(currentEntity.getDescriptions().getName());
        targetsPanel = new TargetsPanel(this);
        jPanel1.add(targetsPanel);
        jScrollPane1.setViewportView(targetsPanel);

        for (int i = 0; i < entities.size(); i++)
        {
            targetsPanel.addEntity((Entity) entities.get(i));
        }
    }

    private void initListeners()
    {
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent windowEvent)
            {
                EntityManager.saveAll(characters, monsters);
                mainFrame.enableButtons();
                dispose();
            }
        });

        nextButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!entities.isEmpty())
                {
                    if (!entities.isEmpty())
                    {
                        if (turnIndex == entities.size() - 1)
                        {
                            turnIndex = 0;
                        }
                        else
                        {
                            turnIndex++;
                        }
                        currentEntity = entities.get(turnIndex);
                        nameLabel.setText(currentEntity.getDescriptions().getName());
                    }
                }
            }
        });

    }

    public String getAction()
    {
        if (buttonGroup1.getSelection() == null)
        {
            return null;
        }
        return buttonGroup1.getSelection().getActionCommand();
    }

    public String getDie()
    {
        if (buttonGroup2.getSelection() == null)
        {
            return null;
        }
        return buttonGroup2.getSelection().getActionCommand();
    }

    public void removeTarget(TargetPanel target)
    {
        entities.remove(target.getEntity());

        if (turnIndex != -1)
        {
            turnIndex--;
        }
        targetsPanel.removeTarget(target);
        repaint();
    }

    public Entity getCurrentEntity()
    {
        return currentEntity;
    }

    public void giveExperience(int exp)
    {
        for (int i = 0; i < characters.size(); i++)
        {
            Models.Entity.Character character = characters.get(i);

            if (character.getHealthPoints() >= 0)
            {
                character.getLevel().giveExperience(exp);
            }
        }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        d4 = new javax.swing.JRadioButton();
        d6 = new javax.swing.JRadioButton();
        d8 = new javax.swing.JRadioButton();
        d10 = new javax.swing.JRadioButton();
        d12 = new javax.swing.JRadioButton();
        d20 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        attackOption = new javax.swing.JRadioButton();
        spellHealOption = new javax.swing.JRadioButton();
        spellCombatOption = new javax.swing.JRadioButton();
        spellProtectiveOption = new javax.swing.JRadioButton();
        spellWeakeningOption = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dice"));

        d4.setText("4");

        d6.setText("6");

        d8.setText("8");

        d10.setText("10");

        d12.setText("12");

        d20.setText("20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d4)
                    .addComponent(d6)
                    .addComponent(d8)
                    .addComponent(d10)
                    .addComponent(d12)
                    .addComponent(d20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d4)
                .addGap(18, 18, 18)
                .addComponent(d6)
                .addGap(18, 18, 18)
                .addComponent(d8)
                .addGap(18, 18, 18)
                .addComponent(d10)
                .addGap(18, 18, 18)
                .addComponent(d12)
                .addGap(18, 18, 18)
                .addComponent(d20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nextButton.setText("Next");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Current turn:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setText("jLabel2");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        attackOption.setText("Attack");

        spellHealOption.setText("Cast Healing Spell");

        spellCombatOption.setText("Cast Combat Spell");

        spellProtectiveOption.setText("Cast Protective Spell");

        spellWeakeningOption.setText("Cast Weakening Spell");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attackOption)
                    .addComponent(spellCombatOption)
                    .addComponent(spellProtectiveOption)
                    .addComponent(spellWeakeningOption)
                    .addComponent(spellHealOption))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attackOption)
                .addGap(18, 18, 18)
                .addComponent(spellHealOption)
                .addGap(18, 18, 18)
                .addComponent(spellCombatOption)
                .addGap(18, 18, 18)
                .addComponent(spellProtectiveOption)
                .addGap(18, 18, 18)
                .addComponent(spellWeakeningOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(nextButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(nextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton attackOption;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton d10;
    private javax.swing.JRadioButton d12;
    private javax.swing.JRadioButton d20;
    private javax.swing.JRadioButton d4;
    private javax.swing.JRadioButton d6;
    private javax.swing.JRadioButton d8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton spellCombatOption;
    private javax.swing.JRadioButton spellHealOption;
    private javax.swing.JRadioButton spellProtectiveOption;
    private javax.swing.JRadioButton spellWeakeningOption;
    // End of variables declaration//GEN-END:variables
}
