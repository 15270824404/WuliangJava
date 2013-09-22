package kehou.zuoye2;

/*
 * ����Book�࣬�ṩ4�����ԣ�bookName��price��num��totalPrice��
 * ���ṩ��3������bookName��price��num�Ĺ��췽��
 * ͨ�����췽����bookName��price��num���Խ��и�ֵ��
 * �鼮�Ĺ�����������10С��20�����۴�9�ۣ��������20,���۴�8�ۡ�
 * ����鼮���ܽ��
 * ���鼮�������鼮���۽����������ƣ������鼮�������͵��۲���С��0
 */
public class Book {
	private String bookName;
	private double price;
	private int num;
	private double totalPrice;

	public Book(String bookName, double price, int num) {
		this.bookName = bookName;
		setPrice(price);// ����set�������Ա�Լ۸��������
		setNum(num);// ����set�������Ա��������������
		if (this.num < 10) {
			this.totalPrice = this.price * this.num;
		} else if (this.num >= 10 && this.num < 20) {
			this.totalPrice = this.price * this.num * 9 / 10;
		} else {
			this.totalPrice = this.price * this.num * 8 / 10;
		}
	}

	public void detail() {
		System.out.println("���ƣ�" + bookName + "  ���ۣ�" + price + "  ������" + num
				+ "  �ܽ�" + getTotalPrice());
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	/*
	 * �����ܼ۸�
	 */
	public void setTotalPrice() {
		this.totalPrice = this.price * this.num;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("�鼮�۸�������0��");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num > 0) {
			this.num = num;
		} else {
			System.out.println("�鼮�����������0��");
		}
	}

}
