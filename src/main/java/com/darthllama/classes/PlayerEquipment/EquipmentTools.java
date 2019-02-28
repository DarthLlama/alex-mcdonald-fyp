package com.darthllama.classes.PlayerEquipment;

public class EquipmentTools {
    private String[] cost;

    private String toolType;

    private String toolName;

    public String[] getCost ()
    {
        return cost;
    }

    public void setCost (String[] cost)
    {
        this.cost = cost;
    }

    public String getToolType ()
    {
        return toolType;
    }

    public void setToolType (String toolType)
    {
        this.toolType = toolType;
    }

    public String getToolName ()
    {
        return toolName;
    }

    public void setToolName (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cost = "+cost+", toolType = "+toolType+", toolName = "+toolName+"]";
    }
}
