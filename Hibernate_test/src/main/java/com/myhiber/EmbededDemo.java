package com.myhiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbededDemo {
	public static void main(String[] args) {

		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		
		
		//creating Student1
		Students stud1= new Students();
		stud1.setId(10121);
		stud1.setName("Aditya Nishad");
		stud1.setCity("CertificateNagar jaunpur");
		
		//creating student2
		Students stud2= new Students();
		stud2.setId(1012332);
		stud2.setName("Aditya N");
		stud2.setCity("CertificateNagar kashi");
	
	
		
		
		//  creating certificate1
		Certificate certificate= new Certificate();
		certificate.setCourse("Master Of Computer Application (MCA)");
		certificate.setDuration("2 Years");
		
		//create certificate 2
		Certificate certificate1= new Certificate();
		certificate1.setCourse("Bachelor Of Computer Application (BCA)");
		certificate1.setDuration("3 Years");
		
		
		
		
       //certificate1 set
		stud1.setCerti(certificate);
		
		// certificate2 set 
		stud2.setCerti(certificate1);
		
		
		
		
		
		
		
		Session session= factory.openSession();
		
		 org.hibernate.Transaction tx= session.beginTransaction();
		 
		 
		 session.save(stud1);
		 session.save(stud2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
