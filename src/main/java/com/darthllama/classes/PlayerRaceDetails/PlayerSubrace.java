package com.darthllama.classes.PlayerRaceDetails;

public class PlayerSubrace {
    private String subraceName;
    private String[] features;
    private String[] profiencyTools;
    private String[] languages;
    private String[] stat_increases;
    private String[] profiencyArmours;
    private String[] profiencyWeapons;

    public String getSubraceName(){
        return subraceName;
    }
    public void setSubraceName(String subraceName){
        this.subraceName = subraceName;
    }

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

    public String[] getLanguages ()
    {
        return languages;
    }
    public void setLanguages (String[] languages)
    {
        this.languages = languages;
    }

    public String[] getStat_increases ()
    {
        return stat_increases;
    }
    public void setStat_increases (String[] stat_increases)
    {
        this.stat_increases = stat_increases;
    }

    public String[] getProfiencyArmours ()
    {
        return profiencyArmours;
    }
    public void setProfiencyArmours (String[] profiencyArmours)
    {
        this.profiencyArmours = profiencyArmours;
    }

    public String[] getProfiencyWeapons ()
    {
        return profiencyWeapons;
    }
    public void setProfiencyWeapons (String[] profiencyWeapons)
    {
        this.profiencyWeapons = profiencyWeapons;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [subraceName = "+subraceName+"features = "+features+", profiencyTools = "+profiencyTools+", languages = "
                +languages+", stat_increases = "+stat_increases+", profiencyArmours = "+profiencyArmours
                +", profiencyWeapons = "+profiencyWeapons+"]";
    }

    public PlayerSubrace(){}

    public void addPlayerSubrace(String subraceName, String[] stat_increases, String[] languages, String[] features,
                                 String[] profiencyArmours, String[] profiencyTools, String[] profiencyweapons){
        this.subraceName = subraceName;
        this.stat_increases = stat_increases;
        this.languages = languages;
        this.features = features;
        this.profiencyArmours = profiencyArmours;
        this.profiencyTools = profiencyTools;
        this.profiencyWeapons = profiencyweapons;
    }
}
