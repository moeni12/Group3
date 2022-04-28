package com.napier.sem;

public class Language {

    private String countrycode;
    private String language;
    private boolean official;
    private float totalpercentage;
    private float totalpoupulation;




    public String getCountryCode() {
        return countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public boolean getOffical() {
        return official;
    }

    public float getTotalpercentage() {
        return totalpercentage;
    }

    public float getTotalpopulation() {
        return totalpoupulation;
    }


    public void setCountrycode( String newcountrycode) {
        countrycode = newcountrycode;
    }

    public void setLanguage( String newLanguage) {
        language = newLanguage;
    }

    public void setOfficial( boolean newOfficial) {
        official = newOfficial;
    }

    public void setTotalpercentage( float newpercentage) {
        totalpercentage = newpercentage;
    }

    public void setTotalpoupulation( float newpopulation) {
        totalpoupulation = newpopulation;
    }










}
