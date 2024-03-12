package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	
	private String ename;
	@ManyToMany
	private List<projects> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<projects> getProjects() {
		return projects;
	}

	public void setProjects(List<projects> projects) {
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, List<projects> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}
	
	
	

}
