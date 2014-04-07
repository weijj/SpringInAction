package aspect;

public class Knight {
	private Quest quest;
	public Knight(){}
	
	public Knight(Quest quest) {
		this.quest = quest; // dependency injection
	}
	
	public void embarkOnQuest() {
		System.out.println(this.quest.embark());
		System.out.println("Knight saves the Damsel!");
	}
}
