package com.darthllama.classes.PlayerClassDetails;

import com.darthllama.classes.PlayerClassDetails.PlayerClassLevels.*;

public class PlayerClass
{
    //All the main stuff
    private Equipment_Choices equipment_choices;
    private String spellcasting_attribute;
    private String[] archetypes; //Not going to be used in first version
    private String hitDie;
    private String class_name;
    private String[] skill_choice;
    private String[] equipment;
    private String[] saving_throws;
    private String[] proficiencies_weapons; //Not going to be used in first version
    private String[] proficiencies_armours; //Not going to be used in first version
    private String[] proficiencies_tools; //Not going to be used in first version


    //Stuff at different Levels //Not going to be used in first version
    private PlayerClassLevel1 PlayerClassLevel1;
    private PlayerClassLevel2 PlayerClassLevel2;
    private PlayerClassLevel3 PlayerClassLevel3;
    private PlayerClassLevel4 PlayerClassLevel4;
    private PlayerClassLevel5 PlayerClassLevel5;
    private PlayerClassLevel6 PlayerClassLevel6;
    private PlayerClassLevel7 PlayerClassLevel7;
    private PlayerClassLevel8 PlayerClassLevel8;
    private PlayerClassLevel9 PlayerClassLevel9;
    private PlayerClassLevel10 PlayerClassLevel10;
    private PlayerClassLevel11 PlayerClassLevel11;
    private PlayerClassLevel12 PlayerClassLevel12;
    private PlayerClassLevel13 PlayerClassLevel13;
    private PlayerClassLevel14 PlayerClassLevel14;
    private PlayerClassLevel15 PlayerClassLevel15;
    private PlayerClassLevel16 PlayerClassLevel16;
    private PlayerClassLevel17 PlayerClassLevel17;
    private PlayerClassLevel18 PlayerClassLevel18;
    private PlayerClassLevel19 PlayerClassLevel19;
    private PlayerClassLevel20 PlayerClassLevel20;

    public Equipment_Choices getEquipment_choices ()
    {
        return equipment_choices;
    }

    public void setEquipment_choices (Equipment_Choices equipment_choices)
    {
        this.equipment_choices = equipment_choices;
    }

    public String getSpellcasting_attribute ()
    {
        return spellcasting_attribute;
    }

    public void setSpellcasting_attribute (String spellcasting_attribute)
    {
        this.spellcasting_attribute = spellcasting_attribute;
    }

    public String[] getArchetypes ()
    {
        return archetypes;
    }

    public void setArchetypes (String[] archetypes)
    {
        this.archetypes = archetypes;
    }

    public String getHitDie ()
    {
        return hitDie;
    }

    public void setHitDie (String hitDie)
    {
        this.hitDie = hitDie;
    }

    public String getClass_name ()
    {
        return class_name;
    }

    public void setClass_name (String class_name)
    {
        this.class_name = class_name;
    }

    public PlayerClassLevel10 getPlayerClassLevel10 ()
{
    return PlayerClassLevel10;
}

    public void setPlayerClassLevel10 (PlayerClassLevel10 PlayerClassLevel10)
    {
        this.PlayerClassLevel10 = PlayerClassLevel10;
    }

    public PlayerClassLevel11 getPlayerClassLevel11 ()
{
    return PlayerClassLevel11;
}

    public void set11 (PlayerClassLevel11 PlayerClassLevel11)
    {
        this.PlayerClassLevel11 = PlayerClassLevel11;
    }

    public String[] getSkill_choice ()
    {
        return skill_choice;
    }

    public void setSkill_choice (String[] skill_choice)
    {

        //turn the numbers into something readable
        int temp = 0;
        while (temp < skill_choice.length){
            if(skill_choice[temp] == "0"){
                skill_choice[temp] = "Strength";
            }
            else if(skill_choice[temp] == "1"){
                skill_choice[temp] = "Dexterity";
            }
            else if(skill_choice[temp] == "2"){
                skill_choice[temp] = "Constitution";
            }
            else if(skill_choice[temp] == "3"){
                skill_choice[temp] = "Intelligence";
            }
            else if(skill_choice[temp] == "4"){
                skill_choice[temp] = "Wisdom";
            }
            else if(skill_choice[temp] == "5"){
                skill_choice[temp] = "Charisma";
            }
            temp++;
        }

        this.skill_choice = skill_choice;
    }

