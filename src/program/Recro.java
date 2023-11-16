package program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Recro {
	
	public static void main(String[] args) {
		
		Integer inp [] = {1,2,3,4,5,6,8,2,3};
	  List<Integer> list = Arrays.asList(inp);
	  Set<Integer> set = new HashSet<>(list);
      System.out.println(set);
	      list.stream().distinct().forEach(n->{
	    	  System.out.print(n);
	      });
	    
	      //reverseString("saurabh");
		
	}
	
	static void reverseString(String s) {
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	// select name count(name) from employee groupBy name
	// author 
	

}
