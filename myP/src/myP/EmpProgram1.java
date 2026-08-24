package myP;

public class EmpProgram1 {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		
		/*Employee e=new Employee(); //using default constructor
		e.setName("Imran");e.setDepartment("Information Technology (IT)");e.setSalary(100000);
		System.out.println(e.toString());*/
		
		Employee e=new Employee("Imran","IT",100000); //using Parameterized constructor
		System.out.println(e.toString());
		
		
		
	}

}