    public PlayerClassLevel12 getPlayerClassLevel12 ()
{
    return PlayerClassLevel12;
}

    public void setPlayerClassLevel12 (PlayerClassLevel12 PlayerClassLevel12)
    {
        this.PlayerClassLevel12 = PlayerClassLevel12;
    }

    public PlayerClassLevel13 getPlayerClassLevel13 ()
{
    return PlayerClassLevel13;
}

    public void setPlayerClassLevel13 (PlayerClassLevel13 PlayerClassLevel13)
    {
        this.PlayerClassLevel13 = PlayerClassLevel13;
    }

    public PlayerClassLevel14 getPlayerClassLevel14 ()
{
    return PlayerClassLevel14;
}

    public void setPlayerClassLevel14 (PlayerClassLevel14 PlayerClassLevel14)
    {
        this.PlayerClassLevel14 = PlayerClassLevel14;
    }

    public PlayerClassLevel15 getPlayerClassLevel15 ()
{
    return PlayerClassLevel15;
}

    public void setPlayerClassLevel15 (PlayerClassLevel15 PlayerClassLevel15)
    {
        this.PlayerClassLevel15 = PlayerClassLevel15;
    }

    public PlayerClassLevel16 getPlayerClassLevel16 ()
{
    return PlayerClassLevel16;
}

    public void setPlayerClassLevel16 (PlayerClassLevel16 PlayerClassLevel16)
    {
        this.PlayerClassLevel16 = PlayerClassLevel16;
    }

    public PlayerClassLevel17 getPlayerClassLevel17 ()
{
    return PlayerClassLevel17;
}

    public void setPlayerClassLevel17 (PlayerClassLevel17 PlayerClassLevel17)
    {
        this.PlayerClassLevel17 = PlayerClassLevel17;
    }

    public PlayerClassLevel18 getPlayerClassLevel18 ()
{
    return PlayerClassLevel18;
}

    public void setPlayerClassLevel18 (PlayerClassLevel18 PlayerClassLevel18)
    {
        this.PlayerClassLevel18 = PlayerClassLevel18;
    }

    public PlayerClassLevel19 getPlayerClassLevel19 ()
{
    return PlayerClassLevel19;
}

    public void setPlayerClassLevel19 (PlayerClassLevel19 PlayerClassLevel19)
    {
        this.PlayerClassLevel19 = PlayerClassLevel19;
    }

    public String[] getEquipment ()
    {
        return equipment;
    }

    public void setEquipment (String[] equipment)
    {
        this.equipment = equipment;
    }

    public PlayerClassLevel1 getPlayerClassLevel1 ()
{
    return PlayerClassLevel1;
}

    public void setPlayerClassLevel1 (PlayerClassLevel1 PlayerClassLevel1)
    {
        this.PlayerClassLevel1 = PlayerClassLevel1;
    }

    public PlayerClassLevel2 getPlayerClassLevel2 ()
{
    return PlayerClassLevel2;
}

    public void setPlayerClassLevel2 (PlayerClassLevel2 PlayerClassLevel2)
    {
        this.PlayerClassLevel2 = PlayerClassLevel2;
    }

    public PlayerClassLevel3 getPlayerClassLevel3 ()
{
    return PlayerClassLevel3;
}

    public void setPlayerClassLevel3 (PlayerClassLevel3 PlayerClassLevel3)
    {
        this.PlayerClassLevel3 = PlayerClassLevel3;
    }

    public PlayerClassLevel4 getPlayerClassLevel4 ()
{
    return PlayerClassLevel4;
}

    public void setPlayerClassLevel4 (PlayerClassLevel4 PlayerClassLevel4)
    {
        this.PlayerClassLevel4 = PlayerClassLevel4;
    }

