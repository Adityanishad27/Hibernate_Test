package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	
    	
    	Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		 org.hibernate.Transaction tx= session.beginTransaction();
		 
		
	
	emp e1= new emp(11,"Amit", "jaunpur");
	emp e2=new emp(22, "Aditya","Varanasi");
	emp e3= new emp(33, "Ashish", "Kanpur");
	emp e4= new emp(44, "Babban", "jaunpur");
	emp e5= new emp(55, "Aryan", "jaunpur");
	emp e6= new emp(66, "Mayank", "varanasi");
	emp e7= new emp(77, "Himanshu", "varanasi");
	emp e8= new emp(88, "varun", "chaubeypur");
	emp e9= new emp(99, "Harsh", "new Delhi");
	emp e10= new emp(111, "Kallu", "chaubeypur");
	emp e11= new emp(112, "utkarsh", "jaunpur");
	emp e12= new emp(113, "prashant", "varanasi");
	emp e13= new emp(114, "abhijeet", "delhi");
	
	
	
	session.save(e7);
	session.save(e8);
	session.save(e9);
	session.save(e10);
	session.save(e11);
	session.save(e12);
	session.save(e13);
		
	session.save(e4);	
	session.save(e5);
	session.save(e6);
session.save(e3);
session.save(e2);
session.save(e1);
		tx.commit();
	
		session.close();
		factory.close();
    	
    	
    
    }
}
