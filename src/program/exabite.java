package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exabite {
	
	
	//integer array with elemnts in increasing order .. remoeve the duplicates 
	      static Integer inp [] = {1,1,2,3,4,5,6,7,7,8};
	      static String name = "saurabh";
	      
	      
	public static void main(String[] args) {
		
		String s1 = "hi";
		String s4 = "hi";
		System.out.println(s1 == s4);
		
		 String s = s1+"no value";
		 System.out.println(s1.equals(s4));
		String s2 =  s1+"bye";
		    
		String s3 = s1;
		s1 =s2;
		
		//List<Persone>
		 List<Integer> list = Arrays.asList(inp);
		Set<Integer> set = new HashSet<>();
		set.addAll(list);	
		System.out.println(set);
		      // name.toCharArray();
		//List<Persone> list = new ArrayList<>();
		

	}
	
	     

}
