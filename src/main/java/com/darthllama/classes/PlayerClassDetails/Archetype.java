package com.darthllama.classes.PlayerClassDetails;

public class Archetype
{
    private String[] features;
    private String[] proficienciesArmours;
    private String archetype_name;
    private String[] spells;

    public String[] getFeatures ()
    {
        return features;
    }

    public void setFeatures (String[] features)
    {
        this.features = features;
    }

    public String[] getProficienciesArmours ()
    {
        return proficienciesArmours;
    }

    public void setProficienciesArmours (String[] proficienciesArmours)
    {
        this.proficienciesArmours = proficienciesArmours;
    }

    public String getArchetype_name ()
    {
        return archetype_name;
    }

    public void setArchetype_name (String archetype_name)
    {
        this.archetype_name = archetype_name;
    }

    public String[] getSpells ()
    {
        return spells;
    }

    public void setSpells (String[] spells)
    {
        this.spells = spells;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [features = "+features+", proficienciesArmours = "+proficienciesArmours+", archetype_name = "+archetype_name+", spells = "+spells+"]";
    }
}