    public String[] getSaving_throws ()
    {
        return saving_throws;
    }

    public void setSaving_throws (String[] saving_throws)
    {
        this.saving_throws = saving_throws;
    }

    public PlayerClassLevel5 getPlayerClassLevel5 ()
{
    return PlayerClassLevel5;
}

    public void setPlayerClassLevel5 (PlayerClassLevel5 PlayerClassLevel5)
    {
        this.PlayerClassLevel5 = PlayerClassLevel5;
    }

    public PlayerClassLevel6 getPlayerClassLevel6 ()
{
    return PlayerClassLevel6;
}

    public void setPlayerClassLevel6 (PlayerClassLevel6 PlayerClassLevel6)
    {
        this.PlayerClassLevel6 = PlayerClassLevel6;
    }

    public PlayerClassLevel7 getPlayerClassLevel7 ()
{
    return PlayerClassLevel7;
}

    public void setPlayerClassLevel7 (PlayerClassLevel7 PlayerClassLevel7)
    {
        this.PlayerClassLevel7 = PlayerClassLevel7;
    }

    public PlayerClassLevel8 getPlayerClassLevel8 ()
{
    return PlayerClassLevel8;
}

    public void setPlayerClassLevel8 (PlayerClassLevel8 PlayerClassLevel8)
    {
        this.PlayerClassLevel8 = PlayerClassLevel8;
    }

    public PlayerClassLevel9 getPlayerClassLevel9 ()
{
    return PlayerClassLevel9;
}

    public void setPlayerClassLevel9 (PlayerClassLevel9 PlayerClassLevel9)
    {
        this.PlayerClassLevel9 = PlayerClassLevel9;
    }

    public PlayerClassLevel20 getPlayerClassLevel20 ()
{
    return PlayerClassLevel20;
}

    public void setPlayerClassLevel20 (PlayerClassLevel20 PlayerClassLevel20)
    {
        this.PlayerClassLevel20 = PlayerClassLevel20;
    }

    public String[] getProficiencies_weapons ()
    {
        return proficiencies_weapons;
    }

    public void setProficiencies_weapons (String[] proficiencies_weapons)
    {
        this.proficiencies_weapons = proficiencies_weapons;
    }

    public String[] getProficiencies_armours ()
    {
        return proficiencies_armours;
    }

    public void setProficiencies_armours (String[] proficiencies_armours)
    {
        this.proficiencies_armours = proficiencies_armours;
    }

    public String[] getProficiencies_tools ()
    {
        return proficiencies_tools;
    }

    public void setProficiencies_tools (String[] proficiencies_tools)
    {
        this.proficiencies_tools = proficiencies_tools;
    }

    @Override
    public String toString()

    {
        return "ClassPojo [equipment_choices = "+equipment_choices+", spellcasting_attribute = "+spellcasting_attribute+", archetypes = "+archetypes+", hitDie = "+hitDie+", class_name = "+class_name+", 10 = "+10+", 11 = "+11+", skill_choice = "+skill_choice+", 12 = "+12+", 13 = "+13+", 14 = "+14+", 15 = "+15+", 16 = "+16+", 17 = "+17+", 18 = "+18+", 19 = "+19+", equipment = "+equipment+", 1 = "+1+", 2 = "+2+", 3 = "+3+", 4 = "+4+", saving_throws = "+saving_throws+", 5 = "+5+", 6 = "+6+", 7 = "+7+", 8 = "+8+", 9 = "+9+", proficiencies_weapons = "+proficiencies_weapons+", 20 = "+20+"]";
    }

    /*private Equipment_Choices equipment_choices;
    private String spellcasting_attribute;
    private String hitDie;
    private String class_name;
    private String[] skill_choice;
    private String[] equipment;
    private String[] saving_throws;*/

    public PlayerClass(){}

    public PlayerClass(String class_name, String hitDie, String[] skill_choice, String[] saving_throws){
        this.class_name = class_name;
        this.hitDie = hitDie;

        this.skill_choice = skill_choice;


        this.saving_throws = saving_throws;
    }
}