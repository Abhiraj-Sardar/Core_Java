package ClassObject;

class Student4  						 //classc
{
	int id;								//Instance Variable
	String name;
	double marks;
	
	Student4(){
		id=0;
		name=null;
		marks=0;
	}
	
	Student4(int id,String name,double marks) {    //Parameterized Constructor       
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void get() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}
	
}


//Driver Class
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Student4 s1= new Student4(2,"Sougata",78.50);			//Create Object [  Class name object_name = new Class name(); ]
		s1.get();
		
		
		Student4 s2= new Student4(3,"Sayan",60.50);			//Create Object [  Class name object_name = new Class name(); ]
		s2.get();
		
		
		Student4 s3= new Student4();			                //Create Object [  Class name object_name = new Class name(); ]
		s3.get();
		
	}

}
