package spring.Proj;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student s1=(Student)factory.getBean("studentbean");
		System.out.println(s1.getSid()+"\t"+s1.getSname());
		
		Address a1=s1.getSaddress();
		System.out.println(a1.getAid()+"\t"+a1.getCity()+"\t"+a1.getPincode());
		
	}

}
