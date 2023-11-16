package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Virtusa {
	
	public static void main(String[] args) {
		System.out.println("hello saurabh");
		
		Arrays.asList(10,18,5,22,22,111,222).stream().collect(Collectors.groupingBy(Function.identity())).
		forEach((k,v)->{
			if(v.size()>1) {
				System.out.println(k);
			}
		});
		
		String valu = "fullstackdeveloper";
		Map<String, List<String>> dup = Arrays.asList(valu.split("")).stream().collect(Collectors.groupingBy(Function.identity()));
		   System.out.println(dup);
		List<String> lst = new ArrayList<>();
		lst.add("saurabh");
		lst.add("");
		 String name = "saurabh";
		//int parse = Integer.parseInt(name);
		// System.out.println(parse);
		 
		List<Emp> lstEmp = new ArrayList<>();
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		lstEmp.add(new Emp("akram", 26, "14/04/1999"));
		lstEmp.add(new Emp("kamal", 22, "11/02/2001"));
		lstEmp.add(new Emp("mahan", 27, "11/02/1996"));
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		lstEmp.add(new Emp("ram", 25, "11/02/1998"));
		
      List<Emp> sortedByName = lstEmp.stream().sorted(Comparator.comparing(Emp :: getName)).collect(Collectors.toList());
      System.out.println(sortedByName);
		
	  double value = 100.0;
	  long parLong = (long) value;
	  System.out.println(parLong);
	  double l = (double)parLong;
	  System.out.println(l);
		     
		
	}
      
}
