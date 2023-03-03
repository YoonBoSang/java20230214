package ch06.exercise.exam18;

public class ShopService {
	private static ShopService obj1 = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return obj1 ;
	}
}
