package sec1;

public class Instrument {
	
	private String name;
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
}
