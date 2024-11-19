package ClassObject;

class Student     			    //class
{
	int id;				    //Instance Variable
	String name;
	double marks;	
	
}

public class Class_Object {

	public static void main(String[] args) {
		
		Student stu= new Student(); //Create Object [  Class_name object_name = new Class_name(); ]
		
		stu.id=2;
		stu.name="Sougata";
		stu.marks=78.50;
		
		System.out.println("Id "+stu.id);
		System.out.println("Name "+stu.name);
		System.out.println("Marks "+stu.marks);
		
	}

}
