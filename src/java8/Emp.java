package java8;

public class Emp {
	
	String name;
	int age;
	String dob;

	
	public Emp(String name, int age, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
