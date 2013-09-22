package kehou.zuoye1;

/*
 * 课后作业1
 * 需求说明
 * 建立Book1类，提供两个有参数的构造方法，实例化Book类时，根据传入的参数个数自动调用相应的构造方法
 * 实现思路
 * 建立Book1类，提供私有属性bookName，num（购买数量）、price（单价）
 * 提供Book属性对应的getter/setter方法
 * 建立测试类Test，在Test类中实例化Book，根据传入的参数个数自动调用Book类的构造方法，并输出书籍的信息
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
		System.out.println("教材名称：" + bookName + "\t数量：" + num + "本\t单价："
				+ price);
	}

}
