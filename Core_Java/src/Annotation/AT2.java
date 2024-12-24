//Before exploring annotations further, it is necessary to discuss annotation retention policies. 
//A retention policy determines at what point an annotation is discarded. Java defines three 
//such policies, which are encapsulated within the java.lang.annotation.RetentionPolicy
//enumeration. They are SOURCE, CLASS, and RUNTIME.
//An annotation with a retention policy of SOURCE is retained only in the source file 
//and is discarded during compilation.
//An annotation with a retention policy of CLASS is stored in the .class file during 
//compilation. However, it is not available through the JVM during run time.
//An annotation with a retention policy of RUNTIME is stored in the .class file during 
//compilation and is available through the JVM during run time. Thus, RUNTIME retention 
//offers the greatest annotation persistence.


package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) //making the Retention Policy as Runtime so that the annotation will be available at Runtime to JVM
@interface MetaData{ 
	int id();
	String name();
}

class Annot{
	
	@MetaData(id=1,name="Abhiraj Sardar")
	public void show() {
		System.out.println("Annot Show Method");
		Annot a = new Annot();
		//now we will try to print the annotation of this method at Run Time using Reflection
		try {
			Class<?> c = a.getClass(); //getting the class of the object a
			Method m = c.getMethod("show"); //getting the method from the class c
			MetaData md = m.getAnnotation(MetaData.class); //getting the annotation for the class
			
			System.out.println("Annotation: "+md.id()+" "+md.name());
		}catch(Exception e){
			
		}
	}
}

public class AT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annot ob = new Annot();
		ob.show();
	}

}
