package sec2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Singler {
	
	@Autowired
	@Qualifier("guitar")
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
		Singler singler1 = (Singler)context.getBean("singler");
		System.out.println(singler1);
	}
}
