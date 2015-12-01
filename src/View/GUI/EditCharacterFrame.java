package View.GUI;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;
import Models.Entity.*;
import Models.Races.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Maia
 */
public class EditCharacterFrame extends javax.swing.JFrame {

    private final MainMenuFrame mainFrame;

    public EditCharacterFrame(MainMenuFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        initListeners();
    }

    private void initListeners() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                mainFrame.enableButtons();
                dispose();
            }
        });
    }

    int abilitySelect = 0;
    Models.Entity.Character character = new Models.Entity.Character();
    
    List<Models.Equipment.Armor> aList = new ArrayList();
    List<Models.Equipment.Weapon> wList = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        namePane = new javax.swing.JTabbedPane();
        namePanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descField = new javax.swing.JTextPane();
        racePanel = new javax.swing.JPanel();
        raceLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectRace = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectClass = new javax.swing.JList();
        charismaButton = new javax.swing.JRadioButton();
        constitutionButton = new javax.swing.JRadioButton();
        dexterityButton = new javax.swing.JRadioButton();
        intelligenceButton = new javax.swing.JRadioButton();
        strengthButton = new javax.swing.JRadioButton();
        wisdomButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        skillsPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        skillsList = new javax.swing.JList();
        skillsLabel = new javax.swing.JLabel();
        spellsPanel = new javax.swing.JPanel();
        equipmentPanel = new javax.swing.JPanel();
        goldButton = new javax.swing.JButton();
        armorLabel = new javax.swing.JLabel();
        weaponsLabel = new javax.swing.JLabel();
        inventoryLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        List<String> aSList = new ArrayList();
        for (Models.Equipment.Armor e : aList){
            aSList.add(e.getName());
        }
        armList = new javax.swing.JList(aSList.toArray());
        jScrollPane5 = new javax.swing.JScrollPane();
        List<String> wSList = new ArrayList();
        for (Models.Equipment.Weapon e : wList){
            wSList.add(e.getName());
        }
        weapList = new javax.swing.JList(wSList.toArray());
        jScrollPane7 = new javax.swing.JScrollPane();
        invList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        appearancePanel = new javax.swing.JPanel();
        masculineButton = new javax.swing.JRadioButton();
        feminineButton = new javax.swing.JRadioButton();
        paletteAButton = new javax.swing.JRadioButton();
        paletteBButton = new javax.swing.JRadioButton();
        paletteCButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        skinLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Character Editor");

        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });

        descField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descFieldKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(descField);

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        namePane.addTab("Name/Description", namePanel);

        raceLabel.setText("Select Race");

        classLabel.setText("Select Class");

        selectRace.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Dwarf", "Elf", "Gnome", "Half Elf*", "Half Orc*", "Halfling", "Human*" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        selectRace.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectRaceValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(selectRace);

        selectClass.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Wizard" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        selectClass.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectClassValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(selectClass);

        buttonGroup1.add(charismaButton);
        charismaButton.setText("Charisma");
        charismaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charismaButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(constitutionButton);
        constitutionButton.setText("Constitution");
        constitutionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                constitutionButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(dexterityButton);
        dexterityButton.setText("Dexterity");
        dexterityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dexterityButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(intelligenceButton);
        intelligenceButton.setText("Intelligence");
        intelligenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intelligenceButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(strengthButton);
        strengthButton.setText("Strength");
        strengthButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strengthButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(wisdomButton);
        wisdomButton.setText("Wisdom");
        wisdomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wisdomButtonMouseClicked(evt);
            }
        });

        jLabel2.setText("* Ability Boost");

        javax.swing.GroupLayout racePanelLayout = new javax.swing.GroupLayout(racePanel);
        racePanel.setLayout(racePanelLayout);
        racePanelLayout.setHorizontalGroup(
            racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(racePanelLayout.createSequentialGroup()
                .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(raceLabel)))
                .addGap(18, 18, 18)
                .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(172, 172, 172)
                        .addComponent(classLabel))
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, racePanelLayout.createSequentialGroup()
                                .addComponent(charismaButton)
                                .addGap(139, 139, 139))
                            .addGroup(racePanelLayout.createSequentialGroup()
                                .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dexterityButton)
                                    .addComponent(intelligenceButton)
                                    .addComponent(strengthButton)
                                    .addComponent(wisdomButton)
                                    .addComponent(constitutionButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        racePanelLayout.setVerticalGroup(
            racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(racePanelLayout.createSequentialGroup()
                .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raceLabel)
                            .addComponent(jLabel2)))
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(classLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(racePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(racePanelLayout.createSequentialGroup()
                        .addComponent(charismaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(constitutionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dexterityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intelligenceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strengthButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wisdomButton)
                        .addGap(0, 146, Short.MAX_VALUE)))
                .addContainerGap())
        );

        namePane.addTab("Race/Class", racePanel);

        skillsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Acrobatics", "Appraise", "Bluff", "Climb", "Craft", "Diplomacy", "Disable Device", "Disguise", "Esape Artist", "Fly", "Handle Animal", "Heal", "Intimidate", "Knowledge", "Linguistics", "Perception", "Perform", "Prefession", "Ride", "Sense Motive", "Sleight of Hand", "Spell Craft", "Stealth", "Survival", "Swim", "Use Magic Device" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(skillsList);

        skillsLabel.setText("Skills");

        javax.swing.GroupLayout skillsPanelLayout = new javax.swing.GroupLayout(skillsPanel);
        skillsPanel.setLayout(skillsPanelLayout);
        skillsPanelLayout.setHorizontalGroup(
            skillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(skillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skillsLabel)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        skillsPanelLayout.setVerticalGroup(
            skillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillsPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(skillsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        namePane.addTab("Skills", skillsPanel);

        javax.swing.GroupLayout spellsPanelLayout = new javax.swing.GroupLayout(spellsPanel);
        spellsPanel.setLayout(spellsPanelLayout);
        spellsPanelLayout.setHorizontalGroup(
            spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        spellsPanelLayout.setVerticalGroup(
            spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        namePane.addTab("Spells", spellsPanel);

        goldButton.setText("Generate Gold");

        armorLabel.setText("Armor");

        weaponsLabel.setText("Weapons");

        inventoryLabel.setText("Character Inventory");

        jScrollPane4.setViewportView(armList);

        jScrollPane5.setViewportView(weapList);

        invList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(invList);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout equipmentPanelLayout = new javax.swing.GroupLayout(equipmentPanel);
        equipmentPanel.setLayout(equipmentPanelLayout);
        equipmentPanelLayout.setHorizontalGroup(
            equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(equipmentPanelLayout.createSequentialGroup()
                        .addComponent(goldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(equipmentPanelLayout.createSequentialGroup()
                        .addComponent(inventoryLabel)
                        .addGap(51, 51, 51)
                        .addComponent(armorLabel)
                        .addGap(61, 61, 61)
                        .addComponent(weaponsLabel)
                        .addGap(376, 444, Short.MAX_VALUE))
                    .addGroup(equipmentPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(equipmentPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(equipmentPanelLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(415, 415, 415))))
        );
        equipmentPanelLayout.setVerticalGroup(
            equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goldButton)
                .addGap(24, 24, 24)
                .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(armorLabel)
                    .addComponent(weaponsLabel)
                    .addComponent(inventoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        namePane.addTab("Gold/Equipment", equipmentPanel);

        masculineButton.setText("Masculine");

        feminineButton.setText("Feminine");

        paletteAButton.setText("Medium");

        paletteBButton.setText("Light");

        paletteCButton.setText("Dark");

        genderLabel.setText("Body Type");

        skinLabel.setText("Skin Tone");

        jPanel1.setMaximumSize(new java.awt.Dimension(288, 288));
        jPanel1.setMinimumSize(new java.awt.Dimension(288, 288));
        jPanel1.setPreferredSize(new java.awt.Dimension(288, 288));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout appearancePanelLayout = new javax.swing.GroupLayout(appearancePanel);
        appearancePanel.setLayout(appearancePanelLayout);
        appearancePanelLayout.setHorizontalGroup(
            appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appearancePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addGroup(appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skinLabel)
                    .addComponent(genderLabel)
                    .addComponent(paletteBButton)
                    .addComponent(feminineButton)
                    .addComponent(masculineButton)
                    .addComponent(paletteAButton)
                    .addComponent(paletteCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        appearancePanelLayout.setVerticalGroup(
            appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appearancePanelLayout.createSequentialGroup()
                .addGroup(appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appearancePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(masculineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feminineButton)
                        .addGap(32, 32, 32)
                        .addComponent(skinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paletteCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paletteAButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paletteBButton))
                    .addGroup(appearancePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        namePane.addTab("Appearance", appearancePanel);

        saveButton.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namePane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wisdomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wisdomButtonMouseClicked
        abilitySelect = 5;
    }//GEN-LAST:event_wisdomButtonMouseClicked

    private void strengthButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strengthButtonMouseClicked
        abilitySelect = 4;
    }//GEN-LAST:event_strengthButtonMouseClicked

    private void intelligenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intelligenceButtonMouseClicked
        abilitySelect = 3;
    }//GEN-LAST:event_intelligenceButtonMouseClicked

    private void dexterityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dexterityButtonMouseClicked
        abilitySelect = 2;
    }//GEN-LAST:event_dexterityButtonMouseClicked

    private void constitutionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_constitutionButtonMouseClicked
        abilitySelect = 1;
    }//GEN-LAST:event_constitutionButtonMouseClicked

    private void charismaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charismaButtonMouseClicked
        abilitySelect = 0;
    }//GEN-LAST:event_charismaButtonMouseClicked

    private void selectClassValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectClassValueChanged
        //strings = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Wizard" }

        switch (selectClass.getSelectedIndex()) {
            case 0:
            character.setCharacterClass(new Models.Classes.Barbarian());
            case 1:
            character.setCharacterClass(new Models.Classes.Bard());
            case 2:
            character.setCharacterClass(new Models.Classes.Cleric());
            case 3:
            character.setCharacterClass(new Models.Classes.Druid());
            case 4:
            character.setCharacterClass(new Models.Classes.Fighter());
            case 5:
            character.setCharacterClass(new Models.Classes.Monk());
            case 6:
            character.setCharacterClass(new Models.Classes.Paladin());
            case 7:
            character.setCharacterClass(new Models.Classes.Ranger());
            case 8:
            character.setCharacterClass(new Models.Classes.Rogue());
            case 9:
            character.setCharacterClass(new Models.Classes.Sorcerer());
            case 10:
            character.setCharacterClass(new Models.Classes.Wizard());
        }
    }//GEN-LAST:event_selectClassValueChanged

    private void selectRaceValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectRaceValueChanged
        //String[] strings = { "Dwarf", "Elf", "Gnome", "Half Elf", "Half Orc", "Halfing", "Human" };
        //ability boost: {charisma, constitution, dexterity, intelligence, strength, widsom}
        switch (selectRace.getSelectedIndex()) {
            case 0://dwarf
            character.setRace(new Models.Races.Dwarf());
            case 1://elf
            character.setRace(new Models.Races.Elf());
            case 2://gnome
            character.setRace(new Models.Races.Gnome());
            case 3://half elf
            switch (abilitySelect) {
                case 0:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.CHARISMA));
                case 1:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.CONSTITUTION));
                case 2:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.DEXTERITY));
                case 3:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.INTELLIGENCE));
                case 4:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.STRENGTH));
                case 5:
                character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.WISDOM));
            }
            case 4://half orc
            switch (abilitySelect) {
                case 0:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.CHARISMA));
                case 1:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.CONSTITUTION));
                case 2:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.DEXTERITY));
                case 3:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.INTELLIGENCE));
                case 4:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.STRENGTH));
                case 5:
                character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.WISDOM));
            }
            case 5://halfling
            character.setRace(new Models.Races.Halfling());
            case 6://human
            switch (abilitySelect) {
                case 0:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.CHARISMA));
                case 1:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.CONSTITUTION));
                case 2:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.DEXTERITY));
                case 3:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.INTELLIGENCE));
                case 4:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.STRENGTH));
                case 5:
                character.setRace(new Models.Races.Human(Human.AbilityBoost.WISDOM));
            }

        }
    }//GEN-LAST:event_selectRaceValueChanged

    private void descFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descFieldKeyPressed
        character.getDescriptions().setDescription(descField.getText());
    }//GEN-LAST:event_descFieldKeyPressed

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        character.getDescriptions().setName(nameField.getText());
    }//GEN-LAST:event_nameFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appearancePanel;
    private javax.swing.JList armList;
    private javax.swing.JLabel armorLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton charismaButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JRadioButton constitutionButton;
    private javax.swing.JTextPane descField;
    private javax.swing.JRadioButton dexterityButton;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JRadioButton feminineButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton goldButton;
    private javax.swing.JRadioButton intelligenceButton;
    private javax.swing.JList invList;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JRadioButton masculineButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTabbedPane namePane;
    private javax.swing.JPanel namePanel;
    private javax.swing.JRadioButton paletteAButton;
    private javax.swing.JRadioButton paletteBButton;
    private javax.swing.JRadioButton paletteCButton;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JPanel racePanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JList selectClass;
    private javax.swing.JList selectRace;
    private javax.swing.JLabel skillsLabel;
    private javax.swing.JList skillsList;
    private javax.swing.JPanel skillsPanel;
    private javax.swing.JLabel skinLabel;
    private javax.swing.JPanel spellsPanel;
    private javax.swing.JRadioButton strengthButton;
    private javax.swing.JList weapList;
    private javax.swing.JLabel weaponsLabel;
    private javax.swing.JRadioButton wisdomButton;
    // End of variables declaration//GEN-END:variables
}
