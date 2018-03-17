//import java.util.ArrayList;

public abstract class Profile {
	
	private String name;
	private String image;
	private String status;
	private int age;
	
	public Profile (String name, String status, int age) {
		this.name = name;
		this.image = "default.png";
		this.status = status;
		this.age = age;
	}
	
	public Profile (String name, int age) {
		this(name, null, age);
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	//public void setAge(int age) {
		//this.age = age;
	//}
	
	
	
	
}
