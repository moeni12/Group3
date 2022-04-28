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
        app.displayTopCityinW(null);
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

    //Test for displayTopCountryinW //
    @Test
    void displayTopCountryinWTestNull (){
        app.displayTopCountryinW(null);
    }
    @Test
    void displayTopCountryinW()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayTopCountryinW(countries);
    }

    @Test
    void displayTopCountryinWContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayTopCountryinW(countries);
    }

    @Test
    void displayTopCountryinWTest()
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

    //Test for displayCityCountry //

    @Test
    void displayCityCountryTestNull (){
        app.displayCityCountry(null);

    }
    @Test
    void displayCityCountry()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayCityCountry(cities);
    }

    @Test
    void displayCityCountryContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityCountry(cities);
    }

    @Test
    void displayCityCountryTest()
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
    // Test for displayCityContinent //

    @Test
    void displayCityContinentTestNull (){
        app.displayCityCountry(null);

    }
    @Test
    void displayCityContinent()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayCityContinent(cities);
    }

    @Test
    void displayCityContinentContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityContinent(cities);
    }

    @Test
    void displayCityContinentTest()
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

    // Test for displayPoupulationCityContinent //

    @Test
    void displayPoupulationCityContinentTestNull (){
        app.displayPoupulationCityContinent(null);
    }
    @Test
    void displayPoupulationCityContinent()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPoupulationCityContinent(countries);
    }

    @Test
    void displayPoupulationCityContinentContainsNullTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPoupulationCityContinent(countries);
    }

    @Test
    void displayPoupulationCityContinentTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setContinent("North America");
        emp.setPopulation_result(5);
        emp.setPopulationcity_result(2);


        countries.add(emp);
        app.displayCountry(countries);

    }
// Test for displayPoupulationinW //
@Test
void displayPoupulationinWTestNull (){
    app.displayPoupulationinW(null);
}
    @Test
    void displayPoupulationinW()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountry(countries);
    }

    @Test
    void displayPoupulationinWContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountry(countries);
    }

    @Test
    void displayPoupulationinWTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.getPopulation_result();

        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayCapitalinR //

    @Test
    void displayCapitalinRTestNull (){
        app.displayCapitalinR(null);
    }
    @Test
    void displayCapitalinR()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCapitalinR(countries);
    }

    @Test
    void displayCapitalinRContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCapitalinR(countries);
    }

    @Test
    void displayCapitalinRTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setCapital_n("Caribbean");
        emp.setPopulation(103000);


        countries.add(emp);
        app.displayCountry(countries);
    }
    // Test for displayCapitalinContinent //

    @Test
    void displayCapitalinContinentTestNull (){
        app.displayCapitalinContinent(null);
    }
    @Test
    void displayCapitalinContinent()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCapitalinContinent(countries);
    }

    @Test
    void displayCapitalinContinentContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCapitalinContinent(countries);
    }

    @Test
    void displayCapitalinContinentTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setCapital_n("Kabul");
        emp.setPopulation(103000);

        countries.add(emp);
        app.displayCapitalinContinent(countries);
    }
// Test for displayTopCityinR //

    @Test
    void displayTopCityinRTestNull (){
        app.displayTopCityinR(null);

    }
    @Test
    void displayTopCityinR()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinR(cities);
    }

    @Test
    void displayTopCityinRContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayTopCityinR(cities);
    }

    @Test
    void displayTopCityinRTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }
    // Test for displayPoupulationCityRegion //

    @Test
    void displayPoupulationCityRegionTestNull (){
        app.displayPoupulationCityRegion(null);
    }
    @Test
    void displayPoupulationCityRegion()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPoupulationCityRegion(countries);
    }

    @Test
    void displayPoupulationCityRegionContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPoupulationCityRegion(countries);
    }


    // Test for displayCountryInReg //


    @Test
    void displayCountryInRegTestNull (){
        app.displayCapitalinContinent(null);
    }
    @Test
    void displayCountryInReg()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountryInReg(countries);
    }

    @Test
    void displayCountryInRegContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountryInReg(countries);
    }

    @Test
    void displayCountryInRegContinentTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setCode("ABW");
        emp.setName("Aruba");
        emp.setContinent("North America");
        emp.setRegion("Caribbean");
        emp.setPopulation(103000);
        emp.setCapital_n("Kabul");

        countries.add(emp);
        app.displayCountryInReg(countries);
    }
// Test for displayCountryInContinent //


    @Test
    void displayCountryInContinentTestNull (){
        app.displayCapitalinContinent(null);
    }
    @Test
    void displayCountryInContinent()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayCountryInContinent(countries);
    }

    @Test
    void displayCountryInContinentContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayCountryInContinent(countries);
    }

    @Test
    void displayCountryInContinentTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setCode("ABW");
        emp.setName("Aruba");
        emp.setContinent("North America");
        emp.setRegion("Caribbean");
        emp.setPopulation(103000);
        emp.setCapital_n("Kabul");

        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayCityInReg //

    @Test
    void displayCityInRegTestNull (){
        app.displayCityInReg(null);

    }
    @Test
    void displayCityInReg()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayCityInReg(cities);
    }

    @Test
    void displayCityInRegContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityInReg(cities);
    }

    @Test
    void displayCityInRegTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }
// Test for displayCityInDIst //
@Test
void displayCityInDIstTestNull (){
    app.displayCityInDIst(null);

}
    @Test
    void displayCityInDIst()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayCityInDIst(cities);
    }

    @Test
    void displayCityInDIstContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityInDIst(cities);
    }

    @Test
    void displayCityInDIstTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }
    // Test for displayTopCountryinCont //


    @Test
    void displayTopCountryinContTestNull (){
        app.displayTopCountryinCont(null);
    }
    @Test
    void displayTopCountryinCont()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayTopCountryinCont(countries);
    }

    @Test
    void displayTopCountryinContContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayTopCountryinCont(countries);
    }

    @Test
    void displayTopCountryinContTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setCode("ABW");
        emp.setName("Aruba");
        emp.setCapital_n("Kabul");
        emp.setPopulation(103000);

        countries.add(emp);
        app.displayCountry(countries);
    }
    // Test for displayTopCountryinReg //



    @Test
    void displayTopCountryinRegTestNull (){
        app.displayTopCountryinReg(null);
    }
    @Test
    void displayTopCountryinReg()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayTopCountryinReg(countries);
    }

    @Test
    void displayTopCountryinRegContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayTopCountryinReg(countries);
    }

    @Test
    void displayTopCountryinRegTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();

        emp.setCode("ABW");
        emp.setName("Aruba");
        emp.setContinent("North America");
        emp.setRegion("Caribbean");
        emp.setPopulation(103000);
        emp.setCapital_n("Kabul");
        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayTopCityinCoun //

    @Test
    void displayTopCityinCounTestNull (){
        app.displayTopCityinCoun(null);

    }
    @Test
    void displayTopCityinCoun()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinCoun(cities);
    }

    @Test
    void displayTopCityinCounContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayTopCityinCoun(cities);
    }

    @Test
    void displayTopCityinCounTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);
        cities.add(emp);
        app.displayTopCityinR(cities);
    }
    // Test for displayTopCityinDist //
    @Test
    void displayTopCityinDistTestNull (){
        app.displayTopCityinDist(null);

    }
    @Test
    void displayTopCityinDist()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinDist(cities);
    }

    @Test
    void displayTopCityinDistContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayTopCityinDist(cities);
    }

    @Test
    void displayTopCityinDistTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }

    // Test for displayTopCityinContiN //

    @Test
    void displayTopCityinContiNTestNull (){
        app.displayTopCityinContiN(null);

    }
    @Test
    void displayTopCityinContiN()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinContiN(cities);
    }

    @Test
    void displayTopCityinContiNContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayTopCityinDist(cities);
    }

    @Test
    void displayTopCityinContiNTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }

    // Test for displayTopCapitalinW //


    @Test
    void displayTopCapitalinWTestNull (){
        app.displayTopCapitalinW(null);
    }
    @Test
    void displayTopCapitalinW()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayTopCapitalinW(countries);
    }

    @Test
    void displayTopCapitalinWContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayTopCapitalinW(countries);
    }

    @Test
    void displayTopCapitalinWTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setCapital_n("Kabul");
        emp.setPopulation(103000);

        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayPopulationCityCountry //


    @Test
    void displayPopulationCityCountryTestNull (){
        app.displayPopulationCityCountry(null);
    }
    @Test
    void displayPopulationCityCountry()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPopulationCityCountry(countries);
    }

    @Test
    void displayPopulationCityCountryContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPopulationCityCountry(countries);
    }

    @Test
    void displayPopulationCityCountryTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setName("Aruba");
        emp.setPopulation_result(20600);
        emp.setPopulationcity_result(30000);
        emp.setResult(50000);

        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayCityinW //

    @Test
    void displayCityinWTestNull (){
        app.displayCityinW(null);

    }
    @Test
    void displayCityinW()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.displayTopCityinContiN(cities);
    }

    @Test
    void displayCityinWContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityinW(cities);
    }

    @Test
    void displayCityinWTest()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.setCityName("Kabul");
        emp.setConame("Aruba");
        emp.setDistrict("Kabol");
        emp.setPopulation(1780000);

        cities.add(emp);
        app.displayTopCityinR(cities);
    }

    // Test for displayPoupulationinCont //

    @Test
    void displayPoupulationinContTestNull (){
        app.displayPoupulationinCont(null);
    }
    @Test
    void displayPoupulationinCont()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPoupulationinCont(countries);
    }

    @Test
    void displayPoupulationinContContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPoupulationinCont(countries);
    }

    @Test
    void displayPoupulationinContTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setContinent("North America");
        emp.setPopulation_result(103000);

        countries.add(emp);
        app.displayCountry(countries);
    }
    // Test for displayPoupulationinReg //

    @Test
    void displayPoupulationinRegTestNull (){
        app.displayPoupulationinReg(null);
    }
    @Test
    void displayPoupulationinReg()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPoupulationinReg(countries);
    }

    @Test
    void displayPoupulationinRegContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPoupulationinReg(countries);
    }

    @Test
    void displayPoupulationinRegTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setContinent("North America");
        emp.setPopulation_result(103000);

        countries.add(emp);
        app.displayCountry(countries);
    }

    // Test for displayPoupulationinCou //

    @Test
    void displayPoupulationinCouTestNull (){
        app.displayPoupulationinCou(null);
    }
    @Test
    void displayPoupulationinCou()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.displayPoupulationinCou(countries);
    }

    @Test
    void displayPoupulationinCouContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.displayPoupulationinCou(countries);
    }

    @Test
    void displayPoupulationinCouTest()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.setContinent("North America");
        emp.setPopulation_result(103000);

        countries.add(emp);
        app.displayCountry(countries);
    }

}
