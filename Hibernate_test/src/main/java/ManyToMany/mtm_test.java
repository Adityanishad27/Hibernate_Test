package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mtm_test {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		//setting id and name for Employee1
		emp1.setEid(33);
		emp1.setEname("Aditya");
		
		//setting id and name for Employee2
		emp2.setEid(34);
		emp2.setEname("Amit");
		
		
		
		projects p1= new projects();
		projects p2 = new projects();
		
		
		//setting project id and name
		
		
		p1.setPid(210);
		p1.setPname("Library Management System");
		
		
		
		p2.setPid(211);
		p2.setPname("Hotel Management System");
		
		
		List<Employee> emplist= new ArrayList<>();
		List<projects>  projlist= new ArrayList<>();
		
		
		emplist.add(emp1);
		emplist.add(emp2);
		
		
		
		projlist.add(p1);
		projlist.add(p2);
		
		
		emp1.setProjects(projlist);
		
		p2.setEmployee(emplist);
		
		
	 	

		
		Session session= factory.openSession();
		
		 org.hibernate.Transaction tx= session.beginTransaction();
		 
		session.save(emp1);
		session.save(emp2);
		
		session.save(p1);
		session.save(p2);
		
		 
		 tx.commit();
			session.close();
			
			factory.close();
			
		
		
	}

}
