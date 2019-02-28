package com.darthllama.classes.PlayerEquipment;

public class EquipmentCoins {

    private String[] coins;

    public String[] getCoins ()
    {
        return coins;
    }

    public void setCoins (String[] coins)
    {
        this.coins = coins;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [coins = "+coins+"]";
    }
}
