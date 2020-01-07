package beans;

import java.util.List;

public class Employee {
	private int empid;
	private String empname;
	private List<String> skills;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void start(){
		System.out.println("start");
	}
	
	public void destroy(){
		System.out.println("stop");
	}
}
