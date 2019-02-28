package com.darthllama.classes.JsonStores;

import com.darthllama.classes.Background;
import com.darthllama.classes.Features;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class FeaturesStore {
    final static Logger logger = Logger.getLogger(FeaturesStore.class);

    private ArrayList<Features> featuresArray;

    public FeaturesStore(){ featuresArray = new ArrayList<Features>(); }

    public void addFeatures(String featuresName, String featuresDesc){
        featuresArray.add(new Features(featuresName, featuresDesc));

        logger.info("Feature added to feature store; " + featuresName);
    }

    //To get specific backgrounds
    public Features getFeaturesAtIndex(int index){
        return featuresArray.get(index);
    }

    //or the entire list
    public ArrayList getFeaturesArr(){
        return featuresArray;
    }

    public String getFeaturesArrAsString(){
        String output = "";
        int temp = 0;

        while (temp < featuresArray.size()){
            if(temp == featuresArray.size() - 1){
                output += featuresArray.get(temp).getFeatureName();
            }
            else{
                output += featuresArray.get(temp).getFeatureName() + ", ";
            }
            temp++;
        }

        return "Features Array as String; " + output;
    }
}
