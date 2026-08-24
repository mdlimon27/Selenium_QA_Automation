package myP;

public class Employee {
	//Fields or Object variables or Instance variables
	private String name;
	private String Department;
	private int Salary;	
	
	public Employee() {} //Default constructor		
	
	//Parameterized Constructor
	public Employee(String name,String Department,int salary) {
		super();
		this.name=name;
		this.Department=Department;
		this.Salary=salary;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	public String getDepartment() {
		return this.Department;
	}
	public int getSalary() {
		return this.Salary;
	}
	
	//setters
	public void setName(String name) {
		this.name=name;
	}
	public void setDepartment(String department) {
		this.Department=department;
	}
	public void setSalary(int salary) {
		this.Salary=salary;
	}
	
	//toString Method overwriting
	@Override
	public String toString() {
		return "Employee [name: "+name+", Department: "+Department+", Salary: "+Salary+" ]";
	}

}
