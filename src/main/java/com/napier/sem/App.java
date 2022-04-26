package com.napier.sem;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
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
        ArrayList<City> cityinW = a.getAllCityinW(); //developed by moeni

        ArrayList<City> cityinC = a.getAllCityContinent("North America");// developed by moeni
      // Extract countries information in the world
        ArrayList<Country> topCountryinW = a.getAllTopCountryinW(6);//developed by moeni
        // Extract city information in a country
        ArrayList<City> cityinCou = a.getAllCityCountry("Myanmar");// developed by moeni
        // Extract city information in the world
        ArrayList<City> topCityinW = a.getAllTopcityinW(6);//developed by moeni
        ArrayList<Country> capitalinW = a.getAllCapitalinW();//moeni
        ArrayList<Country> topcapitalinCon = a.getAllTopCapitalinContinent(5,"Asia");//moeni
 
        ArrayList<Country> popcitycontient = a.getAllPopulationCityContinent();//moeni
        ArrayList<Country> popinW = a.getAllPopulationinW();//moeni
     
        // Display results
          a.displayCountry(cou);//developed by moeni
//        a.displayCityinW(cityinW); //developed by moeni
//        a.displayCityContinent(cityinC);// developed by moeni
//        a.displayTopCountryinW(topCountryinW,"TopcountriesinW.md");
//        a.displayCityCountry(cityinCou);// developed by moeni
//        a.displayTopCityinW(topCityinW,"TopcountriesinW.md");// by moeni
//        a.displayCapitalinW(capitalinW);
//
        a.displayPoupulationCityContinent(popcitycontient);//By moeni
        a.displayPoupulationinW(popinW);//By moeni
       
        // _________________________________________ Moe Ni Ni Chaw_____________________________//
        //______________________________________________Phoo Pwint THin______________________________//
        ArrayList<Country> capitalinR = a.getAllCapitalinR("Central America");//By Phoo Pwint Thin
        ArrayList<City> TopCityinR = a.getAllTopCityinR(5, "Central America");//By Phoo Pwint Thin
        ArrayList<Country> AllPopulationCityRegion = a.getAllPopulationCityRegion();//By Phoo Pwint Thin
        
        // Display results
//        a.displayTopCityinR(TopCityinR);//By Phoo Pwint Thin
          a.displayPoupulationCityRegion(AllPopulationCityRegion);//By Phoo Pwint Thin
//        a.displayCapitalinR(capitalinR);//By Phoo Pwint Thin
        // _________________________________________ HWYL_____________________________//

        ArrayList<City> topCityinContiN = a.getAllTopcityinContiN(6, "Asia");//By HWYL
        ArrayList<Country> topcapitalinW = a.getAllTopCapitalinW(5);//By HWYl

        // Display results
        a.displayTopCapitalinContinent(topcapitalinCon);//By HWYL
//        a.displayTopCityinContiN(topCityinContiN,"topCityinContiN.md");//By HWYL
        a.displayTopCapitalinW(topcapitalinW);//By HWYL
        //-------------------------------------------Htet EIndra Wai---------------------------//

//         ArrayList<Country> couR = a.getAllRegion("Southern Europe"); // developed by Htet EIndra Wai
//         ArrayList<Country> couC = a.getAllCountryINContinent("Asia"); // developed by Htet EIndra Wai
//            ArrayList<City> citiesINR = a.getAllCityInReg("South America"); // developed by Htet EIndra Wai
//            ArrayList<City> citiesIND = a.getAllCityInDist("Noord-Holland"); // developed by Htet Eindra Wai
//            ArrayList<City> citiesINCount = a.getAllTopcityinCoun(4, "Australia");// developed by Htet Eindra Wai
//            ArrayList<City> citiesINDist = a.getAllTopcityinDist(6,"Noord-Holland"); // developed by Htet Eindra Wai
            ArrayList<Country> countryInCont = a.getAllTopCountryinCont(5,"Asia"); // developed by Htet Eindra Wai
            ArrayList<Country> TopcountryINReg = a.getAllTopCountryinReg(5,"Middle East");
        //display Results
