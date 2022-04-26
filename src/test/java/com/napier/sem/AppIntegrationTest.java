package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }
    
    @Test
    void testGetAllCountries()
    {
        ArrayList<Country> countries = app.getAllCountry();
        assertNotNull(countries);
        assertEquals(countries.size() > 0, true);
        app.displayCountry(countries);

    }

    @Test
    void testGetCountry()
    {
        ArrayList<Country> countries = app.getAllCountry();
        assertNotNull(countries);
        assertEquals(countries.size() > 0, true);
        app.printCountries(countries);

    }

    @Test
    void testGetTopCapitalinConti()
    {
        ArrayList<Country> countries = app.getAllTopCapitalinContinent(5, "Asia");
        assertNotNull(countries);
        assertEquals(countries.size() > 0, true);
        app.displayTopCapitalinContinent(countries);

    }

    @Test
    void testGettopcityinW()
    {
        ArrayList<City> topcity = app.getAllTopcityinW(3);
        assertNotNull(topcity);
        assertEquals(topcity.size() > 0, true);
        app.displayTopCityinW(topcity);

    }

    @Test
    void testGetCurrentcityinW()
    {
        ArrayList<City> currcity = app.getAllCityinW();
        assertNotNull(currcity);
        assertEquals(currcity.size() > 0, true);
        app.displayCityinW(currcity);

    }

    @Test
    void testGetTopcountriesinW()
    {
        ArrayList<Country> topcountry = app.getAllTopCountryinW(5);
        assertNotNull(topcountry);
        assertEquals(topcountry.size() > 0, true);
        app.displayTopCountryinW(topcountry);

    }

//    @Test
//    void testGetCurrentcityinCoun()
//    {
//        ArrayList<City> currcityinCoun = app.getAllCityCountry("Asia");
//        assertNotNull(currcityinCoun);
//        assertEquals(currcityinCoun.size() > 0, true);
//        app.displayCityCountry(currcityinCoun);
//
//    }

    @Test
    void testGetPopulationCityC()
    {
        ArrayList<Country> populationCC = app.getAllPopulationCityContinent();
        assertNotNull(populationCC);
        assertEquals(populationCC.size() > 0, true);
        app.displayPoupulationCityContinent(populationCC);

    }

    @Test
    void testGetPopulationContinent()
    {
        ArrayList<Country> populationinW = app.getAllPopulationinW();
        assertNotNull(populationinW);
        assertEquals(populationinW.size() > 0, true);
        app.displayPoupulationinW(populationinW);

    }

    @Test
    void testGetCapitalinR()
    {
        ArrayList<Country> capitalinR = app.getAllCapitalinR("Central America");
        assertNotNull(capitalinR);
        assertEquals(capitalinR.size() > 0, true);
        app.displayCapitalinR(capitalinR);

    }

}
