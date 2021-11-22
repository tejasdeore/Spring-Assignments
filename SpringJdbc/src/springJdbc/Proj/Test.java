package springJdbc.Proj;

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
	
	public Test()
	{
	resource=new ClassPathResource("applicationContext.xml");	
	factory=new XmlBeanFactory(resource);
	sc=new Scanner(System.in);
	
	}
	
	public void insert() throws SQLException 
	{
		System.out.println("Enter course Code");
		String coursecode=sc.nextLine();
		System.out.println("Enter course Name");
		String coursename=sc.nextLine();
		System.out.println("Enter course Fees");
		float coursefees=sc.nextFloat();
		
		Course course=(Course)factory.getBean("coursebean");
		course.setCoursecode(coursecode);
		course.setCoursename(coursename);
		course.setCoursefees(coursefees);
		
		CourseDAO courseDao=new CourseDAO();
		String str=courseDao.addCourse(course);
		System.out.println(str);
	}
	
	
	public void delete() 
	{
		
	}
	
	public void update() 
	{
		
	}
	
	public void select() throws SQLException 
	{
		CourseDAO courseDao =new CourseDAO();
		
		System.out.println(courseDao.showCourses());
	}
	
	
	
	public static void main(String[] args) throws SQLException
	{
		Test t1=new Test();
		
			t1.insert();
			t1.select();
		

	}

}
