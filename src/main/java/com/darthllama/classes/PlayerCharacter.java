package com.darthllama.classes;

import com.darthllama.classes.PlayerClassDetails.PlayerClass;
import com.darthllama.classes.PlayerEquipment.*;
import com.darthllama.classes.PlayerRaceDetails.PlayerRace;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class PlayerCharacter {
    //The final character sheet; the thing that binds all the information together. Proably the one class to rule them all
    final static Logger logger = Logger.getLogger(PlayerCharacter.class);

    private PlayerRace playerRace;
    private Background playerBackground;
    private PlayerClass playerClass;
    private ArrayList<String> attributeScores;

    //Background Choices
    private ArrayList<String> personalityTraits;
    private ArrayList<String> ideals;
    private ArrayList<String> bonds;
    private ArrayList<String> flaws;

    //Class choices
    private ArrayList<String> skillProcifiencies;

    //Further info
    private String playerName;
    private String playerDesc;

    //Getters & Setters

    public PlayerRace getPlayerRace() {
        return playerRace;
    }

    public void setPlayerRace(PlayerRace playerRace) {
        this.playerRace = playerRace;
    }

    public Background getPlayerBackground() {
        return playerBackground;
    }

    public void setPlayerBackground(Background playerBackground){
        this.playerBackground = playerBackground;
    }

    public PlayerClass getPlayerClass(){
        return playerClass;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public ArrayList<String> getAttributeScores(){
        return attributeScores;
    }

    public void setAttributeScores(ArrayList<String> attributeScores){
        this.attributeScores = attributeScores;
    }

    public ArrayList<String> getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(ArrayList<String> personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public ArrayList<String> getIdeals() {
        return ideals;
    }

    public void setIdeals(ArrayList<String> ideals) {
        this.ideals = ideals;
    }

    public ArrayList<String> getBonds() {
        return bonds;
    }

    public void setBonds(ArrayList<String> bonds) {
        this.bonds = bonds;
    }

    public ArrayList<String> getFlaws() {
        return flaws;
    }

    public void setFlaws(ArrayList<String> flaws) {
        this.flaws = flaws;
    }

    public ArrayList<String> getSkillProcifiencies() {
        return skillProcifiencies;
    }

    public void setSkillProcifiencies(ArrayList<String> skillProcifiencies) {
        this.skillProcifiencies = skillProcifiencies;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerDesc(String playerDesc) {
        this.playerDesc = playerDesc;
    }

    public String getPlayerDesc() {
        return playerDesc;
    }

    //Methods
    public PlayerCharacter(){PlayerCharacter playerCharacter = new PlayerCharacter();}

    /*
     private PlayerRace playerRace;
    private Background playerBackground;
    private PlayerClass playerClass;
    private ArrayList<String> attributeScores;

    //Background Choices
    private ArrayList<String> personalityTraits;
    private ArrayList<String> ideals;
    private ArrayList<String> bonds;
    private ArrayList<String> flaws;

    //Class choices
    private ArrayList<String> skillProcifiencies;

    //Further info
    private String playerName;
    private String playerDesc;
     */


    public PlayerCharacter(PlayerRace playerRace, Background background, PlayerClass playerClass, ArrayList<String> attributeScores,
                                   ArrayList<String> personalityTraits, ArrayList<String> ideals, ArrayList<String> bonds, ArrayList<String> flaws,
                                   ArrayList<String> skillProcifiencies, String playerName, String playerDesc){
        this.playerRace = playerRace;
        this.playerBackground = background;
        this.playerClass = playerClass;
        this.attributeScores = attributeScores;

        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;

        this.skillProcifiencies = skillProcifiencies;
        this.playerName = playerName;
        this.playerDesc = playerDesc;

    }

}
