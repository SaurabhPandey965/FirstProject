package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class wipro {

      int []Input  = {5,7,7,8,8,10};
      int target = 8;
	//	Output: [3,4]  3++

	
	    public static void main(String args[]) {
	      
	    	
	    	List<Employee> lstEmp = new ArrayList<>();
	    	
	    	lstEmp.add(new Employee("ram", 10000, "male", 26, "dev"));
	    	lstEmp.add(new Employee("akram", 12000, "male", 25, "dev"));
	    	lstEmp.add(new Employee("saurabh", 15000, "male", 27, "architect"));
	    	lstEmp.add(new Employee("shyam", 17000, "male", 28, "hr"));
	    	List<Employee> sort = lstEmp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
          System.out.println(sort);
	    //Map<String, Long> genderByEmp = lstEmp.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
	       //lstEmp.stream().flatMap(e -> e.employeeRoles.stream()).filter(r ->r.roles.getRole.equals( "admin"))
	    }	
	    	    	
	         static	void findFirstAndEndIndexOfTargetVal(int input [], int target) {
	        	 
	        	 
	        	 List<Integer> lst = new ArrayList<>();
	        	    for (int i = 0; i < input.length; i++) {
						  if(input[i] == target) {
							  lst.add(i);
						  }
						  
					}
	        	    
	        	  
				lst.get(0);
			
	    		
	    	
	    	}
	    	
			/*
			 * List<String> votesList = Arrays.asList("candidate1", "candidate2",
			 * "candidate3", "candidate2","candidate3","candidate2","candidate1",
			 * "candidate2", "candidate3");
			 * 
			 * List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8); List<Integer> even =
			 * num.stream().filter((n) -> n %2 == 0).collect(Collectors.toList());
			 * List<Integer> odd = num.stream().filter((n)-> n%2
			 * !=0).collect(Collectors.toList()); System.out.println("even  "+even+"  odd"+
			 * odd);
			 */	    
	    	
	    }
	     
	     

	       
	     
	    
	   
	


