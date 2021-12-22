package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // Session Factory is Thread Safe Object and can live in the memory for long without any negative effect
         Session session= factory.openSession();
        // Session is not Thread Safe Object and can not live in the memory for long
         Transaction tx= session.beginTransaction();
         // Process to execute the Query         
         MobilePhone mp1=new MobilePhone();
         mp1.setPhoneNumber("34343455645");
         mp1.setPhoneName("Apple 6s");;
         MobilePhone p2=new MobilePhone();
         p2.setPhoneNumber("355645");
         p2.setPhoneName("Apple 7");
         List<MobilePhone> phones = new ArrayList<MobilePhone>();
         phones.add(p2);
         phones.add(mp1);
         Employee emp=new Employee();
         emp.setEmployeeId(001);
         emp.setEmpName("DJhon");
         emp.setEmpContact(9168000);
         emp.setEmpAddress("Kolhapur");
         emp.setMp(phones);
         session.save(mp1);
         session.save(p2);
         session.save(emp);
         tx.commit();  // Saving Object Permanently ans closing session
         factory.close(); // closing very expensive connection

	}

}
