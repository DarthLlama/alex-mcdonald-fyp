package com.darthllama.classes.PlayerEquipment;

public class EquipmentWeapons {
    private String[] damage;

    private String[] cost;

    private String wieght;

    private String weaponType;

    private String weaponName;

    private String[] properties;

    public String[] getDamage ()
    {
        return damage;
    }

    public void setDamage (String[] damage)
    {
        this.damage = damage;
    }

    public String[] getCost ()
    {
        return cost;
    }

    public void setCost (String[] cost)
    {
        this.cost = cost;
    }

    public String getWieght ()
    {
        return wieght;
    }

    public void setWieght (String wieght)
    {
        this.wieght = wieght;
    }

    public String getWeaponType ()
    {
        return weaponType;
    }

    public void setWeaponType (String weaponType)
    {
        this.weaponType = weaponType;
    }

    public String getWeaponName ()
    {
        return weaponName;
    }

    public void setWeaponName (String weaponName)
    {
        this.weaponName = weaponName;
    }

    public String[] getProperties ()
    {
        return properties;
    }

    public void setProperties (String[] properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [damage = "+damage+", cost = "+cost+", wieght = "+wieght+", weaponType = "+weaponType+", weaponName = "+weaponName+", properties = "+properties+"]";
    }
}
