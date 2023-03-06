package ch07.lecture.p04abstact;

public class Fish extends Animal{
	
//	 만약 추상 메소드를 재정의하지 않으면
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉼");
	}

}
