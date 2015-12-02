package View.GUI;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;
import Models.Entity.*;
import Models.Races.*;
import Models.Classes.*;
import View.CharacterImage;
import View.CharacterClasses;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;

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
    //test code

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
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
        //test character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.CHARISMA));
        for (int i = 0; i < 5; i++){
            aList.add(new Models.Equipment.Armor(Models.Equipment.Armor.ArmorType.PLATE, "", "", "armor " + i, i, i, i));
        }
        List<String> aSList = new ArrayList();
        for (Models.Equipment.Armor e : aList){
            aSList.add(e.getName());
        }
        armList =  new javax.swing.JList(aSList.toArray());
        jScrollPane5 = new javax.swing.JScrollPane();
        for (int i = 0; i < 5; i++){
            wList.add(new Models.Equipment.Weapon("", "", "weapon " + i, i, i, true, i));
        }
        List<String> wSList = new ArrayList();
        for (Models.Equipment.Weapon e : wList){
            wSList.add(e.getName());
        }
        weapList = new javax.swing.JList(wSList.toArray());
        jScrollPane7 = new javax.swing.JScrollPane();
        invList = new javax.swing.JList();
        removeButton = new javax.swing.JButton();
        appearancePanel = new javax.swing.JPanel();
        masculineButton = new javax.swing.JRadioButton();
        feminineButton = new javax.swing.JRadioButton();
        paletteAButton = new javax.swing.JRadioButton();
        paletteBButton = new javax.swing.JRadioButton();
        paletteCButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        skinLabel = new javax.swing.JLabel();
        drawButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
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
        goldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goldButtonMouseClicked(evt);
            }
        });

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

        removeButton.setText("Remove");

        javax.swing.GroupLayout equipmentPanelLayout = new javax.swing.GroupLayout(equipmentPanel);
        equipmentPanel.setLayout(equipmentPanelLayout);
        equipmentPanelLayout.setHorizontalGroup(
            equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipmentPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417))
                    .addGroup(equipmentPanelLayout.createSequentialGroup()
                        .addGroup(equipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goldButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, equipmentPanelLayout.createSequentialGroup()
                                .addComponent(inventoryLabel)
                                .addGap(51, 51, 51)
                                .addComponent(armorLabel)
                                .addGap(61, 61, 61)
                                .addComponent(weaponsLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(equipmentPanelLayout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(removeButton)
                .addContainerGap())
        );

        namePane.addTab("Gold/Equipment", equipmentPanel);

        buttonGroup2.add(masculineButton);
        masculineButton.setText("Masculine");
        masculineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masculineButtonMouseClicked(evt);
            }
        });

        buttonGroup2.add(feminineButton);
        feminineButton.setText("Feminine");
        feminineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feminineButtonMouseClicked(evt);
            }
        });

        buttonGroup3.add(paletteAButton);
        paletteAButton.setText("Medium");
        paletteAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paletteAButtonMouseClicked(evt);
            }
        });

        buttonGroup3.add(paletteBButton);
        paletteBButton.setText("Light");
        paletteBButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paletteBButtonMouseClicked(evt);
            }
        });

        buttonGroup3.add(paletteCButton);
        paletteCButton.setText("Dark");
        paletteCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paletteCButtonMouseClicked(evt);
            }
        });

        genderLabel.setText("Body Type");

        skinLabel.setText("Skin Tone");

        drawButton.setText("Draw");
        drawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawButtonMouseClicked(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maia\\Documents\\NetBeansProjects\\DADA\\Images\\question mark.png")); // NOI18N
        imageLabel.setText("  ");

        javax.swing.GroupLayout appearancePanelLayout = new javax.swing.GroupLayout(appearancePanel);
        appearancePanel.setLayout(appearancePanelLayout);
        appearancePanelLayout.setHorizontalGroup(
            appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appearancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skinLabel)
                    .addComponent(genderLabel)
                    .addComponent(paletteBButton)
                    .addComponent(feminineButton)
                    .addComponent(masculineButton)
                    .addComponent(paletteAButton)
                    .addComponent(paletteCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawButton))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        appearancePanelLayout.setVerticalGroup(
            appearancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appearancePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                .addComponent(paletteBButton)
                .addGap(18, 18, 18)
                .addComponent(drawButton)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(appearancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        namePane.addTab("Appearance", appearancePanel);

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

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
                character.setClassString("Barbarian");
                break;
            case 1:
                character.setCharacterClass(new Models.Classes.Bard());
                character.setClassString("Bard");
                break;
            case 2:
                character.setCharacterClass(new Models.Classes.Cleric());
                character.setClassString("Cleric");
                break;
            case 3:
                character.setCharacterClass(new Models.Classes.Druid());
                character.setClassString("Druid");
                break;
            case 4:
                character.setCharacterClass(new Models.Classes.Fighter());
                character.setClassString("Fighter");
                break;
            case 5:
                character.setCharacterClass(new Models.Classes.Monk());
                character.setClassString("Monk");
                break;
            case 6:
                character.setCharacterClass(new Models.Classes.Paladin());
                character.setClassString("Paladin");
                break;
            case 7:
                character.setCharacterClass(new Models.Classes.Ranger());
                character.setClassString("Ranger");
                break;
            case 8:
                character.setCharacterClass(new Models.Classes.Rogue());
                character.setClassString("Rogue");
                break;
            case 9:
                character.setCharacterClass(new Models.Classes.Sorcerer());
                character.setClassString("Sorcerer");
                break;
            case 10:
                character.setCharacterClass(new Models.Classes.Wizard());
                character.setClassString("Wizard");
                break;
        }
    }//GEN-LAST:event_selectClassValueChanged

    private void selectRaceValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectRaceValueChanged
        //String[] strings = { "Dwarf", "Elf", "Gnome", "Half Elf", "Half Orc", "Halfing", "Human" };
        //ability boost: {charisma, constitution, dexterity, intelligence, strength, widsom}
        switch (selectRace.getSelectedIndex()) {
            case 0://dwarf
                character.setRace(new Models.Races.Dwarf());
                character.setRaceString("Dwarf");
                break;
            case 1://elf
                character.setRace(new Models.Races.Elf());
                character.setRaceString("Elf");
                break;
            case 2://gnome
                character.setRace(new Models.Races.Gnome());
                character.setRaceString("Gnome");
                break;
            case 3://half elf
                character.setRaceString("Half Elf");
                switch (abilitySelect) {
                    case 0:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.CHARISMA));
                        break;
                    case 1:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.CONSTITUTION));
                        break;
                    case 2:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.DEXTERITY));
                        break;
                    case 3:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.INTELLIGENCE));
                        break;
                    case 4:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.STRENGTH));
                        break;
                    case 5:
                        character.setRace(new Models.Races.HalfElf(HalfElf.AbilityBoost.WISDOM));
                        break;
                }
            case 4://half orc
                character.setRaceString("Half Orc");
                switch (abilitySelect) {
                    case 0:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.CHARISMA));
                        break;
                    case 1:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.CONSTITUTION));
                        break;
                    case 2:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.DEXTERITY));
                        break;
                    case 3:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.INTELLIGENCE));
                        break;
                    case 4:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.STRENGTH));
                        break;
                    case 5:
                        character.setRace(new Models.Races.HalfOrc(HalfOrc.AbilityBoost.WISDOM));
                        break;
                }
            case 5://halfling
                character.setRace(new Models.Races.Halfling());
                character.setRaceString("Halfling");
                break;
            case 6://human
                character.setRaceString("Human");
                switch (abilitySelect) {
                    case 0:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.CHARISMA));
                        break;
                    case 1:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.CONSTITUTION));
                        break;
                    case 2:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.DEXTERITY));
                        break;
                    case 3:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.INTELLIGENCE));
                        break;
                    case 4:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.STRENGTH));
                        break;
                    case 5:
                        character.setRace(new Models.Races.Human(Human.AbilityBoost.WISDOM));
                        break;
                }

        }
    }//GEN-LAST:event_selectRaceValueChanged

    private void descFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descFieldKeyPressed
        character.getDescriptions().setDescription(descField.getText());
    }//GEN-LAST:event_descFieldKeyPressed

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        character.getDescriptions().setName(nameField.getText());
    }//GEN-LAST:event_nameFieldKeyPressed

    private void drawButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawButtonMouseClicked
        String charRace=character.getRaceString();
        String charClass=character.getClassString();
        String gender=character.getDescriptions().getGender();
        String palette=character.getDescriptions().getPalette();
        String ID = character.getId().toString();
        View.CharacterImage charImage = new View.CharacterImage(ID, charRace, charClass, gender, palette);
        character.setImage(charImage.drawImage());
        
        BufferedImage image = new BufferedImage(288, 288, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = (WritableRaster) image.getData();
        raster.setPixels(0,0,288,288,character.getImage());
        imageLabel.setIcon((Icon) image);
        
    }//GEN-LAST:event_drawButtonMouseClicked

    private void masculineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masculineButtonMouseClicked
        character.getDescriptions().setGender("m");
    }//GEN-LAST:event_masculineButtonMouseClicked

    private void feminineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feminineButtonMouseClicked
        character.getDescriptions().setGender("f");
    }//GEN-LAST:event_feminineButtonMouseClicked

    private void paletteCButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paletteCButtonMouseClicked
        character.getDescriptions().setPalette("c");
    }//GEN-LAST:event_paletteCButtonMouseClicked

    private void paletteAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paletteAButtonMouseClicked
        character.getDescriptions().setPalette("a");
    }//GEN-LAST:event_paletteAButtonMouseClicked

    private void paletteBButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paletteBButtonMouseClicked
        character.getDescriptions().setPalette("b");
    }//GEN-LAST:event_paletteBButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        //test code
        System.out.println(character.getDescriptions().getName());
        System.out.println(character.getDescriptions().getDescription());
        System.out.println(character.getRaceString());
        System.out.println(character.getClassString());
    }//GEN-LAST:event_saveButtonMouseClicked

    private void goldButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goldButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_goldButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appearancePanel;
    private javax.swing.JList armList;
    private javax.swing.JLabel armorLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton charismaButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JRadioButton constitutionButton;
    private javax.swing.JTextPane descField;
    private javax.swing.JRadioButton dexterityButton;
    private javax.swing.JButton drawButton;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JRadioButton feminineButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton goldButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JRadioButton intelligenceButton;
    private javax.swing.JList invList;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JButton removeButton;
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
