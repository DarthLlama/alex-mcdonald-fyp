package com.darthllama.classes.PlayerRaceDetails;
import com.darthllama.classes.PlayerRaceDetails.*;

import java.util.ArrayList;

public class PlayerRace {
    private String[] features;
    private String[] profiencyTools;
    private String size;
    private String[] languages;
    private String darkvision;
    private String[] profiencyArmours;
    private String playerRaceName;
    private String[] profiencyWeapons;
    private String speed;
    private String[] stat_increases;
    private String playerRaceImg;

    //TODO: there should be a subrace store, which then allows the user to use it and then sets it

    public String getPlayerRaceImg(){ return playerRaceImg; }
    public void setPlayerRaceImg(String raceName){
        this.playerRaceImg = "img/races/" + raceName + ".jpg";
    }

    public String[] getStat_increases(){ return stat_increases; }
    public void setStat_increases(String[] stat_increases){ this.stat_increases = stat_increases; }

    public String[] getFeatures ()
    {
        return features;
    }
    public void setFeatures (String[] features)
    {
        this.features = features;
    }

    public String[] getProfiencyTools ()
    {
        return profiencyTools;
    }
    public void setProfiencyTools (String[] profiencyTools)
    {
        this.profiencyTools = profiencyTools;
    }

    public String getSize ()
    {
        return size;
    }
    public void setSize (String size)
    {
        //Capitalise the letter, we aren't barbarians
        String sizeCapitalised = size.substring(0, 1).toUpperCase() + size.substring(1);
        this.size = sizeCapitalised;
    }

    public String[] getLanguages ()
    {
        return languages;
    }
    public void setLanguages (String[] languages)
    {
        int temp = 0;
        while(temp < languages.length){
            //Capitalise the letter, we aren't barbarians
            String languageCapitalised = languages[temp].substring(0, 1).toUpperCase() + languages[temp].substring(1);
            languages[temp] = languageCapitalised;
            temp++;
        }
        this.languages = languages;
    }

    public String getDarkvision ()
    {
        return darkvision;
    }
    public void setDarkvision (String darkvision)
    {
        this.darkvision = darkvision;
    }

    public String[] getProfiencyArmours ()
    {
        return profiencyArmours;
    }
    public void setProfiencyArmours (String[] profiencyArmours)
    {
        this.profiencyArmours = profiencyArmours;
    }

    public String getPlayerRaceName ()
    {
        return playerRaceName;
    }
    public void setPlayerRaceName (String playerRaceName)
    {
        //Capitalise the letter, we aren't barbarians
        String playerRaceNameCapitalised = playerRaceName.substring(0, 1).toUpperCase() + playerRaceName.substring(1);

        //And then tell us where the img file is
        setPlayerRaceImg(playerRaceName);
        this.playerRaceName = playerRaceNameCapitalised;
    }

    public String[] getProfiencyWeapons ()
    {
        return profiencyWeapons;
    }
    public void setProfiencyWeapons (String[] profiencyWeapons)
    {
        this.profiencyWeapons = profiencyWeapons;
    }

    public String getSpeed ()
    {
        return speed;
    }
    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [features = "+features+", profiencyTools = "+profiencyTools
                +", size = "+size+", languages = "+languages+", darkvision = "+darkvision
                +", profiencyArmours = "+profiencyArmours+", playerRaceName = "+playerRaceName+", profiencyWeapons = "
                +profiencyWeapons+", speed = "+speed+"]";
    }

    public PlayerRace(){}

    public PlayerRace(String playerRaceName, String size, String speed, String[] languages, String darkvision,
                              String[] features, String[] profiencyArmours, String[] profiencyTools, String[] profiencyWeapons, String[] stat_increases){
        this.playerRaceName = playerRaceName;
        this.size = size;
        this.speed = speed;
        this.languages = languages;
        this.darkvision = darkvision;
        this.features = features;
        this.profiencyArmours = profiencyArmours;
        this.profiencyTools = profiencyTools;
        this.profiencyWeapons = profiencyWeapons;
        this.stat_increases = stat_increases;
    }
}
