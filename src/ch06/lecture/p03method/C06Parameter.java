package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		// 자동형변환
		int a = 3;
		long b = a;
		double c = b;
		char d = 'a';
		int e = d;
		
		MyClass06 o1 = new MyClass06();
		o1.method(33);
		o1.method('c');
		
		o1.method2(228780926702L);
		o1.method2(33);
		o1.method2('d');
		
		o1.method3(3.14);
		o1.method3(2926087248967246L);
		o1.method3(55);
		
		o1.method4(3.14f);		//되고
		o1.method4(29347348L);	//되고
		o1.method4(99);			//되고
//		o1.method4(3.14); 		//안되고
	}
}
