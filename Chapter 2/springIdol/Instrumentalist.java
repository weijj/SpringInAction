package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Instrumentalist implements Performer{
	
	private String song;
	private Instrument instrument;
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public void perform(){
		System.out.println(instrument + " plays : " + this.song);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Instrumentalist.xml");
		Instrumentalist instrumentalist = (Instrumentalist)context.getBean("instrumentalist");
		instrumentalist.perform();
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Instrumentalist2.xml");
		Instrumentalist instrumentalist2 = (Instrumentalist)context2.getBean("instrumentalist");
		instrumentalist2.perform();
		
		ApplicationContext context3 = new ClassPathXmlApplicationContext("Instrumentalist3.xml");
		Instrumentalist instrumentalist3 = (Instrumentalist)context3.getBean("instrumentalist");
		instrumentalist3.perform();
	}
}
