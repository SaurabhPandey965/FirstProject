package java8;

import java.util.Comparator;

public class EmpCompartore implements Comparator<EmpCompartore>{

	
	String name;
	long sallary;
	int age;
	
	
	@Override
	public String toString() {
		return "EmpCompartore [name=" + name + ", sallary=" + sallary + ", age=" + age + "]";
	}


	public EmpCompartore(String name, long sallary, int age) {
		super();
		this.name = name;
		this.sallary = sallary;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSallary() {
		return sallary;
	}


	public void setSallary(long sallary) {
		this.sallary = sallary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compare(EmpCompartore e1, EmpCompartore e2) {
		
		if(e1.getAge() == e2.getAge()){
		return 0;
		}
		else if(e1.getAge() > e2.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}

}
