package kehou.zuoye1;

/*
 * �κ���ҵ1
 * ����˵��
 * ����Book1�࣬�ṩ�����в����Ĺ��췽����ʵ����Book��ʱ�����ݴ���Ĳ��������Զ�������Ӧ�Ĺ��췽��
 * ʵ��˼·
 * ����Book1�࣬�ṩ˽������bookName��num��������������price�����ۣ�
 * �ṩBook���Զ�Ӧ��getter/setter����
 * ����������Test����Test����ʵ����Book�����ݴ���Ĳ��������Զ�����Book��Ĺ��췽����������鼮����Ϣ
 */
public class Book1 {
	private String bookName;
	private int num;
	private double price;

	public Book1(String bookName) {
		this.bookName = bookName;
		this.num = 100;
		this.price = 57.8;
	}

	public Book1(String bookName, int num, double price) {
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

	public void detail() {
		System.out.println("�̲����ƣ�" + bookName + "\t������" + num + "��\t���ۣ�"
				+ price);
	}

}
