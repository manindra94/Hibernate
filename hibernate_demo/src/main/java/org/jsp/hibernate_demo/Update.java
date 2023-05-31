//CODE TO SAVE OR UPDATE RECORD USING SESSION INTERFACE

package org.jsp.hibernate_demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ID Update:");
		int id = sc.nextInt();
		System.out.println("Enter the name,phone,age and password");
		String name = sc.next();
		long phone = sc.nextLong();
		int age = sc.nextInt();
		String password = sc.next();
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setPassword(password);
		u.setPhone(phone);
		u.setAge(age);
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.saveOrUpdate(u);
		Transaction t = session.beginTransaction();
		t.commit();
		session.close();
		sc.close();
	}
}
//SAVE OR UPDATE(Object Object):
//THIS METHOD IS PRESENT IN SESSION INTERFACE.
//-> IF THE INSTANCE IS ALREADY SAVE THEN IT WILL UPDATE THE STATE OF AN INSTANCE.
//->IF WE PASS A NEW INSTANCE THEN IT WILL SAVE THE INSTANCE IN THE TABLE.