package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class projects {
	
	@Id
	private int pid;
	@Column(name="project_name")
	private String pname;
	@ManyToMany
	private List<Employee> Employee;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}

	public projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public projects(int pid, String pname, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		Employee = employee;
	}
	
	
	
	

}
