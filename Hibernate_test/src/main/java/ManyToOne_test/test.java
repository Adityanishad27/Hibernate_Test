package ManyToOne_test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		//set question and question_Id
		Que que1= new Que();
		
		//question id
		que1.setQueid(292);
		
		//Question
		que1.setQue(" What is Java ?");
		
		
		//set answer and answer_id
		
		Ans ans1= new Ans();
		ans1.setAnsid(292);
		ans1.setAns("java is open source high level programming language ");
		ans1.setQue(que1);
		
		
		Ans ans2= new Ans();
		ans2.setAnsid(0032);
		ans2.setAns("java is open source high level programming language ");
		ans2.setQue(que1);
		
		
		Ans ans3= new Ans();
		ans3.setAnsid(00333);
		ans3.setAns("java is open source high level programming language ");
		ans3.setQue(que1);
		
		
		
		
		List<Ans> list= new ArrayList<>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		que1.setAns(list);
		
		
		// Answer 
		
		//que1.setAnswer(ans1);
		
		
	/*	
		
		// setting question answers through constructor 
		Answer ans2=new Answer(006,"Application Programming Interface");
		
		
		
		Question que2= new Question(306,"Full form of API ?" ,ans2);
		
		
		*/
		
	
		
	
		
	
	
		
		Session session= factory.openSession();
		
		 org.hibernate.Transaction tx= session.beginTransaction();
		 
		// save 
		session.save(que1);
		
		
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		session.save(list);
		
		tx.commit();
		
		
		// Fetching database  
		
//	Question Q1=session.get(Question.class, 304);
//	System.out.println(Q1.getQuestion());
//	System.out.println(Q1.getAnswer().getAnswer());
	
		
		session.close();
		
		factory.close();
		

	}

}
