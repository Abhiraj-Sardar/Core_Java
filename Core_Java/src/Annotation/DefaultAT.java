package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface DafaultEx{
	String str() default "Abhi"; //default value
	int val() default 10; //default value
}

@Retention(RetentionPolicy.RUNTIME)
@interface Marker{} //Marker Annotation

class DAT{
	
	@DafaultEx()
	@Marker()
	public void show() {
		System.out.println("Inside show method...");
		DAT d = new DAT();
		Class <?> c = d.getClass();
		try {
			Method m = c.getMethod("show");
			DafaultEx a = m.getAnnotation(DafaultEx.class);
			System.out.println("Annotation: "+a.str()+" "+a.val());
			
			if(m.isAnnotationPresent(Marker.class)) { //checking for the marker annotation
				System.out.println("Marker Annotation is Present...");
			}
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	}
}

public class DefaultAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAT ob = new DAT();
		ob.show();
	}

}
