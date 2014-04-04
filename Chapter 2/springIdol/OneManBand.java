package springIdol;

import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneManBand implements Performer{
	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public void perform() {
		for(String key : this.instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = this.instruments.get(key);
			System.out.println(instrument);
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("OneManBand2.xml");
		OneManBand band1 = (OneManBand)context.getBean("oneManBand");
		band1.perform();
	}
}
