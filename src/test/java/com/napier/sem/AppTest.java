package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
        // Extract countries information in the world
        ArrayList<Country> cou = app.getAllCountry();

        // Display results
        app.displayCountry(cou);
    }

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
