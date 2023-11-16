package java8;

import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	String name;
	long sallary;
	String gender;
	int age;
	String department;
	List<EmployeeRole> employeeRoles;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sallary=" + sallary + ", gender=" + gender + ", age=" + age
				+ ", department=" + department + "]";
	}

	public Employee(String name, long sallary, String gender, int age, String department) {
		super();
		this.name = name;
		this.sallary = sallary;
		this.gender = gender;
		this.age = age;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee e) {
		// sort by age
		// return this.age - e.getAge();
		// sortByName
		return this.name.compareTo(e.getName());
		// sortBysalry

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, department, employeeRoles, gender, name, sallary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department)
				&& Objects.equals(employeeRoles, other.employeeRoles) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name) && sallary == other.sallary;
	}

}
