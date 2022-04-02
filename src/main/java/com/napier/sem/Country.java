package com.napier.sem;


public class Country {

    private String code;
    private String name;
    private String continent;
    private String region;
    private int population;
    private int capital;
    private String capital_n;



    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public int getCapital() {
        return capital;
    }

    public String getCapital_n() {
        return capital_n;
    }

    public void setCode( String newcode) {
        code = newcode;
    }

    public void setName( String newname) {
        name= newname;
    }

    public void setContinent( String newcontinent) {
        continent= newcontinent;
    }

    public void setRegion( String newregion) {
        region= newregion;
    }

    public void setPopulation( int newpopulation) {
        population = newpopulation;
    }

    public void setCapital( int newcapital) {
        capital = newcapital;
    }

    public void setCapital_n( String newcapital_n) {
        capital_n = newcapital_n;
    }




}
