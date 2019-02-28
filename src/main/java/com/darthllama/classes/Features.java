package com.darthllama.classes;

public class Features {

    private String featureName;

    private String featureDescription;

    public String getFeatureName ()
    {
        return featureName;
    }

    public void setFeatureName (String featureName)
    {
        this.featureName = featureName;
    }

    public String getFeatureDescription ()
    {
        return featureDescription;
    }

    public void setFeatureDescription (String featureDescription)
    {
        this.featureDescription = featureDescription;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [featureName = "+featureName+", featureDescription = "+featureDescription+"]";
    }

    public Features(){}

    public Features(String featureName, String featureDescription){
        this.featureName = featureName;
        this.featureDescription = featureDescription;

    }
}
