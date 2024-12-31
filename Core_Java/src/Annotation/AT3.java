package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
 String str();
 int val();
}

@Retention(RetentionPolicy.RUNTIME) //making the Retention Policy as Runtime so that the annotation will be available at Runtime to JVM
@interface Desc{ 
	String description();
}

@Desc(description="A Random Description for class...")
@MyAnno(str="class",val=2)
class Annot1{
	
	@Desc(description="A Random Description for Method...")
	@MyAnno(str="Method",val=3)
	public void show1() {
		System.out.println("Annot Show Method");
		Annot a = new Annot();
		//now we will try to print the annotation of this method at Run Time using Reflection
		try {
			Class<?> c = a.getClass(); //getting the class of the object a
			Annotation annos[] = c.getAnnotations(); //returns all the annotations used in the class as an array
			
			for(Annotation an:annos) {
				System.out.println(an);
			}
			
			Method m = c.getMethod("show1");
			annos = m.getAnnotations();
			
			for(Annotation an:annos) {
				System.out.println(an);
			}
		}catch(Exception e){
			
		}
	}
}

public class AT3 {
	public static void main(String[] args) {
		Annot1 ob = new Annot1();
		ob.show1();
	}

}