//        a.displayCountryInReg(couR); //developed by Htet EIndra Wai
//        a.displayCountryInContinent(couC); //developed by Htet EIndra Wai
//        a.displayCityInReg(citiesINR); // developed by Htet EIndra Wai
//        a.displayCityInDIst( citiesIND); // developed by Htet Eindra Wai
//        a.displayTopCityinCoun(citiesINCount, "TopcitiesinCountry.md"); // developed by Htet Eindra Wai
//        a.displayTopCityinDist( citiesINDist,"TopcitiesinDist.md"); // developed by Htet Eindra Wai
         a.displayTopCountryinCont(countryInCont, "TopCountriesinCont.md");// developed by Htet Eindra Wai
         a.displayTopCountryinReg(TopcountryINReg, "TopcountryINReg.md");


        // Extract countries information in a region
//        ArrayList<Country> capitalinW = a.getAllCapitalinW();




//      a.displayContinent(con);
//      a.displayRegion(reg);
//      a.displayCapitalinW(capitalinW);


        /**
         * Report for city information
         */
        // Extract city information in the world
//        ArrayList<City> cit = a.getAllCity();

        // Extract city information in continent
//        ArrayList<city> cityinC = a.getAllCityContinent();
        // Extract cities information in a region
//        ArrayList<city> reg = a.getAllCityRegion("Southern Europe");
//        ArrayList<city> dist = a.getAllCitiesINDist("Noord-Brabant");
//        ArrayList<city> cityDist = a.getAllTopCityinDist(6,"Gelderland");
//        ArrayList<city> cou = a.getAllTopCityinCou(4,"Austria");
        //ArrayList<Country> CaptialinC = a.getAllCapitalinContinent("Asia"); //By HWYl
        //a.displayCapitalinContinent(CaptialinC);//By HWYL
        // Display results
//        a.displayCity(cit);



