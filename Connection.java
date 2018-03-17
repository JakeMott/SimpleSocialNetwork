
public class Connection {
	
	private Profile person1;
	private Profile person2;
	private String type1;
	private String type2;
	
	public Connection (Profile person1, Profile person2, String type1, String type2) {
		this.person1 = person1;
		this.person2 = person2;
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public Profile getPerson1() {
		return this.person1;
	}
	
	public Profile getPerson2() {
		return this.person2;
	}
	
	public String getType1() {
		return this.type1;
	}
	
	public String getType2() {
		return this.type2;
	}

}
