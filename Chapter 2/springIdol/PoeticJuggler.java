package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() {
		super.perform();
		this.poem.recite();
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PoeticJuggler.xml");
		PoeticJuggler poeticJuggler = (PoeticJuggler)context.getBean("poeticJuggler");
		poeticJuggler.perform();
	}
}
