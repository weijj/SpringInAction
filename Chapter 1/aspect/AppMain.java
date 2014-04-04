package aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		Knight knight = (Knight)context.getBean("knight");
		knight.embarkOnQuest();
	}
}

