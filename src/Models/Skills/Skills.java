package Models.Skills;

import jdk.internal.org.objectweb.asm.Handle;

import java.io.Serializable;

/**
 * Created by Alex on 11/27/15.
 */
public class Skills implements Serializable {

    private Acrobatics acrobatics;
    private Appraise appraise;
    private Bluff bluff;
    private Climb climb;
    //Character can have up to three different crafts
    private Craft firstcraft;
    private Craft secondCraft;
    private Craft thirCraft;
    private Diplomacy diplomacy;
    private Disguise disguise;
    private EscapeArtist escapeArtist;
    private Fly fly;
    private HandleAnimal handleAnimal;
    private Heal heal;
    private Intimidate intimidate;
    private Knowledge knowledgeArcana;
    private Knowledge knowledgeDungeoneering;
    private Knowledge knowledgeEngineering;
    private Knowledge knowledgeGeography;
    private Knowledge knowledgeHistory;
    private Knowledge knowledgePolitics;
}
