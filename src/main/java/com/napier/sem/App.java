package com.napier.sem;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Currency;

public class App {

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        if(args.length < 1){
            a.connect("localhost:33060", 30000);
        }else{
            a.connect(args[0], Integer.parseInt(args[1]));
        }

//        // Connect to database
//        a.connect("db:3306", 30000);
        System.out.println("Never say Never !!!!");
        /**
         * Report for countries information
         */
        // Extract countries information in the world
        ArrayList<Country> cou = a.getAllCountry(); // developed by moeni
        // Extract city information in world
//        ArrayList<City> cityinW = a.getAllCityinW(); //developed by moeni
//        // Extract city information in continent
//        ArrayList<City> cityinC = a.getAllCityContinent("North America");// developed by moeni
//        // Extract countries information in a continent
////        ArrayList<Country> con = a.getAllContinent();
//        // Extract countries information in a continent
//        ArrayList<Country> topCountryinW = a.getAllTopCountryinW(6);//developed by moeni

        // Display results
        a.displayCountry(cou, "allcountryinW.md");//developed by moeni
//        a.displayCityinW(cityinW); //developed by moeni
//        a.displayCityContinent(cityinC);// developed by moeni
//        a.displayTopCountryinw(topCountryinW,"TopcountriesinW.md");
        // _________________________________________ Moe Ni Ni Chaw_____________________________//



        // Extract countries information in a region
//        ArrayList<Country> capitalinW = a.getAllCapitalinW();
//        ArrayList<Country> capitalinR = a.getAllCapitalinR("Central America");

//      a.displayContinent(con);
//      a.displayRegion(reg);
//        a.displayCapitalinW(capitalinW);


        /**
         * Report for city information
         */
        // Extract city information in the world
//        ArrayList<City> cit = a.getAllCity();


