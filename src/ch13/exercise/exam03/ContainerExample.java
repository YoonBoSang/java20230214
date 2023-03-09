package ch13.exercise.exam03;

//import java.awt.*;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<>();
		container2.set("홍길동" , 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2);
	}
}

class Container<K, V> {
	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
}
