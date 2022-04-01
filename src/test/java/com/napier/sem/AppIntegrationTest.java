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
    void testGetAllCity()
    {
        ArrayList<city> city = app.getAllCity();
        assertNotNull(city);
        assertEquals(city.size() > 0, true);
        app.displayCity(city);

    }

//    @Test
//    void testGetCountry()
//    {
//        ArrayList<Country> countries = app.getAllCountry();
//        assertNotNull(countries);
//        assertEquals(countries.size() > 0, true);
//        app.printCountries(countries);
//        System.out.println("");;
//    }


}