        // Extract cities information in a region
//        ArrayList<city> reg = a.getAllCityRegion("Southern Europe");
//        ArrayList<city> dist = a.getAllCitiesINDist("Noord-Brabant");
//        ArrayList<city> cityDist = a.getAllTopCityinDist(6,"Gelderland");
//        ArrayList<city> cou = a.getAllTopCityinCou(4,"Austria");
//        ArrayList<Country> CaptialinC = a.getAllCapitalinContinent("Asia"); //By HWYl
//        a.displayCapitalinContinent(CaptialinC);//By HWYL
        // Display results
//        a.displayCity(cit);


//        a.displayCityINRegion(reg);
//        a.displayCityInDist(dist);
//        a.displayTopCityinDist(cityDist);
//        a.displayTopCityinCou(cou);
        // Disconnect from database
        a.disconnect();
    }
    /**
     * Connect to the MySQL database.
     */
    public void connect(String conString, int delay)
    {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                //Added allowPublicKeyRetrieval=true to get Integration Tests to work. Possibly due to accessing from another class?
                con = DriverManager.getConnection("jdbc:mysql://" + conString + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "group3");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * Gets all the countires info in the world developed by Moe Ni Ni Chaw.
     * @return A list of all countries and population, or null if there is an error.
     */
    public ArrayList<Country> getAllCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.Countrycode and country.Capital = city.ID order by country.Population desc;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {

                Country emp = new Country();

                emp.setCode(rset.getString("country.Code"));
                emp.setName(rset.getString("country.Name"));
                emp.setContinent(rset.getString("country.Continent")) ;
                emp.setRegion(rset.getString("country.Region"));
                emp.setPopulation(rset.getInt("country.Population"));
                emp.setCapital_n(rset.getString("city.Name"));

                countries.add(emp);

//                System.out.println(emp.continent);
//                countries.add(new Country(rset.getString(1),rset.getString(2),rset.getString(3), rset.getString(4), rset.getInt(5)  ));
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country in the world details");
            return null;
        }
    }
    /**
     * Display all the countires info in the world developed by Moe Ni Ni Chaw.
     * @return A list of all countries and population, or null if there is an error.
     */

    public void displayCountry(ArrayList<Country> cou, String filename)
    {

        System.out.println(filename);
        // Check country is not null
        if (cou == null)
        {
            System.out.println("No country");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print header
        sb.append("Reporting all the countries in the world organised by largest population to smallest\n ");
        sb.append("-----------------------------------------------------------------------------------\n");
        sb.append(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Country","Region","Population", "Continent"));
        sb.append("\n");

        for (Country emp : cou)
        {
            sb.append(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
            sb.append("\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * created methond for test integration by moeni12
     * @return A list of all city, or null if there is an error.
     */
    public void printCountries(ArrayList<Country> countries)
    {
        // Check country is not null
        if (countries == null)
        {
            System.out.println("No country");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-15s %-20s %-8s", "Code", "Name", "Population", "Continent"));
        // Loop over all employees in the list
        for (Country emp : countries)
        {
            String emp_string =
                    String.format("%-10s %-15s %-20s %-8s",
                            emp.getCode(), emp.getName(), emp.getContinent(), emp.getPopulation());
            System.out.println(emp_string);
        }
    }

    /**
     * Gets all the current city in the world by Moe Ni Ni Chaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<City> getAllCityinW()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.Countrycode ORDER BY city.Population desc";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
//                emp.code = rset.getString("country.Code");
                emp.setCityName(rset.getString("city.Name"));
                emp.setConame(rset.getString("country.Name"));
               emp.setDistrict(rset.getString("city.District"));
                emp.setPopulation (rset.getInt("city.Population"));

                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
            return null;
        }
    }


    public void displayCityinW(ArrayList<City> cou)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("Report all the cities in the world organised by largest population to smallest \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : cou)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }

    /**
     * Gets all the current city in a continent by Moe Ni Ni Chaw.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllCityContinent(String cont)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            cont = "North America";
            String strSelect = "SELECT *"
                    + "FROM country, city "
                    + "WHERE country.Code= city.CountryCode AND country.Continent =" + "'" + cont + "'"
                    + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
//                emp.code = rset.getString("country.Code");
                emp.setCityName(rset.getString("city.Name"));
                emp.setConame(rset.getString("country.Name"));
                emp.setDistrict(rset.getString("city.District"));
                emp.setPopulation (rset.getInt("city.Population"));


                city.add(emp);

            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population in continent");
            return null;
        }
    }

    public void displayCityContinent(ArrayList<City> con)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("Report All the countries in a continent organised by largest population to smallest. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : con)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }

    /**
     * Gets Top countries in the world by Moe Ni Ni Chaw.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<Country> getAllTopCountryinW(int Num)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode ORDER BY city.Population desc limit " + Num;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();


            while (rset.next())
            {
                Country emp = new Country();

                emp.setCode(rset.getString("country.Code"));
                emp.setName(rset.getString("country.Name"));
                emp.setContinent(rset.getString("country.Continent")) ;
                emp.setRegion(rset.getString("country.Region"));
                emp.setPopulation(rset.getInt("country.Population"));
                emp.setCapital_n(rset.getString("city.Name"));

                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayTopCountryinw(ArrayList<Country> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No country");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print header
        sb.append("Reporting The top N populated countries in the world where N is provided by the user.\n ");
        sb.append("-----------------------------------------------------------------------------------\n");
        sb.append(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Country","Region","Population", "Continent"));
        sb.append("\n");

        for (Country emp : world)
        {
            sb.append(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
            sb.append("\n");

        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // ------------------------ ending of Moe Ni Ni Chaw's Features____________________________

    /**
     * Gets all the Capital in the region by PhooPwintThin.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllCapitalinR(String reg)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT * FROM country, city WHERE country.Capital = city.ID and country.Region = " + "'" + reg + "'" + "ORDER BY city.Population desc";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();


            while (rset.next())
            {
                Country emp = new Country();

//                emp.code = rset.getString("country.Code");

                emp.setName(rset.getString("country.Name"));
                emp.setCapital_n(rset.getString("city.Name"));
                emp.setPopulation(rset.getInt("city.Population"));


                Country.add(emp);
            }
            return Country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
            return null;
        }
    }

    public void displayCapitalinR(ArrayList<Country> world)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("All the capital cities in a region organised by largest to smallest.\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-20s",  "Name", "Country","Population"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-35s %-40s %-20s",  emp.getName(), emp.getCapital_n(),emp.getPopulation()));

        }

    }



    /**
     * Gets all the Capital in the continent by HWYL.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllCapitalinContinent(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Capital = city.ID and country.Continent = " + "'" + continent + "'" + "ORDER BY city.Population desc";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();


            while (rset.next())
            {
                Country emp = new Country();

                emp.setName(rset.getString("country.Name"));
                emp.setCapital_n(rset.getString("city.Name"));
                emp.setPopulation(rset.getInt("city.Population"));


                Country.add(emp);
            }
            return Country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
            return null;
        }
    }


    public void displayCapitalinContinent(ArrayList<Country> world)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("All the capital cities in a continent organised by largest population to smallest.\n\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-20s",  "Name", "Country","Population"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-35s %-40s %-20s",  emp.getName(), emp.getCapital_n(),emp.getPopulation()));

        }

    }

}
