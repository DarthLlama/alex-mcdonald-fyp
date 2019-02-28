package com.darthllama.classes.PlayerEquipment;

public class EquipmentAdventuringGear {
    private String adventuringGearName;
    private String[] cost;
    private String weight;

    public String getAdventuringGearName ()
    {
        return adventuringGearName;
    }

    public void setAdventuringGearName (String adventuringGearName)
    {
        this.adventuringGearName = adventuringGearName;
    }

    public String[] getCost ()
    {
        return cost;
    }

    public void setCost (String[] cost)
    {
        this.cost = cost;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [adventuringGearName = "+adventuringGearName+", cost = "+cost+", weight = "+weight+"]";
    }


}
