package myP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpProgram2 {

	
	public static void main(String[] Args) {
		//List collection of 4 employees
		List<Employee> employees=Arrays.asList(
				                 new Employee("EMP1","CS",10000),
				                 new Employee("EMP2","CS",35000),
				                 new Employee("EMP3","IT",20000),
				                 new Employee("EMP4","IT",25000)
				                 );
		System.out.println("There are "+employees.size()+" employees in the list");
		
		
		/*Map<String,List<Employee>> byDepartment=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment()));		
		System.out.println(byDepartment.toString());*/
		
		//Printing the employee list before sorting
		employees.forEach(System.out::println);
		
		//Sorting by salary and store in a new list (Ascending order)
		List<Employee> sortedlist=employees.stream() //Creating Stream Pipeline
				.sorted(Comparator.comparing(Employee::getSalary)). //Sorting data in the pipeline
				collect(Collectors.toList()); //Assigning sorted list into the variable
		
		System.out.println("*********Ascending Order Sorting (By Salary)***********");
		
		//printing after sorting from the new list object
		sortedlist.forEach(System.out::println);
		
		
		//Sorting by salary and store in a new list (Descending order)
		List<Employee> sortedlistD=employees.stream() //Creating Stream Pipeline
						.sorted(Comparator.comparing(Employee::getSalary).reversed()). //Sorting data in the pipeline
						collect(Collectors.toList()); //Assigning sorted list into the variable
				
		System.out.println("*********Descending Order Sorting (By Salary)***********");
				
		//printing after sorting from the new list object
		sortedlistD.forEach(System.out::println);
		
		
		//Sorting by salary and store in a new list (Descending order)
		List<Employee> sortedlistN=employees.stream() //Creating Stream Pipeline
				.sorted(Comparator.comparing(Employee::getName).reversed()). //Sorting data in the pipeline
				collect(Collectors.toList()); //Assigning sorted list into the variable
		
        System.out.println("*********Descending Order Sorting (by Name)***********");
		
        //printing after sorting from the new list object
        sortedlistN.forEach(System.out::println);
		
	}
	
}
