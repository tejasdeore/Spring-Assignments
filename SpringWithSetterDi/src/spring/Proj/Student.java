package spring.Proj;

public class Student 
{
	private int sid;
	private String sname;
	private Address saddress;
	
	public Student() 
	{
		
	}

	public Student(int sid, String sname, Address saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getSaddress() {
		return saddress;
	}

	public void setSaddress(Address saddress) {
		this.saddress = saddress;
	}
	
	
}
