package program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class fox {

	public static void main(String[] args) {
		
	                 LocalDateTime date = LocalDateTime.now();
	                System.out.println(date);
	               String formated = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withZone(ZoneId.systemDefault()));
	             System.out.println(formated);
	                //SimpleDateFormat simpleDateFormate = new SimpleDateFormat("dd/mmm/yyyy");
	           
	             
	          
	           
	             
		
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee(1, "ram"));
		listEmp.add(new Employee(2, "mayank"));
		listEmp.add(new Employee(3, "saurabh"));
		listEmp.add(new Employee(4, "abhishek"));
		listEmp.add(new Employee(5, "anand"));
		
		Collections.sort(listEmp);
		//listEmp.sort(Comparator.comparing(Employee :: getId));
		          
		//List<Employee> sotlist = listEmp.stream().sorted(Comparator.com)
		System.out.println(listEmp);
		
	
	}

}
