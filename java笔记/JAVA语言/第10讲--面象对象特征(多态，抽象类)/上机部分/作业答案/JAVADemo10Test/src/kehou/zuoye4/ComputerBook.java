package kehou.zuoye4;

public class ComputerBook extends Book {

	private double totalPrice;

	public ComputerBook(String bookName, int num, double price) {
		super(bookName, num, price);
	}

	@Override
	public void printTotalPrice() {
		totalPrice = getPrice() * getNum();
		System.out.println("书籍名称：" + getBookName() + "  单价：" + getPrice()
				+ "  数量：" + getNum() + "  总价格：" + totalPrice);

	}

	public static void main(String[] args) {
		Book b1 = new ComputerBook("JAVA基础教程", 100, 60);
		b1.printTotalPrice();
	}

}
