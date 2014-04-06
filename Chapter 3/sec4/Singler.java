package sec4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Singler singler1 = (Singler)context.getBean("singler");
		System.out.println(singler1);
	}
}


