
abstract class Book02 {
	public abstract String getAuthor();
}

public class ComputerBook02 extends Book02 {
	public String getAuthor() {
		return "уехЩ";
	}

	public static void main(String[] args) {
		ComputerBook02 book2 = new ComputerBook02();
		System.out.println(book2.getAuthor());
	}
}

abstract class Person02 {
	private String name = "person";

	 abstract void printInfo();
}
abstract class child extends Person02{
	
}
