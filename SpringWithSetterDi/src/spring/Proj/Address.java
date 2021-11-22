package spring.Proj;

public class Address 
{
	private int aid;
	private String city;
	private long pincode;
	
	public Address() {
		
	}

	public Address(int aid, String city, long pincode) {
		super();
		this.aid = aid;
		this.city = city;
		this.pincode = pincode;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	
}
