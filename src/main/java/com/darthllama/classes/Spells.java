package com.darthllama.classes;

public class Spells {
    private String spellName;

    private String spellLevel;

    private String spellDesc;

    public String getSpellName ()
    {
        return spellName;
    }

    public void setSpellName (String spellName)
    {
        this.spellName = spellName;
    }

    public String getSpellLevel ()
    {
        return spellLevel;
    }

    public void setSpellLevel (String spellLevel)
    {
        this.spellLevel = spellLevel;
    }

    public String getSpellDesc ()
    {
        return spellDesc;
    }

    public void setSpellDesc (String spellDesc)
    {
        this.spellDesc = spellDesc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [spellName = "+spellName+", spellLevel = "+spellLevel+", spellDesc = "+spellDesc+"]";
    }

    public Spells(){};

    public Spells(String spellName, String spellLevel, String spellDesc){
        this.spellName = spellName;
        this.spellLevel = spellLevel;
        this.spellDesc = spellDesc;
    }
}
