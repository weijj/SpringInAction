package sec1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Singler {
	
	private Instrument instrument;
	
	public Singler(){}
	
	public Singler(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public String toString(){
		return "I play " + this.instrument.toString() + ".";
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("singler4.xml");
		Singler singler1 = (Singler)context.getBean("singler1");
		System.out.println(singler1);
	}
}
