package ClassObject;

// we cannot have the classes with the same name in the same package. here if we make Student class it will collide with class Student in Class_Object.java file.
class Student1 // class 
{
	int id; // Instance Variable
	String name;
	double marks;

	void set() { // Method
		id = 2;
		name = "Sougata";
		marks = 78.50;
	}

	void get() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Marks " + marks);
	}

}

public class Class_Object2 {

	public static void main(String []args) {

		Student1 s1 = new Student1(); // Create Object [ Class_name object_name = new Class_name(); ]
		s1.set();
		s1.get();

	}

}
