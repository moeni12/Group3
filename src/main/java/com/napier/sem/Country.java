package com.napier.sem;


public class Country {

    private String code;
    private String name;
    private String continent;
    private String region;
    private int population;
    private int capital;
    private String capital_n;
    private Long population_result;
    private Double populationcity_result;
    private Double result;



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

    public Long getPopulation_result() {
        return population_result;
    }
    public double getPopulationcity_result() {
        return populationcity_result;
    }
    public double getResult() {
        return result;
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

    public void setPopulation_result( long newpopulation_result) {
        population_result = newpopulation_result;
    }

    public void setPopulationcity_result( double newpopulationcity_result) {
        populationcity_result = newpopulationcity_result;
    }

    public void setResult( double newresult) {
        result = newresult;
    }


    public void setCapital( int newcapital) {
        capital = newcapital;
    }

    public void setCapital_n( String newcapital_n) {
        capital_n = newcapital_n;
    }




}
