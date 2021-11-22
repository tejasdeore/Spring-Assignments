package springJdbc.Proj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {

	public String addCourse(Course course) throws SQLException 
	{
		String sql="insert into course values (?,?,?)";
		
		PreparedStatement pst=new DbAdapter().dbConnect().prepareStatement(sql);
		pst.setString(1,course.getCoursecode());
		pst.setString(2,course.getCoursename());
		pst.setFloat(3,course.getCoursefees());
		
		int i=pst.executeUpdate();
		if(i>0)
			return"success";
		else
			return"Error";
				
	}

	public String showCourses() throws SQLException 
	{
		String sql="select * from course";
		PreparedStatement pst=new DbAdapter().dbConnect().prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		rs.close();
		return"success";
	}
}

