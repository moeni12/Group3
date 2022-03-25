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

        // Connect to database
        a.connect("db:3306", 30000);
        // Get Employee
        System.out.println("Never say Never !!!!");
        // Extract employee salary information
        ArrayList<country> cou = a.getAllCountry();
        ArrayList<continent> con = a.getAllContinent();


        // Display results
        a.displayCountry(cou,"report1.md");
        a.displayContinent(con);

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

//    public country getCountry(String ID)
//    {
//        try
//        {
//            // Create an SQL statement
//            Statement stmt = con.createStatement();
//            // Create string for SQL statement
//            String strSelect =
//                    "SELECT Code, Name "
//                            + "FROM country ";
//
//            // Execute SQL statement
//            ResultSet rset = stmt.executeQuery(strSelect);
//            // Return new employee if valid.
//            // Check one is returned
//            if (rset.next())
//            {
//                country emp = new country();
//                emp.code = rset.getString("Code");
//                emp.name = rset.getString("Name");
//                return emp;
//            }
//            else
//                return null;
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            System.out.println("Failed to get employee details");
//            return null;
//        }
//    }

    /**
     * Gets all the current employees and salaries.
     * @return A list of all employees and salaries, or null if there is an error.
     */
    public ArrayList<country> getAllCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "select * from country order by Population desc;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<country> country = new ArrayList<country>();
            while (rset.next())
            {
                country emp = new country();
                emp.code = rset.getString("country.code");
                emp.name = rset.getString("country.name");
                emp.continent = rset.getString("country.continent");
                emp.region = rset.getString("country.region");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get salary details");
            return null;
        }
    }

    public void displayCountry(ArrayList<country> cou, String filename)
    {
        StringBuilder sb = new StringBuilder();
        for (country emp : cou)
        {
            sb.append(
                    emp.code + " "
                            + emp.name + " "
                            + "\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(".//reports//" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets all the countries in a continent organised by largest population to smallest.
     * @return the countries in a continent organised by largest population to smallest., or null if there is an error.
     */
    public ArrayList<continent> getAllContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String cont = "North America";
            String strSelect = "SELECT * "
                    + "FROM country "
                    + " WHERE Continent =" + "'" + cont + "'"
                    + " ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<continent> continent = new ArrayList<continent>();
            while (rset.next())
            {
                continent emp = new continent();
                emp.code = rset.getString("country.code");              emp.name = rset.getString("country.name");
                emp.continent = rset.getString("country.continent");
                emp.region = rset.getString("country.region");
                emp.population = rset.getInt("country.population");
               continent.add(emp);




            }
            return continent;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population in continent");
            return null;
        }
    }
    public void displayContinent(ArrayList<continent> con)
    {
        StringBuilder sb = new StringBuilder();
       System.out.printIn("All the countries in a continent organised by largest population to smallest.")
        for (continent emp : con)
        {
            System.out.println
                    (
                    emp.code + " "
                            + emp.name + " " + emp.population
                            + "\n");

        }
//        try {
//            new File("./reports/").mkdir();
//            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(".//reports//" + filename)));
//            writer.write(sb.toString());
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}