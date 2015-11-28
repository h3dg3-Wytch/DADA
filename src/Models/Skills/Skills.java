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
    private Knowledge knowledgeLocal;
    private Knowledge knowledgeNature;
    private Knowledge knowledgeNobility;
    private Knowledge knowledgePlanes;
    private Knowledge knowledgeReligion;
    private Linguistics linguistics;
    private Perception perception;
    private Perform performOne;
    private Perform performTwo;
    private Profession profession;
    private Ride ride;
    private SenseMotive senseMotive;
    private SleightofHand sleightofHand;
    private SpellCraft spellCraft;
    private Stealth stealth;
    private Survival survival;
    private Swim swim;

    public Skills(){

    }

    public Acrobatics getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Acrobatics acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Appraise getAppraise() {
        return appraise;
    }

    public void setAppraise(Appraise appraise) {
        this.appraise = appraise;
    }

    public Bluff getBluff() {
        return bluff;
    }

    public void setBluff(Bluff bluff) {
        this.bluff = bluff;
    }

    public Climb getClimb() {
        return climb;
    }

    public void setClimb(Climb climb) {
        this.climb = climb;
    }

    public Craft getFirstcraft() {
        return firstcraft;
    }

    public void setFirstcraft(Craft firstcraft) {
        this.firstcraft = firstcraft;
    }

    public Craft getSecondCraft() {
        return secondCraft;
    }

    public void setSecondCraft(Craft secondCraft) {
        this.secondCraft = secondCraft;
    }

    public Craft getThirCraft() {
        return thirCraft;
    }

    public void setThirCraft(Craft thirCraft) {
        this.thirCraft = thirCraft;
    }

    public Diplomacy getDiplomacy() {
        return diplomacy;
    }

    public void setDiplomacy(Diplomacy diplomacy) {
        this.diplomacy = diplomacy;
    }

    public Disguise getDisguise() {
        return disguise;
    }

    public void setDisguise(Disguise disguise) {
        this.disguise = disguise;
    }

    public EscapeArtist getEscapeArtist() {
        return escapeArtist;
    }

    public void setEscapeArtist(EscapeArtist escapeArtist) {
        this.escapeArtist = escapeArtist;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public HandleAnimal getHandleAnimal() {
        return handleAnimal;
    }

    public void setHandleAnimal(HandleAnimal handleAnimal) {
        this.handleAnimal = handleAnimal;
    }

    public Heal getHeal() {
        return heal;
    }

    public void setHeal(Heal heal) {
        this.heal = heal;
    }

    public Intimidate getIntimidate() {
        return intimidate;
    }

    public void setIntimidate(Intimidate intimidate) {
        this.intimidate = intimidate;
    }

    public Knowledge getKnowledgeArcana() {
        return knowledgeArcana;
    }

    public void setKnowledgeArcana(Knowledge knowledgeArcana) {
        this.knowledgeArcana = knowledgeArcana;
    }

    public Knowledge getKnowledgeDungeoneering() {
        return knowledgeDungeoneering;
    }

    public void setKnowledgeDungeoneering(Knowledge knowledgeDungeoneering) {
        this.knowledgeDungeoneering = knowledgeDungeoneering;
    }

    public Knowledge getKnowledgeEngineering() {
        return knowledgeEngineering;
    }

    public void setKnowledgeEngineering(Knowledge knowledgeEngineering) {
        this.knowledgeEngineering = knowledgeEngineering;
    }

    public Knowledge getKnowledgeGeography() {
        return knowledgeGeography;
    }

    public void setKnowledgeGeography(Knowledge knowledgeGeography) {
        this.knowledgeGeography = knowledgeGeography;
    }

    public Knowledge getKnowledgeHistory() {
        return knowledgeHistory;
    }

    public void setKnowledgeHistory(Knowledge knowledgeHistory) {
        this.knowledgeHistory = knowledgeHistory;
    }

    public Knowledge getKnowledgeLocal() {
        return knowledgeLocal;
    }

    public void setKnowledgeLocal(Knowledge knowledgeLocal) {
        this.knowledgeLocal = knowledgeLocal;
    }

    public Knowledge getKnowledgeNature() {
        return knowledgeNature;
    }

    public void setKnowledgeNature(Knowledge knowledgeNature) {
        this.knowledgeNature = knowledgeNature;
    }

    public Knowledge getKnowledgeNobility() {
        return knowledgeNobility;
    }

    public void setKnowledgeNobility(Knowledge knowledgeNobility) {
        this.knowledgeNobility = knowledgeNobility;
    }

    public Knowledge getKnowledgePlanes() {
        return knowledgePlanes;
    }

    public void setKnowledgePlanes(Knowledge knowledgePlanes) {
        this.knowledgePlanes = knowledgePlanes;
    }

    public Knowledge getKnowledgeReligion() {
        return knowledgeReligion;
    }

    public void setKnowledgeReligion(Knowledge knowledgeReligion) {
        this.knowledgeReligion = knowledgeReligion;
    }

    public Linguistics getLinguistics() {
        return linguistics;
    }

    public void setLinguistics(Linguistics linguistics) {
        this.linguistics = linguistics;
    }

    public Perception getPerception() {
        return perception;
    }

    public void setPerception(Perception perception) {
        this.perception = perception;
    }

    public Perform getPerformOne() {
        return performOne;
    }

    public void setPerformOne(Perform performOne) {
        this.performOne = performOne;
    }

    public Perform getPerformTwo() {
        return performTwo;
    }

    public void setPerformTwo(Perform performTwo) {
        this.performTwo = performTwo;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public SenseMotive getSenseMotive() {
        return senseMotive;
    }

    public void setSenseMotive(SenseMotive senseMotive) {
        this.senseMotive = senseMotive;
    }

    public SleightofHand getSleightofHand() {
        return sleightofHand;
    }

    public void setSleightofHand(SleightofHand sleightofHand) {
        this.sleightofHand = sleightofHand;
    }

    public SpellCraft getSpellCraft() {
        return spellCraft;
    }

    public void setSpellCraft(SpellCraft spellCraft) {
        this.spellCraft = spellCraft;
    }

    public Stealth getStealth() {
        return stealth;
    }

    public void setStealth(Stealth stealth) {
        this.stealth = stealth;
    }

    public Survival getSurvival() {
        return survival;
    }

    public void setSurvival(Survival survival) {
        this.survival = survival;
    }

    public Swim getSwim() {
        return swim;
    }

    public void setSwim(Swim swim) {
        this.swim = swim;
    }
}
