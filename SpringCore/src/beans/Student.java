package beans;

public class Student {
	private int regno;
	private String stdname;
	private Address address;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int regno, String stdname) {
		super();
		this.regno = regno;
		this.stdname = stdname;
	}
	
}
