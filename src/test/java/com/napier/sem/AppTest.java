package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void displayTestNull (){
        app.displayCountry(null);
    }
    @Test
    void displayCountryTestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountry(countries);
    }

    @Test
    void displayCountryContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountry(countries);
    }

    @Test
    void Countries()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setCode("NAT");
        emp.setName("Aruba");
        emp.setPopulation(120000);
        emp.setRegion("Caribbean");
        emp.setContinent("North America");
        emp.setCapital_n("Oranjestad");
        countries.add(emp);
        app.displayCountry(countries);
    }
   
 // Test for displayTopCapitalinContinent //
 @Test
 void displayTopCapitalinContinentTestNull (){
     app.displayCountry(null);
 }
    @Test
    void displayCountry()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountry(countries);
    }

    @Test
    void displayTopCapitalinContinentContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountry(countries);
    }

    @Test
    void displayTopCapitalinContinentTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setPopulation(120000);
        emp.setCapital_n("Oranjestad");
        countries.add(emp);
        app.displayCountry(countries);
    }
    // Test for displayCapitalinW //

    @Test
    void displayCapitalinWTestNull (){
        app.displayCountry(null);
    }
    @Test
    void displayCapitalinW()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountry(countries);
    }

    @Test
    void displayCapitalinWContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountry(countries);
    }

    @Test
    void displayCapitalinWTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setPopulation(120000);
        emp.setCapital_n("Oranjestad");
        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayTopCityinW //
    @Test
    void displayTopCityinWTestNull (){
        app.displayCountry(null);
    }
    @Test
    void displayTopCityinW()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinW(cities);
    }

    @Test
    void displayTopCityinWContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayTopCityinW(cities);
    }

    @Test
    void displayTopCityinWTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

       cities.add(emp);
        app.displayTopCityinW(cities);
    }

}
