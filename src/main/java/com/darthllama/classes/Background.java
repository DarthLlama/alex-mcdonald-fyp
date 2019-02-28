package com.darthllama.classes;

import java.util.List;

public class Background {

    private String background_name;
    private List<String> proficiencies_skills;
    private List<String> proficiencies_tools;
    private List<String> languages;
    private List<String> equipment;
    private List<String> coins;
    private List<String> background_speciality = null;
    private String background_feature;
    private List<String> personality_trait_options;
    private List<String> ideal_options;
    private List<String> bond_options;
    private List<String> flaw_options;

    public String getBackground_name() {
        return background_name;
    }

    private void setBackground_name(String background_name){
        //Capitalise the letter, we aren't barbarians
        String background_nameCaptitalised = background_name.substring(0, 1).toUpperCase() + background_name.substring(1);

        this.background_name = background_nameCaptitalised.replaceAll("[_]", " ");
    }

    public List<String> getProficiencies_skills() {
        return proficiencies_skills;
    }

    private void setProficiencies_skills(List<String> proficiencies_skills) {
        this.proficiencies_skills = proficiencies_skills;
    }

    public List<String> getProficiencies_tools(){
        return proficiencies_tools;
    }

    private void setProficiencies_tools(List<String> proficiencies_tools){
        this.proficiencies_tools = proficiencies_tools;
    }

    public List<String> getLanguages() {
        return languages;
    }

    private void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    private void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public List<String> getCoins() {
        return coins;
    }

    private void setCoins(List<String> coins) {
        this.coins = coins;
    }

    public List<String> getBackground_speciality() {
        return background_speciality;
    }

    private void setBackground_speciality(List<String> background_speciality) {
        this.background_speciality= background_speciality;
    }

    public String getBackground_feature() {
        return background_feature;
    }

    private void setBackground_feature(String background_feature) {
        this.background_feature = background_feature;
    }

    public List<String> getPersonality_trait_options() {
        return personality_trait_options;
    }

    private void setPersonality_trait_options(List<String> personality_trait_options) {
        this.personality_trait_options = personality_trait_options;
    }

    public List<String> getIdeal_options() {
        return ideal_options;
    }

    private void setIdeal_options(List<String> ideal_options) {
        this.ideal_options = ideal_options;
    }

    public List<String> getBond_options() {
        return bond_options;
    }

    private void setBond_options(List<String> bond_options) {
        this.bond_options = bond_options;
    }

    public List<String> getFlaw_options() {
        return flaw_options;
    }

    private void setFlaw_options(List<String> flaw_options) {
        this.flaw_options = flaw_options;
    }

    public Background(){

    }

    public Background(String background_name, List<String> proficiencies_skills, List<String> proficiencies_tools,
                      List<String> languages, List<String> equipment, List<String> coins, List<String> background_speciality,
                      String background_feature, List<String> personality_trait_options, List<String> ideal_options,
                      List<String> bond_options, List<String> flaw_options){

        this.background_name = background_name;
        this.proficiencies_skills = proficiencies_skills;
        this.proficiencies_tools = proficiencies_tools;
        this.languages = languages;
        this.equipment = equipment;
        this.coins = coins;
        this.background_speciality = background_speciality;
        this.background_feature = background_feature;
        this.personality_trait_options = personality_trait_options;
        this.ideal_options = ideal_options;
        this.bond_options = bond_options;
        this.flaw_options = flaw_options;
    }


}
