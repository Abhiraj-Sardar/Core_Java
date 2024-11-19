package ClassObject;

/*      Array of Objects in Java
Java is an object-oriented programming language. Most of the work done with the help of objects. We know that an array is a collection of the same 
data type that dynamically creates objects and can have elements of primitive types. Java allows us to store objects in an array. In Java, 
the class is also a user-defined data type.
An array that conations class type elements are known as an array of objects. It stores the reference variable of the object.
*/


//Employee class with empId and name as attributes

class Employee1{  
	int empId;
	String name;

	Employee1(int eid, String n){    //Employee class constructor
 		empId = eid;
 		name = n;
	}

	void showData(){
	System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
	System.out.println();
	}
}

class ArrayOfObjects{
	public static void main(String args[]){     
 	//create array of employee object  
 		Employee1 obj[] = new Employee1[2] ;

 
	 //create & initialize actual employee objects using constructor
 		obj[0] = new Employee1(100,"ABC");
 		obj[1] = new Employee1(200,"XYZ");

 
	 //display the employee object data
 		System.out.println("Employee Object 1:");
 		obj[0].showData();
 		System.out.println("Employee Object 2:");
 		obj[1].showData();
	}
}