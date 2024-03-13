package com.testhql;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.emp;

public class pegination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    	Configuration cfg= new Configuration();
		cfg.configure("hql.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		Query query=session.createQuery("from emp");
		
		// value nikalega 0 se 7 tak table se page me  It is called Pegination
		
		
		//start
		query.setFirstResult(0);
		
		//end 
		query.setMaxResults(7);
		
	List<emp> list =query.list();
		
		for(emp e:list) {
			System.out.println(e.getEmpid() +"  "+e.getEmpname()+"  "+ e.getEmpcity());
			
		}
		
		
		
		
		
		session.close();
		factory.close();
	}

}
