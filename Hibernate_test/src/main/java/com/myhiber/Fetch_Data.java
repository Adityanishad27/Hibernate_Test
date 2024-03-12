package com.myhiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class Fetch_Data {
	public static void main(String[] args) {
		
		//Using Get and Load to fetch the data in database

		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		//Get student in database by id
		Students  students=(Students)session.get(Students.class,18);
		
		System.out.println(students);

		session.close();
		factory.close();
	}
}
	          
	