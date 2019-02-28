package com.darthllama.classes.PlayerEquipment;

public class EquipmentArmour {
    private String strength_requirement;

    private String[] cost;

    private String armourClassMod;

    private String stealth_disadvantage;

    private String wieght;

    private String armourName;

    private String dex_mod;

    private String armourType;

    private String armourClass;

    public String getStrength_requirement ()
    {
        return strength_requirement;
    }

    public void setStrength_requirement (String strength_requirement)
    {
        this.strength_requirement = strength_requirement;
    }

    public String[] getCost ()
    {
        return cost;
    }

    public void setCost (String[] cost)
    {
        this.cost = cost;
    }

    public String getArmourClassMod ()
    {
        return armourClassMod;
    }

    public void setArmourClassMod (String armourClassMod)
    {
        this.armourClassMod = armourClassMod;
    }

    public String getStealth_disadvantage ()
    {
        return stealth_disadvantage;
    }

    public void setStealth_disadvantage (String stealth_disadvantage)
    {
        this.stealth_disadvantage = stealth_disadvantage;
    }

    public String getWieght ()
    {
        return wieght;
    }

    public void setWieght (String wieght)
    {
        this.wieght = wieght;
    }

    public String getArmourName ()
    {
        return armourName;
    }

    public void setArmourName (String armourName)
    {
        this.armourName = armourName;
    }

    public String getDex_mod ()
    {
        return dex_mod;
    }

    public void setDex_mod (String dex_mod)
    {
        this.dex_mod = dex_mod;
    }

    public String getArmourType ()
    {
        return armourType;
    }

    public void setArmourType (String armourType)
    {
        this.armourType = armourType;
    }

    public String getArmourClass ()
    {
        return armourClass;
    }

    public void setArmourClass (String armourClass)
    {
        this.armourClass = armourClass;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [strength_requirement = "+strength_requirement+", cost = "+cost+", armourClassMod = "+armourClassMod+", stealth_disadvantage = "+stealth_disadvantage+", wieght = "+wieght+", armourName = "+armourName+", dex_mod = "+dex_mod+", armourType = "+armourType+", armourClass = "+armourClass+"]";
    }
}
