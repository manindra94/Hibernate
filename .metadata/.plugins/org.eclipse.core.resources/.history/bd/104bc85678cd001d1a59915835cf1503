package org.jsp.hibernate_demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Fetch_User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID to print the details");
		int id=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		User u=s.find(User.class, id);
		System.out.println(u);
		if(u!=null) {
			System.out.println("User Found");
			System.out.println("ID: "+u.getId());
			System.out.println("name: "+u.getName());
			System.out.println("Age: "+u.getAge());
			System.out.println("Phone: "+u.getPhone());
		}
		else
		{
			System.err.println("Invalid ID");
		}
		sc.close();
	}
	

}
