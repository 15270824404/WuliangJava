package kehou.zuoye4;

/*
 * �κ���ҵ4
 * ����������Book���ṩ����bookName��num��price����Ӧ��getter/setter������
 * �ڳ��������ṩprintTotalPrice���󷽷�
 * 
 * ��������ComputerBook���ṩbookName��num��price�����Զ�Ӧ��getter/setter������
 * ����д�����е�printTotalPrice����
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
