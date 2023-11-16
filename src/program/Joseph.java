package program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Joseph {

	static int[] arrayInput = { 72, 8, 63, 17, 10, 70, 1, 2, 3, 8 };
	static int sum = 80;

	public static void main(String[] args) {
		
	     List<Integer> arry = Arrays.asList(1,4,6,7,8,9);
	      // arry.remove(1);
	       arry.set(1, 9);
	       //arry.add(1, 3);
	       System.out.println(arry);
	     Set<Integer> set = new HashSet<>();
	     set.add(null);
		printNoSumOftwoArr(arrayInput, sum);
	}

	 
	
	static void printNoSumOftwoArr(int arr[], int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1+i; j < arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
			}
		}
		 
	}

}
