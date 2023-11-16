package program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class infogain {

	public static void main(String[] args) {
		Integer inp[] = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		List<Integer> list = Arrays.asList(inp);
		//find Duplicates value
		Map<Integer, Long> dup = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		dup.forEach((k,v)->{
			if(v.longValue()> 1) {
			System.out.println("duplicates value "+k);
			}
		});
		
		//reverse sorted array
        list.stream().sorted(Comparator.reverseOrder());
	}
              
	// 10,15,8,49,25,98,98,32,15

}
