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
    void printCountriesTestNull()
    {
        app.printCountries(null);
    }

    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountries(countries);
    }

//    @Test
//    void printCountriesTestContainsNull()
//    {
//        ArrayList<Country> countries = new ArrayList<Country>();
//        countries.add(null);
//        app.printCountries(countries);
//    }

    @Test
    void displayCountries()
    {
        // Display results
        app.displayCountry(null);
    }

    @Test
    void displayCities()
    {
        // Display results

        app.displayCity(null);
    }

    @Test
    void displayCapital()
    {
        // Display results
        app.displayCapitalinW(null);
    }

//    @Test
//    void getCountries()
//    {
//        ArrayList<Country> countries = app.getAllCountry();
//        Country emp = new Country();
//
//        assertEquals("Caribbean", emp.region);
//        assertEquals("Netherlands Antilles",emp.name);
//
//    }
//
//    @Test
//    void getCity()
//    {
//        ArrayList<city> countries = app.getAllCity();
//        city emp = new city();
//
//        assertEquals("Rangoon (Yangon)", emp.Name);
//        assertEquals("Myanmar",emp.cName);
//
//    }
//
//    @Test
//    void getCapital()
//    {
//        ArrayList<Country> capital = app.getAllCapitalinW();
//        Country emp = new Country();
//
//        assertEquals("Mexico", emp.name);
//        assertEquals("Ciudad de México",emp.capital_n);
//
//    }

//    @Test
//    void printCountries()
//    {
//        ArrayList<Country> countries = new ArrayList<Country>();
//        Country emp = new Country();
//        emp.code = "NAT";
//        emp.name = "Kevin";
//        emp.population = 120000;
//        emp.continent = "Engineer";
//
//        countries.add(emp);
//        app.printCountries(countries);
//    }
}
