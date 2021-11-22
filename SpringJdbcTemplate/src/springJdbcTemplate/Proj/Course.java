package springJdbcTemplate.Proj;

public class Course 
{
	private String coursecode;
	private String coursename;
	private float coursefees;
	
	public Course()
	{
		
	}

	public Course(String coursecode, String coursename, float coursefees) {
		super();
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.coursefees = coursefees;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public float getCoursefees() {
		return coursefees;
	}
	
	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}

}
