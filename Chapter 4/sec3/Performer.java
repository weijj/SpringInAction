package sec3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Performer {
	
	public Performer(){}
	
	public void perform() {
		System.out.println("I'm performing!");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("perform.xml");
		Performer performer = (Performer)context.getBean("performer");
		performer.perform();
	}
}
