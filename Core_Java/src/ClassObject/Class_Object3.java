package ClassObject;

class Student2						       //class
{
	int id;								 //Instance Variable
	String name;
	double marks;
	
	void set(int i,String n,double m) {    //Method       
		id=i;
		name=n;
		marks=m;
	}
	
	void get() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}
	
}

//Driver Class
public class Class_Object3 {

	public static void main(String[] args) {
		
		Student2 s1= new Student2();			//Create Object [  Class_name object_name = new Class_name(); ]
		s1.set(2,"Sougata",78.50);
		s1.get();
				
		Student2 s2= new Student2();			//Create Object [  Class_name object_name = new Class_name(); ]
		s2.set(3,"Sayan",60.50);
		s2.get();
		
	}

}
