package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomNumber {
	private float value;
	RandomNumber() {
		this.value = 0.0f;
	}
	
	RandomNumber(float value) {
		this.value = value;
	}
	
	public void setValue(float value){
		this.value = value;
	}
	
	public String toString() {
		return Float.toString(this.value);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("RandomNumber.xml");
		RandomNumber random = (RandomNumber)context.getBean("randomNumber");
		System.out.println(random);
	}
}
