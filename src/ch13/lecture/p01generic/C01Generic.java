package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");
		
		String s1 = null;
		Object o2 = o1.getItem();
		
		if (o2 instanceof String) {
			s1 = (String) o2;
		}
		if (s1 != null) {
			System.out.println(s1.length());
		}
		System.out.println(s1);
	}
}

class MyClass01 {
	private Object item;
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
}
// 다 잊었다는 거짓말 또 해버렸죠 마음에 그대란 사람 없다고 했죠 