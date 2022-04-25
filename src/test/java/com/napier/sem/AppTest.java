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
   
    

}
