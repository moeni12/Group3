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
    void testGetCityContinent()
    {
        ArrayList<City> city = app.getAllCityContinent("Asia");
        assertNotNull(city);
        assertEquals(city.size() > 0, true);
        app.displayCityContinent(city);

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
    void testGetCapitalinRegion()
    {
        ArrayList<Country> capitalinR = app.getAllCapitalinR("Central America");
        assertNotNull(capitalinR);
        assertEquals(capitalinR.size() > 0, true);
        app.displayCapitalinR(capitalinR);

    }
    @Test
    void testGetCapitalinContinent()
    {
        ArrayList<Country> capitalinConti = app.getAllCapitalinContinent("Asia");
        assertNotNull(capitalinConti);
        assertEquals(capitalinConti.size() > 0, true);
        app.displayCapitalinContinent(capitalinConti);

    }

//    @Test
//    void testGetTopcityinR()
//    {
//        ArrayList<City> topcityinR = app.getAllTopCityinR(5, "China");
//        assertNotNull(topcityinR);
//        assertEquals(topcityinR.size() > 0, true);
//        app.displayTopCityinR(topcityinR);
//
//    }

    @Test
    void testGetpopucityR()
    {
        ArrayList<Country> populacityR = app.getAllPopulationCityRegion();
        assertNotNull(populacityR);
        assertEquals(populacityR.size() > 0, true);
        app.displayPoupulationCityRegion(populacityR);

    }

//    @Test
//    void testGetcountryinROrga()
//    {
//        ArrayList<Country> CountryRO = app.getAllRegion("Central Africa");
//        assertNotNull(CountryRO);
//        assertEquals(CountryRO.size() > 0, true);
//        app.displayCountryInReg(CountryRO);
//
//    }

    @Test
    void testGetcountriesinContiOrg()
    {
        ArrayList<Country> countriesCO = app.getAllCountryINContinent("Asia");
        assertNotNull(countriesCO);
        assertEquals(countriesCO.size() > 0, true);
        app.displayCountryInContinent(countriesCO);

    }

//    @Test
//    void testGetCurrentCityinR()
//    {
//        ArrayList<City> currentcityR = app.getAllCityInReg("Asia");
//        assertNotNull(currentcityR);
//        assertEquals(currentcityR.size() > 0, true);
//        app.displayCityInReg(currentcityR);
//
//    }


    @Test
    void testGetCurrentcityinD()
    {
        ArrayList<City> currcityinD = app.getAllCityInDist("Central Africa");
        assertNotNull(currcityinD);
//        assertEquals(currcityinD.size() > 0, true);
        app.displayCityInDIst(currcityinD);

    }

    @Test
    void testGettopcountincontin()
    {
        ArrayList<Country> topcounContin = app.getAllTopCountryinCont(4, "Asia");
        assertNotNull(topcounContin);
        assertEquals(topcounContin.size() > 0, true);
        app.displayTopCountryinCont(topcounContin);

    }

    @Test
    void testGettopNpopCountinR()
    {
        ArrayList<Country> topNPCountR = app.getAllTopCountryinReg(4, "Central Africa");
        assertNotNull(topNPCountR);
//        assertEquals(topNPCountR.size() > 0, true);
        app.displayTopCountryinReg(topNPCountR);

    }

}
