package SpringBoot1.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(DemoApplication.class, args); //run is giving object of application context.
        /*
		Before ApplicationContext there was Interface BeanFactory and class XmlBeanFactory

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springAlien.xml"));
		To create SpringAlien.xml -> use spring bean xml file configuration.
 
		Alien obj = (Alien) factory.getBean("alien");
		*/
		//Alien obj = new Alien(); -> this is problem because we have not created object

		ApplicationContext context = new ClassPathXmlApplicationContext("springAlien.xml"); /*This will create object -> so constructor will be called here*/
		Alien obj = context.getBean(Alien.class); // get bean belongs to inteface - ApplicationContext
		obj.code();
		//obj.age = 22;
		//System.out.println(obj.age);
		//Alien obj1 = context.getBean(Alien.class);
		//System.out.println(obj1.age); // obj and obj1 both give same age value because they are same object.
		//bean creates singleton object by default. If we want to create multiple object then we have to change scope of bean in xml file. By default it is singleton. We can change it to prototype. Then it will create multiple object.
		

		

		
	}

}