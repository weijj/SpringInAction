package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class City {
	
	private String name;
	private String state;
	private int population;
	
	public City(){}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setPopulation(int population){
		this.population = population;
	}

	public String toString() {
		return this.name + " : " + this.state + " : " + Integer.toString(this.population);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("City.xml");
		List<City> cities = (List<City>)context.getBean("cities");
		
		for(City city : cities) {
			System.out.println(city);
		}
		
		
	}
}
