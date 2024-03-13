 package com.hibernateCACHE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.emp;


public class SecondLevelCache {
	
	

	public static void main(String[] args) {
		/* second level cache ke liye hibernate cache and ehcache ki maven dependecy add karni hogi
		
		@Entity
		@Cachebale
		@cache(usage=cacheconcurrency.readonly)
		
		//first level caching me ye sab co figuration nahi karna hota hai 
		
		readonly ki jagah readandwrite and update ye sab kar sakte 
		
		class ke upar set karna hoega configuartion
		
		
		*/
		

    	Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session1= factory.openSession();
		//session first 
		
		emp emp11=  session1.get(emp.class,22);
	
		System.out.println(emp11);
		
		session1.close();
		
		
		Session session2=factory.openSession();
		//session second 
		emp emp22= session2.get(emp.class,22);
		
		System.out.println(emp22);
		
		session2.close();
		
		
		
		
		

	}

}
