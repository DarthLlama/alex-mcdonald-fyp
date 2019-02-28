package com.darthllama.classes.PlayerEquipment;

public class EquipmentPacks {
    private String[] cost;

    private String[] contents;

    private String packName;

    public String[] getCost ()
    {
        return cost;
    }

    public void setCost (String[] cost)
    {
        this.cost = cost;
    }

    public String[] getContents ()
    {
        return contents;
    }

    public void setContents (String[] contents)
    {
        this.contents = contents;
    }

    public String getPackName ()
    {
        return packName;
    }

    public void setPackName (String packName)
    {
        this.packName = packName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cost = "+cost+", contents = "+contents+", packName = "+packName+"]";
    }
}
