package kehou.zuoye4;

/*
 * 课后作业4
 * 建立抽象类Book，提供属性bookName，num，price及对应的getter/setter方法。
 * 在抽象类中提供printTotalPrice抽象方法
 * 
 * 建立子类ComputerBook，提供bookName、num、price及属性对应的getter/setter方法，
 * 并重写父类中的printTotalPrice方法
 */
public abstract class Book {
	private String bookName;
	private int num;
	private double price;

	public abstract void printTotalPrice();

	public Book(String bookName, int num, double price) {
		this.bookName = bookName;
		this.num = num;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
