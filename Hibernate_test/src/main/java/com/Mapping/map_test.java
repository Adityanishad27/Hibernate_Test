package com.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class map_test {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		//set question and question_Id
		Question que1= new Question();
		
		//question id
		que1.setQuestionid(302);
		
		//Question
		que1.setQuestion(" What is Java ?");
		
		
		//set answer and answer_id
		
		Answer ans1= new Answer();
		ans1.setAnswerid(003);
		ans1.setAnswer("java is open source high level programming language ");
		ans1.setQuestion(que1);
		
		// Answer 
		
		que1.setAnswer(ans1);
		
		
	/*	
		
		// setting question answers through constructor 
		Answer ans2=new Answer(006,"Application Programming Interface");
		
		
		
		Question que2= new Question(306,"Full form of API ?" ,ans2);
		
		
		*/
		
		Question que2= new Question();
		que2.setQuestionid(304);
		que2.setQuestion("What is API");
		
		
		Answer ans2= new Answer();
		 ans2.setAnswerid(104);
		  ans2.setAnswer("API is Application pragramming Interface ");
		  ans2.setQuestion(que2);
		
	que2.setAnswer(ans2);
		
	
		
		Session session= factory.openSession();
		
		 org.hibernate.Transaction tx= session.beginTransaction();
		 
		// save 
		session.save(que1);
		session.save(que2);
		
		session.save(ans1);
		session.save(ans2);
		
		tx.commit();
		
		
		// Fetching database  
		
	Question Q1=session.get(Question.class, 304);
	System.out.println(Q1.getQuestion());
	System.out.println(Q1.getAnswer().getAnswer());
	
		
		session.close();
		
		factory.close();
		

	}

}
