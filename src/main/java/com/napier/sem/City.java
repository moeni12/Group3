package com.napier.sem;

public class City {


    private int id;
    private String cityname;
    private String coname;
    private String district;
    private int population;


    public int getID() {
        return id;
    }

    public void setID( int newid) {
        id = newid;
    }

    public String getCityName() {
        return cityname;
    }

    public void setCityName( String newCityName) {
        cityname=newCityName;

    }

    public String getCoName() {
        return coname;
    }

    public void setConame( String newconame) {
        coname=newconame;

    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict( String newdistrict) {
        district = newdistrict;

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation( int newpopulation) {
        population = newpopulation;
    }


}
