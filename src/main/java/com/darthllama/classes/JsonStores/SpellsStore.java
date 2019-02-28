package com.darthllama.classes.JsonStores;

import com.darthllama.classes.Spells;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class SpellsStore {
    final static Logger logger = Logger.getLogger(SpellsStore.class);

    private ArrayList<Spells> spellsArray;

    public SpellsStore(){ spellsArray = new ArrayList<Spells>(); }

    public void AddSpells(String spellName, String spellLevel, String spellDesc){
        spellsArray.add(new Spells(spellName, spellLevel, spellDesc));

        logger.info("Spell added to store; " + spellName);
    }

    //To get specific spells
    public Spells getSpellsAtIndex(int index){
        return spellsArray.get(index);
    }

    //or the entire list
    public ArrayList getSpellsArr(){
        return spellsArray;
    }

    public String getSpellsArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < spellsArray.size()){
            if(temp == spellsArray.size() - 1){
                output += spellsArray.get(temp).getSpellName();
            }
            else{
                output += spellsArray.get(temp).getSpellName() + ", ";
            }
            temp++;
        }

        return "Spells Array as String; " + output;
    }
}
