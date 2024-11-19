package ClassObject;

//parameterized constructor
class Student3    						 	//class
{
	int id;								//Instance Variable
	String name;
	double marks;
	
	Student3(int i,String n,double m) {    			//Parameterized Constructor       
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
public class Class_Object4 {

	public static void main(String[] args) {
		
		Student3 s1= new Student3(2,"Sougata",78.50);			//Create Object [  Class_name object_name = new Class_name(); ]
		s1.get();
		
		Student3 s2= new Student3(3,"Sayan",60.50);			//Create Object [  Class_name object_name = new Class_name(); ]
		s2.get();
		
	}

}

