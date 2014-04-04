package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stage {
	private String description = "Unique Stage";
	private Stage(){}
	
	private static class StageHolder {
		static Stage stage = new Stage();
	}
	
	public static Stage getInstance(){
		return StageHolder.stage;
	}
	
	void setDescription(String description) {
		this.description = description;
	}
	
	void embark() {
		System.out.println("I'm " + this.description );
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Stage.xml");
		Stage stage = (Stage)context.getBean("stage");
		stage.embark(); // I'm unique stage
		
		stage.setDescription("Wei Jingjing");
		
		ApplicationContext context_2 = new ClassPathXmlApplicationContext("Stage.xml");
		Stage stage_2 = (Stage)context_2.getBean("stage");
		stage_2.embark(); // I'm Wei Jingjing
		
		// stage and stage_2 are the same reference to Stage
	}
}
