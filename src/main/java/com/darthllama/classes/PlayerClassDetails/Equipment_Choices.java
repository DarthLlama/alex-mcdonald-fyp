package com.darthllama.classes.PlayerClassDetails;

public class Equipment_Choices
{
    //Each class gets a bunch of selections. This is where we hold those selections for the player to choose from
    private String[] equipment_choice1;
    private String[] equipment_choice2;
    private String[] equipment_choice3;

    public String[] getEquipment_choice1 ()
    {
        return equipment_choice1;
    }

    public void setEquipment_choice1 (String[] equipment_choice1)
    {
        this.equipment_choice1 = equipment_choice1;
    }

    public String[] getEquipment_choice2 ()
    {
        return equipment_choice2;
    }

    public void setEquipment_choice2 (String[] equipment_choice2)
    {
        this.equipment_choice2 = equipment_choice2;
    }

    public String[] getEquipment_choice3 ()
    {
        return equipment_choice3;
    }

    public void setEquipment_choice3 (String[] equipment_choice3)
    {
        this.equipment_choice3 = equipment_choice3;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Equipment_choice1 = "+equipment_choice1+", Equipment_choice2 = "+equipment_choice2+", Equipment_choice3 = "+equipment_choice3+"]";
    }
}
