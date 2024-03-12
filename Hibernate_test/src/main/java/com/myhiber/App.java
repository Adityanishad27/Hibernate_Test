package com.myhiber;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello Starting programme........." );
        
        // Hibernate Configuration & Session factory
        
        
        		Configuration cfg= new Configuration();
        		cfg.configure("hibernate.cfg.xml");
        		SessionFactory factory= cfg.buildSessionFactory();
        		
        		System.out.println(factory);
        		System.out.println(factory.isClosed());
        		
        		//creating students
        		Students student1= new Students();
        		student1.setId(022);
        		student1.setName("baban Nishad ");
        		student1.setCity("Jaunpur");
        		
        		
        		//creating students2
        		
        		Students student2=new Students();
        		student1.setId(032);
        		student1.setName("Aditya Nishad ");
        		student1.setCity("varanasi");
        		
        		
        		
        		
        		
        		// Creating Address 
        		
        		
        		Address address= new Address();
        		address.setAddressid(2024);
        		address.setCity("Kashi");
        		address.setStreet("Navghat Kerakat ");
        		address.setX(22.33);  // This address not save in database because we use @Transient Annotation in this variable at Address class
        		address.setIsopen(true);
        		
        		
        		//address.setAddeddate(new java.sql.Date(0, 0, 0));
        		
        		
        	// Added image to Upload in database
        		
       /* 		
        	 FileInputStream file = new FileInputStream("src/main/java/test.png") ;
					byte[] data= new byte[file.available()];
    		        file.read(data);
    	        	address.setImage(data);
				
		*/
       		Session session = factory.openSession();
        		 
        org.hibernate.Transaction tx= session.beginTransaction();
        		 
        	 session.save(student1);
        	 
        	 session.save(student2);
        	 
        	 session.save(address);
        		 
        	tx.commit();
        		 
        	 session.close();
        			
    }
}
