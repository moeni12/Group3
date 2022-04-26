package com.napier.sem;

public class Language {

    private String countrycode;
    private String language;
    private boolean official;
    private double totalpercentage;

    public String getCountryCode() {
        return countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public boolean getOffical() {
        return official;
    }

    public double getTotalpercentage() {
        return totalpercentage;
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

    public void setTotalpercentage( double newpercentage) {
        totalpercentage = newpercentage;
    }









}
