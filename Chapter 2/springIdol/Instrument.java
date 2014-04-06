package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Instrument {
	private String name;
	
	public Instrument() {}
	public Instrument(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Instrument.xml");
		Instrument instrument = (Instrument)context.getBean("instrument");
		Instrument guitar = (Instrument)context.getBean("guitar");
		
		System.out.println(instrument);
		System.out.println(guitar);
	}
}
