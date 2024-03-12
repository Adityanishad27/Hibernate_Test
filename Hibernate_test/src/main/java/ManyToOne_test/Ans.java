package ManyToOne_test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ans {
	
	
		@Id
		@Column(name="ans_id")
		private int ansid;
		
		private String Ans;
		
		@OneToOne     //@OneToOne (mappedby="Answer")   show in only any one table
		private Que  que;

		public int getAnsid() {
			return ansid;
		}

		public void setAnsid(int ansid) {
			this.ansid = ansid;
		}

		public String getAns() {
			return Ans;
		}

		public void setAns(String ans) {
			Ans = ans;
		}

		public Que getQue() {
			return que;
		}

		public void setQue(Que que) {
			this.que = que;
		}

		public Ans() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Ans(int ansid, String ans, Que que) {
			super();
			this.ansid = ansid;
			Ans = ans;
			this.que = que;
		}
		
		
		
		
		

}
