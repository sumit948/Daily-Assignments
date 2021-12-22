package com.program2.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample2 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conncetion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sampledbforjdbc2",    
                    "postgres","Sumitraj");
			Statement st=conncetion.createStatement();
			//boolean status =st.execute("create table author(authorid int, authorname varchar(20), address text, authorcity varchar(20), authorstate varchar(20));");
//			st.executeUpdate("insert into author values(001,'Jhon Weak', 'New palace', 'Kolhapur', 'india'),"
//            		+ "(002,'Jerry', 'New castal', 'DC', 'London'),"
//            		+ "(003,'Wong lee', 'Brooklyn','BN', 'United'),"
//            		+ "(004,'Cristano Ronaldo', '1 A', 'portugeas', 'portugal');");

			//st.execute("update author set authorcity='Byren' where authorid =1;");
			
			//st.execute("delete from author where authorid=1;");
            
			//ResultSet resultset=st.executeQuery("select * from author;");
			
			System.out.println("Query has been executes Successfully");
            st.close();
            conncetion.close();
		}
		catch(Exception e) {
			System.out.println("Error");		}

	}

}
