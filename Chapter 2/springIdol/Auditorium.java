package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Auditorium {
	
	public Auditorium() {
		System.out.println("Constructor Run!");
	}
	
	public void init() {
		System.out.println("Initialization Method Run!");
	}
	
	public void destroy() {
		System.out.println("Destroy Method Run!");
	}
	
	static void retrieve() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Auditorium.xml");
		Auditorium auditorium = (Auditorium)context.getBean("auditorium");
	}

	public static void main(String[] args) {
		retrieve();		
		System.exit(0);
	}
}
