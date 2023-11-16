package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		 List<String> filter = Arrays.asList("Apple", "mango","apricot","banana","gwava","Avacod").stream().map(a-> a.toLowerCase()).filter(f-> f.startsWith("a")).toList();
		System.out.println(filter);
		 Map<Employee, String> empMap = new HashMap<>();
		empMap.put(new Employee("ram", 10000 , "male", 25, "hr"), "tcs" );
		empMap.put(new Employee("ram", 20000 , "female", 26, "hr"), "infosys" );
		
		System.out.println(empMap);

		StreamProcessore strem = new StreamProcessore();
		 System.out.println(Arrays.asList(1,2,4,9,8,7,6).stream().filter(a->a%2 == 0).sorted().map(a-> a*a).collect(Collectors.toList())); 
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee("saurabh", 10000, "male", 26, "dev"));
		listEmp.add(new Employee("Riya", 20000, "female", 21, "hr"));
		listEmp.add(new Employee("sriRam", 28000, "male", 28,"it"));
		listEmp.add(new Employee("syam", 29000, "male", 29, "admmin"));
		listEmp.add(new Employee("Raghaw", 25000, "male", 23, "operation"));
		listEmp.add(new Employee("Prabhu", 30000, "male", 24, "qa"));
		
		strem.sumOfAllEmployeeSallary(listEmp);
		strem.evenNo(listEmp);
		strem.printEvenNoByAge(listEmp);
		/*
		 * Iterator<Employee> itr = listEmp.iterator(); for (Employee employee :
		 * listEmp) { //System.out.println(employee); }
		 * 
		 * Collections.sort(listEmp); System.out.println(listEmp); // convert list to
		 * map Map<Integer, Employee> map =
		 * listEmp.stream().collect(Collectors.toMap(Employee::getAge,
		 * Function.identity()));
		 * 
		 * Map<String, List<Employee>> genderByEmpdetails = listEmp.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender));
		 * genderByEmpdetails.forEach((k, v) -> { System.out.println("gender " + k +
		 * " employee " + v); });
		 */		
		List<String> listEmpName = listEmp.stream().map(Employee::getName).collect(Collectors.toList());
		List<Employee> empNamStartR = listEmp.stream().filter(e -> e.getName().startsWith("R"))
				.collect(Collectors.toList());
		// Employee maxSalry =
		// listEmp.stream().max(Comparator.comparingLong(Employee::getSallary)).get();
		Optional<Employee> secondLargSal = listEmp.stream()
				.sorted(Comparator.comparingLong(Employee::getSallary).reversed()).skip(1).findFirst();
		System.out.println("secondLargSal:: " + secondLargSal);
		Map<String, Long> maleFemCount = listEmp.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		maleFemCount.forEach((k, v) -> {
			System.out.println(k + "count" + v);
		});

	}

}
