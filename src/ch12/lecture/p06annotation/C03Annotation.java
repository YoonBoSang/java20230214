package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {
		
	}
}

@MyAnnotation03
class MyClass03 {

	@MyAnnotation03
	String field;
	
	@MyAnnotation03
	MyClass03() {
		
	}
	
	@MyAnnotation03
	void method1() {
		
	}
}

//@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}