//        a.displayCityContinent(cityinC);
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

    public void displayCountry(ArrayList<Country> cou)
    {
        // Print header
        System.out.println("Reporting all the countries in the world organised by largest population to smallest\n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Continent","Region","Population", "Capital"));
        System.out.println("\n");

        // Check country is not null
        if (cou == null)
        {
            System.out.println("No country");
            return;
        }
        else if (cou.size() == 0 )
        {
            System.out.println("There is no country data");
            return;
        }
        else {
            for (Country emp : cou)
            {
                if (emp == null) continue;
                System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
                System.out.println("\n");

            }

        }
    }
    /**
     * Gets all the Capital in the world by MoeNiNiChaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllTopCapitalinContinent(int Num, String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT * FROM country, city WHERE country.Capital = city.ID and country.Continent = " + "'" + continent + "'" + " ORDER BY city.Population desc limit " + Num;
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

    public void displayTopCapitalinContinent(ArrayList<Country> world)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("All the Top capital cities in a continent organised by largest population to smallest.\n\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-20s",  "Country", "Capital","Population"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-35s %-40s %-20s",  emp.getName(), emp.getCapital_n(),emp.getPopulation()));

        }

    }
    /**
     * Gets all the Capital in the world by MoeNiNiChaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllCapitalinW()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Capital = city.ID ORDER BY city.Population desc";
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

    public void displayCapitalinW(ArrayList<Country> world)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("All the capital cities in the world organised by largest population to smallest.\n\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-20s",  "Country", "Capital","Population"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-35s %-40s %-20s",  emp.getName(), emp.getCapital_n(),emp.getPopulation()));

        }

    }

    /**
     * Gets Top city in the world by Moe Ni Ni Chaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<City> getAllTopcityinW(int Num)
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
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayTopCityinW(ArrayList<City> world)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No city");
            return;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The top N populated cities in the world where N is provided by the user. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : world)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
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

    public void displayTopCountryinW(ArrayList<Country> world)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No country");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print header
        System.out.println("Reporting The top N populated countries in the world where N is provided by the user.\n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Country","Region","Population", "Continent"));
//        sb.append("\n");

        for (Country emp : world)
        {
            System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
//            sb.append("\n");

        }
//        try {
//            new File("./reports/").mkdir();
//            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
//            writer.write(sb.toString());
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * Gets all the current city in a country by Moe Ni Ni Chaw.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllCityCountry(String cont)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT *"
                    + "FROM country, city "
                    + "WHERE country.Code= city.CountryCode AND country.Name =" + "'" + cont + "'"
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

    public void displayCityCountry(ArrayList<City> con)
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
        System.out.println("Report All the cities in a country organised by largest population to smallest. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : con)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }

    /**
     * Gets all Population in Continent by MoeNiNiChaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllPopulationCityContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT country.Continent, Sum(country.Population) as totalpopulation FROM country GROUP BY country.Continent";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();


            while (rset.next())
            {
                Country emp = new Country();

//                emp.code = rset.getString("country.Code");

                emp.setContinent(rset.getString("country.Continent"));
                emp.setPopulation_result(rset.getLong("totalpopulation"));

                // Create an SQL statement
                Statement stmt1 = con.createStatement();
                // Create string for SQL statement

                String strSelect1 = "SELECT Sum(city.Population) as totalcitypopulation FROM country, city WHERE country.Code = city.CountryCode and country.Continent = " + "'" + emp.getContinent() + "'";

                // Execute SQL statement
                ResultSet rset1 = stmt1.executeQuery(strSelect1);
                while (rset1.next())
                {
                    emp.setPopulationcity_result(rset1.getDouble("totalcitypopulation"));
                    Double result = emp.getPopulation_result() - emp.getPopulationcity_result();
                    emp.setResult(result);

                    double percent_city_population = ( emp.getPopulationcity_result()/emp.getPopulation_result()) *100;
                    emp.setPopulationcity_result(percent_city_population);

                    double percent_notcity_population = (emp.getResult()/emp.getPopulation_result())*100;

                    emp.setResult(percent_notcity_population);

                }

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

    public void displayPoupulationCityContinent(ArrayList<Country> world)
    {

        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The population of people, people living in cities, and people not living in cities in each Continent.\n\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-40s %-40s %-50s %-50s",  " Name of the continent", "Total population of the continent","Total population of the continent living in cities", "Total population of the continent not living in cities"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-40s %-40s %-50s %-50s",  emp.getContinent(), emp.getPopulation_result(),emp.getPopulationcity_result(),emp.getResult()));

        }

    }

    /**
     * Gets all Population in Continent by MoeNiNiChaw.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllPopulationinW()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT Sum(country.Population) as totalpopulation FROM country";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();

//                emp.code = rset.getString("country.Code");

                emp.setPopulation_result(rset.getLong("totalpopulation"));

                Country.add(emp);
            }
            return Country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Total population in the world");
            return null;
        }
    }

    public void displayPoupulationinW(ArrayList<Country> world)
    {


        for (Country emp : world)
        {
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println(String.format("%-40s %-40s",  "The population of the world", emp.getPopulation_result()));
            System.out.println("-----------------------------------------------------------------------------------\n");

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

    public ArrayList<City> getAllTopCityinR(int Num, String Region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and country.Region = " + "'" + Region + "'" + "ORDER BY city.Population desc limit " + Num;

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

    public void displayTopCityinR(ArrayList<City> world)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No city");
            return;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The top N populated cities in the region where N is provided by the user. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : world)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }
    /**
     * Gets all Population in region by PhooPwintThin.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllPopulationCityRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT country.Region, Sum(country.Population) as totalpopulation FROM country, city GROUP BY country.Region";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();


            while (rset.next())
            {
                Country emp = new Country();

//                emp.code = rset.getString("country.Code");

                emp.setRegion(rset.getString("country.Region"));
                emp.setPopulation_result(rset.getLong("totalpopulation"));



                // Create an SQL statement
                Statement stmt1 = con.createStatement();
                // Create string for SQL statement

                String strSelect1 = "SELECT Sum(city.Population) as totalcitypopulation FROM country, city WHERE country.Code = city.CountryCode and country.Region = " + "'" + emp.getRegion() + "'";

                // Execute SQL statement
                ResultSet rset1 = stmt1.executeQuery(strSelect1);
                while (rset1.next())
                {
                    emp.setPopulationcity_result(rset1.getDouble("totalcitypopulation"));
                    Double result = emp.getPopulation_result() - emp.getPopulationcity_result();
                    emp.setResult(result);

                    double percent_city_population = emp.getPopulationcity_result()/emp.getPopulation_result()*100;
                    emp.setPopulationcity_result(percent_city_population);

                    double percent_notcity_population = emp.getResult()/emp.getPopulation_result()*100;

                    emp.setResult(percent_notcity_population);


                }

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

    public void displayPoupulationCityRegion(ArrayList<Country> world)
    {

        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The population of people, people living in cities, and people not living in cities in each region..");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-40s %-40s %-50s %-50s",  " Name of the Region", "Total population of the Region","Total population of the Region living in cities", "Total population of the Region not living in cities"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-40s %-40s %-50s %-50s",  emp.getRegion(), emp.getPopulation_result(),emp.getPopulationcity_result(),emp.getResult()));

        }

    }




    /**
     * Gets all the countries in a Region organised by largest population to smallest by Htet Eindra Wai.
     * @return the countries in a Region organised by largest population to smallest., or null if there is an error.
     */
    public ArrayList<Country> getAllRegion(String Reg)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT * "
                    + "FROM country, city"
                    + " WHERE country.Code = city.CountryCode and Region =" + "'" + Reg + "'"
                    + " ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract list of country information in a continent
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.setCode(rset.getString("country.Code"));
                emp.setName(rset.getString("country.Name"));
                emp.setContinent(rset.getString("country.Continent")) ;
                emp.setRegion(rset.getString("country.Region"));
                emp.setPopulation(rset.getInt("country.Population"));
                emp.setCapital_n(rset.getString("city.Name"));

                Country.add(emp);



            }
            return Country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population in a region");
            return null;
        }
    }
    public void displayCountryInReg(ArrayList<Country> cou)
    {
        StringBuilder sb = new StringBuilder();

        // Check country is not null
        if (cou == null)
        {
            System.out.println("No country");
            return;
        }

        // Print header

        System.out.println("Reporting all the countries in the region organised by largest population to smallest ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Continent","Region","Population", "Capital"));

        for (Country emp : cou)
        {
            System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));

        }

    }


    /**
     * Gets all the countries in a Continent organised by largest population to smallest by Htet Eindra Wai.
     * @return the countries in a Continent organised by largest population to smallest., or null if there is an error.
     */
    public ArrayList<Country> getAllCountryINContinent(String cont)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT * "
                    + "FROM country, city"
                    + " WHERE country.Code = city.CountryCode and Continent =" + "'" + cont + "'"
                    + " ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract list of country information in a continent
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.setCode(rset.getString("country.Code"));
                emp.setName(rset.getString("country.Name"));
                emp.setContinent(rset.getString("country.Continent")) ;
                emp.setRegion(rset.getString("country.Region"));
                emp.setPopulation(rset.getInt("country.Population"));
                emp.setCapital_n(rset.getString("city.Name"));

                Country.add(emp);



            }
            return Country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population in a region");
            return null;
        }
    }
    public void displayCountryInContinent(ArrayList<Country> cou)
    {
        StringBuilder sb = new StringBuilder();

        // Check country is not null
        if (cou == null)
        {
            System.out.println("No country");
            return;
        }

        // Print header

        System.out.println("Reporting all the countries in the region organised by largest population to smallest ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Continent","Region","Population", "Capital"));

        for (Country emp : cou)
        {
            System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));

        }

    }


    /**
     * Gets all the current city in a region by Htet Eindra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllCityInReg(String reg)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT *"
                    + "FROM country, city "
                    + "WHERE country.Code= city.CountryCode AND country.Region =" + "'" + reg + "'"
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

    public void displayCityInReg(ArrayList<City> con)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("Report All the cities in a region organised by largest population to smallest. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : con)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }

    /**
     * Gets all the current city in a district by Htet Eindra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllCityInDist(String reg)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT *"
                    + "FROM country, city "
                    + "WHERE country.Code= city.CountryCode AND city.District =" + "'" + reg + "'"
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

    public void displayCityInDIst(ArrayList<City> con)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("Report All the cities in a district organised by largest population to smallest. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : con)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }

    }


    /**
     * Gets Top countries in the continent by Htet EIndra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<Country> getAllTopCountryinCont(int Num, String cont)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and Continent="+ "'"+ cont + "'"+  "ORDER BY city.Population desc limit " + Num;
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

    public void displayTopCountryinCont(ArrayList<Country> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No country");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print header
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println("Reporting The top N populated countries in the continent where N is provided by the user.\n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Continent","Region","Population", "Capital"));
//        sb.append("\n");

        for (Country emp : world)
        {
            System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
//            sb.append("\n");

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
     * The top N populated countries in a region where N is provided by the user by Htet Eindra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<Country> getAllTopCountryinReg(int Num, String reg)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and Region ="+ "'"+ reg + "'"+  "ORDER BY city.Population desc limit " + Num;
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

    public void displayTopCountryinReg(ArrayList<Country> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No country");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print header
        System.out.println("Reporting The top N populated countries in a region where N is provided by the user.\n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s", "Code", "Name", "Continent","Region","Population", "Capital"));
//        sb.append("\n");

        for (Country emp : world)
        {
            System.out.println(String.format("%-10s %-40s %-15s %-35s %-20s %-8s",  emp.getCode(), emp.getName(), emp.getContinent(),emp.getRegion(),emp.getPopulation(), emp.getCapital_n()));
//            sb.append("\n");

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
     * The top N populated cities in a country where N is provided by the user by Htet Eindra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllTopcityinCoun(int Num, String Cou)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and country.Name= "+ "'"+ Cou + "'"+ "ORDER BY city.Population desc limit " + Num;
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
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayTopCityinCoun(ArrayList<City> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No city");
            return;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The top N populated cities in a country where N is provided by the user. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : world)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }
    }


    /**
     * The top N populated cities in a district where N is provided by the user by Htet Eindra Wai.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllTopcityinDist(int Num, String dist)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and city.District= "+ "'"+ dist + "'"+ "ORDER BY city.Population desc limit " + Num;
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
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayTopCityinDist(ArrayList<City> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No city");
            return;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The top N populated cities in a district where N is provided by the user. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : world)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }
    }

    /**
     * The top N populated cities in a continent where N is provided by the user by HWYL.
     * @return A list of all city, or null if there is an error.
     */

    public ArrayList<City> getAllTopcityinContiN(int Num, String ContiN)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM country, city WHERE country.Code = city.CountryCode and country.Continent = " + "'" + ContiN + "'" + "ORDER BY city.Population desc limit " + Num;
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
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayTopCityinContiN(ArrayList<City> world, String filename)
    {
        // Check country is not null
        if (world == null)
        {
            System.out.println("No city");
            return;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("The top N populated cities in a Continent where N is provided by the user. \n ");
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-35s %-20s",  "Name", "Country","District","Population"));
        for (City emp : world)
        {

            System.out.println(String.format("%-35s %-40s %-35s %-20s",  emp.getCityName(), emp.getCoName(),emp.getDistrict(),emp.getPopulation()));
        }
    }
    /**
     * Gets all the Capital cities in the world by HWYL.
     * @return A list of all city, or null if there is an error.
     */
    public ArrayList<Country> getAllTopCapitalinW(int Num)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect = "SELECT * FROM country, city WHERE country.Capital = city.ID ORDER BY city.Population desc limit " + Num;
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

    public void displayTopCapitalinW(ArrayList<Country> world)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("All the Top capital cities in a world organised by largest population to smallest.\n\n");
        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println(String.format("%-35s %-40s %-20s",  "Country", "Capital","Population"));
        for (Country emp : world)
        {
            System.out.println(String.format("%-35s %-40s %-20s",  emp.getName(), emp.getCapital_n(),emp.getPopulation()));

        }

    }


    // ------------------------ ending of Phoo Pwint Thin's Features____________________________


}
