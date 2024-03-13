package com.hibernateCACHE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.emp;

public class FirstLevelCache {

	public static void main(String[] args) {
		
		//First Level Caching is always Default  ,, no need to any configuration
		
    
		
		
    	Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		// when we hit Query first time... Query saved in cache memory 
		
		emp e=session.get(emp.class, 22);
		
		System.out.println(e.getEmpname());
		
		
		System.out.println("Working Something.............");
		
		
		// same Query  hit second time  and hibernate check Query in hibernate session and found this Query... So can't hit again in databas
		// for more explanation run programe and check console
		emp e1=session.get(emp.class, 22);
		System.out.println(e1.getEmpname());
		
		
		
		
		
		session.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
