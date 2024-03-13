package com.testhql;

import java.util.List;

import javax.security.auth.x500.X500Principal;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.emp;

public class hqlQuery {
	public static void main(String[] args) {
		
	
	
	Configuration cfg= new Configuration();
	cfg.configure("hql.cfg.xml");
	
	SessionFactory factory= cfg.buildSessionFactory();
	Session session=factory.openSession();
	org.hibernate.Transaction tx=session.beginTransaction();
	
	
	//Unique List 
	
//for single result 	q.unique();
	
	
	
	// Multiple List 
	
	//this Query to fine all emp list
	
	// String query="from emp as e where c.city=:x: and e.name=:n";
	
	//String query="from emp";
	
	
	
	String query=" from emp as e where e.empcity=:x and e.empname=:n";
	
	Query q=session.createQuery(query);
	
	//setting parameter to empcity and epmname 
	q.setParameter("x","jaunpur");
	q.setParameter("n","Aryan" );
	
	
	
	
System.out.println("______________________________________________________________");


//  +++++++++++  delete Query  ++++++++++++

/*

  String query2="delete from emp e where e.empname=:n  ";
  Query  q2=session.createQuery(query2);
  
  
  q2.setParameter("n","Aryan");
  
  int r=q2.executeUpdate();
  
  System.out.println("Deleted");
  
  System.out.println(r);
  
  
  */

//+++++++++++++++++  UPDATE QUERY  ++++++++++++++++++++++++

/*
String query3="update  emp set  empcity=:c  where empname=:n ";

Query q3=session.createQuery(query3);

q3.setParameter("c","Delhi");
q3.setParameter("n","Aditya");

int r1=q3.executeUpdate();



System.out.println(r1 +"Object Updated ");



*/




  
  
  
  
















	
	
	List<emp> list=q.list();
	
	for(emp emp:list) {
		
		System.out.println(emp.getEmpname() +" "+ emp.getEmpcity());
		
	}
	
	tx.commit();
	session.close();
	factory.close();
	

	}
}
