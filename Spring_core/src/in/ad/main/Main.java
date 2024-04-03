package in.ad.main;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.ap.beeans.Student;

public class Main {
 public static void main(String[]args)
 {   
//	  Resource resource =new ClassPathResource("/in/ap/resources/applicationContext.xml"); 
//	   
//       BeanFactory container =new XmlBeanFactory(resource);
//       
//       Student std =(Student)container.getBean("stdobj");
//       std.display();
     
	Resource resource=new ClassPathResource("/in/ap/resources/applicationContext.xml");
	
	BeanFactory container=new XmlBeanFactory(resource);

	
	
	Student std=(Student)container.getBean("stdobj");
	std.display();
	}
}
