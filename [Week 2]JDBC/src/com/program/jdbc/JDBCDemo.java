package com.program.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
        try{ 
            // Loading JDBC Driver into memory
            Class.forName("org.postgresql.Driver"); 
            
            // Creating Connection
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sampledbforjdbc",    
                    "postgres","Sumitraj");  
            
            //here sampledb is database name, root is username and password  
            Statement stmt=con.createStatement();  
            DatabaseMetaData dm= con.getMetaData();
            System.out.println("This is database meta data: "+dm);
            // SQL statement execution
            //boolean status =stmt.execute("create table person(pid int, pname varchar(20), phone text);");
            stmt.executeUpdate("insert into person values(001,'Jhon Weak', '9128001214'),"
            		+ "(002,'Tony Jaa', '9122001214'),"
            		+ "(003,'Wong lee', '9123001214'),"
            		+ "(004,'Cristano Ronaldo', '9124001214');");
            //boolean status = stmt.execute("update person set pname='Jhon Weak' where pid =2;");
            //boolean status =stmt.execute("delete from person where pid=1;");

            ResultSet resultset=stmt.executeQuery("select * from person;");
            while(resultset.next()) {
                System.out.println("Name: "+resultset.getString("pname"));
            }

            System.out.println("Query has been executes Successfully");
            stmt.close();
            con.close();
        
        	}
        		catch (Exception e) { // Handling Exception in case of Exception
        		System.out.println("Something went wrong "+e);

        }

	}

}
