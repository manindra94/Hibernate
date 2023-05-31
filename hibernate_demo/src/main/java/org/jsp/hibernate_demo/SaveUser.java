package org.jsp.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		User u = new User();
		u.setName("Prince");
		u.setPhone(4585l);
		u.setAge(56);
		u.setPassword("abc@123");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		s.save(u);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("user id saved   " + u.getId());

	}

}