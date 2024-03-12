package ManyToOne_test;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Que {

	@Id
	@Column(name = "que_id")
	private int queid;
	private String Que;

	@OneToMany(mappedBy = "Que", fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	/*cascade type all table le related entities ko save kar deta hai hai
	 * 
	 *jaise qiestions ke saath answers ke bhi entities bhi add kar dega 
	
	*/
	// fetch type eager karne par question ke saath answer bhi load kar dega .. aur lazy use karne par jab need hoegi tabhi karega 
	private List<Ans> ans;

	public int getQueid() {
		return queid;
	}
	public void setQueid(int queid) {
		this.queid = queid;
	}

	public String getQue() {
		return Que;
	}

	public void setQue(String que) {
		Que = que;
	}

	public List<Ans> getAns() {
		return ans;
	}

	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}

	public Que(int queid, String que, List<Ans> ans) {
		super();
		this.queid = queid;
		Que = que;
		this.ans = ans;
	}

	public Que() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
