package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Juggler implements Performer{
	private int beanBags = 3;
	
	Juggler() {}
	
	Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}
	
	public void perform() {
		System.out.println("Juggling " + this.beanBags + " Bean Bags.");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Juggler.xml");
		Juggler juggler_0 = (Juggler)context.getBean("juggler");
		juggler_0.perform(); // perform 15 bean bags
		
		juggler_0.setBeanBags(10);
		
		Juggler juggler_1 = (Juggler)context.getBean("juggler");
		juggler_1.perform(); // perform 10 bean bags
		
		ApplicationContext context_2 = new ClassPathXmlApplicationContext("Juggler.xml");
		Juggler juggler_2 = (Juggler)context_2.getBean("juggler");
		juggler_2.perform(); // perform 15 bean bags		
	}
}
