package springJdbcTemplate.Proj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	static Scanner sc;
	Resource resource;
	BeanFactory factory;
	CourseDAO courseDao;
	Course course;
	
	public Test()
	{
	resource=new ClassPathResource("applicationContext.xml");	
	factory=new XmlBeanFactory(resource);
	sc=new Scanner(System.in);
	course=(Course)factory.getBean("coursebean");

	}
	
	public void insert() 
	{
		System.out.println("Enter course Code");
		String coursecode=sc.nextLine();
		System.out.println("Enter course Name");
		String coursename=sc.nextLine();
		System.out.println("Enter course Fees");
		float coursefees=sc.nextFloat();
		
		course.setCoursecode(coursecode);
		course.setCoursename(coursename);
		course.setCoursefees(coursefees);
		
		
		CourseDAO courseDao=(CourseDAO)factory.getBean("courseDAO");
		
		String str=courseDao.addCourse(course);
		System.out.println(str);
	}
	
	
	  public void delete() {
		  System.out.println("Enter course code to delete course");
		  String coursecode=sc.next();
			
			course.setCoursecode(coursecode);
			
			CourseDAO courseDao=(CourseDAO)factory.getBean("courseDAO");
	   System.out.println(courseDao.deleteCourse(course));
	  }
	  
		
		  public void update()
		  {
			  System.out.println("Enter course code ");
			  String coursecode=sc.next();
			  System.out.println("Enter course name to update ");
			  String coursename=sc.next();
			  System.out.println("Enter course fees to update");
			  float coursefees=sc.nextFloat();
			  
			  	course.setCoursecode(coursecode);
				course.setCoursename(coursename);
				course.setCoursefees(coursefees);
				
				
				CourseDAO courseDao=(CourseDAO)factory.getBean("courseDAO");
				
				
				System.out.println(courseDao.updateCourse(course));
				
		  }
		 
	
	
	  public void select() {
		  
		 
	  
			CourseDAO courseDao=(CourseDAO)factory.getBean("courseDAO");

	  System.out.println(courseDao.showCourse(course)); }
	  
	 
	
	public static void main(String[] args) 
	{
		Test t1=new Test();
		t1.insert();
		t1.update();
		t1.delete();
		t1.select();
		

	}

}
