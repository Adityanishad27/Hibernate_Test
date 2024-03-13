package com.NativeQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hql.emp;


public class nativeSQL {

	public static void main(String[] args) {
		
		
    	Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		
		
		
		String query="Select * from emp";
		NativeQuery nq=session.createSQLQuery(query);
		
		
		List<Object[]> list=nq.list();
		
		for(Object[] emp:list) {
			
			
			
			System.out.println(Arrays.deepToString(emp));
			
			
		//	System.out.println(emp[3] +" " +emp[2] +" " + emp[1]);
			
			
			
		}
		
		

		
		 
		
		
	
session.close();
factory.close();
	}

}
