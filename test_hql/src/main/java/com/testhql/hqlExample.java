package com.testhql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.emp;

public class hqlExample {
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		
		//Unique List 
		
	//for single result 	q.unique();
		
		
		
		// Multiple List 
		
		//this Query to fine all emp list
		
		// String query="from emp where city='varanasi':
		String query="from emp";
		
		Query<emp> q=session.createQuery(query);
		
	
		List<emp> list=q.list();
		
		for(emp emp:list) {
			
			System.out.println(emp.getEmpname());
			
		}
		
		
		
		
		
		
		
		session.close();
		factory.close();
		
		
	}

}
