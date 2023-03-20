package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie("avatar", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000)
				);
		
		movie.stream()
			.sorted((x, y) -> x.getPrice() - y.getPrice())
			.forEach(System.out::println);
		System.out.println();
		
		movie.stream()
		.sorted((x, y) -> y.getPrice() - x.getPrice())
		.forEach(System.out::println);
		System.out.println();
		
		movie.stream()
			.sorted((x, y) -> x.getTitle().compareTo(y.getTitle()))
			.forEach(System.out::println);
	}
}

class Movie {
	private String title;
	private int price;
	
	public Movie(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Movie [title = " + title + ", price = " + price + "]";
	}
	
	
}