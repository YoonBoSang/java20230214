package ch13.lecture.p02wildcard;

public class C06WildCard {
	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<>();
//		MyClass06<Object> o1 = new MyClass06<String>(); // xx
		
		MyClass06<?> o3 = new MyClass06<Object>();
		MyClass06<?> o4 = new MyClass06<String>();
		
		MyClass06 o5 = new MyClass06();
	}
}

class MyClass06<T> {
	private T item;
}
