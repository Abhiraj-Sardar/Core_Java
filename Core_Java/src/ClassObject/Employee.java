package ClassObject;

class Emp{
	String empName;   									 //Instance Variable 
	int empId;
	double empSalary;
	
	Emp(String empName,int empId ,double empSalary) {
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
	}
	
	String get() {     										//method
		return "EmpName : "+empName+" EmpId : "+empId+" Empsalary : "+empSalary;
		
	}
}

public class Employee
{     
	public static void main(String[] args) {
		
		Emp emp= new Emp("Ishani",12,45000); // create Object
		System.out.println(emp.get());
		
		Emp emp1= new Emp("Sohini",14,51000); // create Object
		System.out.println(emp1.get());
	
	}

}
