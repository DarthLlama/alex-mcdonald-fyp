package com.darthllama.classes.PlayerClassDetails.PlayerClassLevels;

import com.darthllama.classes.PlayerClassDetails.Archetype;

public class PlayerClassLevel6 {

    //Properties
    private String proficienciesMod;
    private String[] features;
    private Archetype archetype;
    private String[] spellSlots;
    private String amountOfCantripsKnown;


    //Getters and Setters
    public String getProficienciesMod ()
    {
        return proficienciesMod;
    }

    public void setProficienciesMod (String proficienciesMod)
    {
        this.proficienciesMod = proficienciesMod;
    }

    public String[] getFeatures ()
    {
        return features;
    }

    public void setFeatures (String[] features)
    {
        this.features = features;
    }

    public Archetype getArchetype ()
    {
        return archetype;
    }

    public void setArchetype (Archetype archetype)
    {
        this.archetype = archetype;
    }

    public String[] getSpellSlots ()
    {
        return spellSlots;
    }

    public void setSpellSlots (String[] spellSlots)
    {
        this.spellSlots = spellSlots;
    }

    public String getAmountOfCantripsKnown ()
    {
        return amountOfCantripsKnown;
    }

    public void setAmountOfCantripsKnown (String amountOfCantripsKnown)
    {
        this.amountOfCantripsKnown = amountOfCantripsKnown;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [proficienciesMod = "+proficienciesMod+", features = "+features+", archetype = "+archetype+", spellSlots = "+spellSlots+", amountOfCantripsKnown = "+amountOfCantripsKnown+"]";
    }
}
