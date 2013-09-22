package kehou.zuoye4;

public class ComputerBook extends Book {

	private double totalPrice;

	public ComputerBook(String bookName, int num, double price) {
		super(bookName, num, price);
	}

	@Override
	public void printTotalPrice() {
		totalPrice = getPrice() * getNum();
		System.out.println("�鼮���ƣ�" + getBookName() + "  ���ۣ�" + getPrice()
				+ "  ������" + getNum() + "  �ܼ۸�" + totalPrice);

	}

	public static void main(String[] args) {
		Book b1 = new ComputerBook("JAVA�����̳�", 100, 60);
		b1.printTotalPrice();
	}

}
