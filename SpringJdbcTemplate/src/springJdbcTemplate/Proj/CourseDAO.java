package springJdbcTemplate.Proj;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;


public class CourseDAO {
		
		Scanner sc=new Scanner(System.in);
		private JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}


		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}


	public String addCourse(Course course)
	{
	
		String coursecode=course.getCoursecode();
		String coursename=course.getCoursename();
		float coursefees=course.getCoursefees();
		
		String sql="insert into course value('"+coursecode+"','"+coursename+"',"+coursefees+")";
		int i=jdbcTemplate.update(sql);
		if(i>0)
			return"success";
		else
			return"Error";
				
	}
	
	public String deleteCourse(Course course)
	{
		String coursecode=course.getCoursecode();
		String sql="delete from course where coursecode='"+coursecode+"'";
		int i=jdbcTemplate.update(sql);
		if(i>0)
			return"success";
		else
			return"Error";
			
		
	}
	
	
	  public String updateCourse(Course course) 
	  {
		  
		  String coursecode=course.getCoursecode();
		  String coursename=course.getCoursename();
		  float coursefees=course.getCoursefees();
		  
		  String sql="update course set coursename='"+coursename+"',coursefees='"+coursefees+"' where coursecode='"+coursecode+"'";
			int i=jdbcTemplate.update(sql);
			if(i>0)
				return"success";
			else
				return"Error";
				
		
	  
	  }
	  
	  
		  	public String showCourse(Course course) 
		  { 
		  		String sql="select * from course";
		  		
		 List<Map<String,Object>>courselist=jdbcTemplate.queryForList(sql);
		 Iterator<Map<String ,Object>>i1=courselist.iterator();
		 
		 while(i1.hasNext()) 
		 {
			 Map<String ,Object>map=i1.next();	 
			 Set<String> set=map.keySet();
				Iterator<String> i2=set.iterator();
				while(i2.hasNext())
					{
						String columnname=i2.next();
						Object columnvalue=map.get(columnname);
						System.out.print(columnname+"\t"+columnvalue);
						System.out.println(columnname+"\t"+columnvalue);
					}
				System.out.println("*******************************");


		  }
		 return"success";
		}
		  	
}
	 


