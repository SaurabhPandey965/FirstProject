package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProcessore implements StreamFunction<List<Employee>> {

	private Object tenPerSalInccres;

	@Override
	public void findMaxSalry(List<Employee> l) {
		Employee maxSal = l.stream().max(Comparator.comparing(Employee::getSallary)).get();
		System.out.println("maxSal : " + maxSal);

	}

	@Override
	public void findMinSalry(List<Employee> l) {
		Employee minSal = l.stream().min(Comparator.comparing(Employee::getSallary)).get();
		System.out.println("minSal : " + minSal);

	}

	@Override
	public void findCountOfMaleAndfemEmp(List<Employee> l) {
		l.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).forEach((k, v) -> {
			System.out.println("gender :" + k + " count: " + v);
		});

	}

	@Override
	public void findDuplicate(List<Employee> l) {
		l.stream().map(e-> e.getSallary()).collect(Collectors.groupingBy(Function.identity())).forEach((k,v)->{
			if(v.size()>1) {
				System.out.println(k);
			}
		});;

	}

	@Override
	public void fnd2ndHighSalry(List<Employee> l) {
		Optional<Employee> secndHigSal = l.stream().sorted(Comparator.comparing(Employee::getSallary).reversed())
				.skip(1).findFirst();
		System.out.println("secndHigSal: " + secndHigSal);
	}

	@Override
	public void increase10PerSalWhoseAgeGreaterThan30(List<Employee> l) {

	}

	@Override
	public void findDepartWiseEployeeList(List<Employee> l) {
		Map<String, List<Employee>> depWiseEmpLst = l.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("depWiseEmpLst: " + depWiseEmpLst);
	}

	public List<Integer> evenNo(List<Employee> lst) {
		// return lst.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
		return lst.stream().filter(e -> e.getAge() % 2 == 0).map(emp -> emp.getAge()).collect(Collectors.toList());
	}

	@Override
	public void sumOfAllEmployeeSallary(List<Employee> l) {
		Long sumOfSallary = l.stream().map(Employee::getSallary).reduce((long) 0, (a, b) -> a + b);
		System.out.println("sumOfSallary: " + sumOfSallary);

	}

	@Override
	public void printEvenNoByAge(List<Employee> l) {
		// TODO Auto-generated method stub
		List<Integer> even = l.stream().filter(e -> e.getAge() % 2 == 0).map(emp -> emp.getAge())
				.collect(Collectors.toList());
		System.out.println("evenAge: " + even);

	}

}
