package com.program.hibernateformobile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MobilePhoneTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
		MobilePhone mp = new MobilePhone();
		mp.setMobileID("001");
		mp.setMobileName("Apple 6s");
		mp.setMobileVersion("IOS 15");
		mp.setMobilePrise(26000.00);
		s1.save(mp);
		tx.commit();
		sf.close();
	}

}
