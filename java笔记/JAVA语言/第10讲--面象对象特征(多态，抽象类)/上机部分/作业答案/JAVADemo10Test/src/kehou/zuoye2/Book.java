package kehou.zuoye2;

/*
 * 建立Book类，提供4个属性：bookName、price、num、totalPrice，
 * 并提供带3个参数bookName、price、num的构造方法
 * 通过构造方法对bookName、price、num属性进行赋值，
 * 书籍的购买数量大于10小于20，单价打9折，如果大于20,单价打8折。
 * 输出书籍的总金额
 * 对书籍数量和书籍单价进行条件限制，购买书籍的数量和单价不能小于0
 */
public class Book {
	private String bookName;
	private double price;
	private int num;
	private double totalPrice;

	public Book(String bookName, double price, int num) {
		this.bookName = bookName;
		setPrice(price);// 调用set方法，以便对价格进行限制
		setNum(num);// 调用set方法，以便对数量进行限制
		if (this.num < 10) {
			this.totalPrice = this.price * this.num;
		} else if (this.num >= 10 && this.num < 20) {
			this.totalPrice = this.price * this.num * 9 / 10;
		} else {
			this.totalPrice = this.price * this.num * 8 / 10;
		}
	}

	public void detail() {
		System.out.println("名称：" + bookName + "  单价：" + price + "  数量：" + num
				+ "  总金额：" + getTotalPrice());
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	/*
	 * 计算总价格
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
			System.out.println("书籍价格必须大于0！");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num > 0) {
			this.num = num;
		} else {
			System.out.println("书籍数量必须大于0！");
		}
	}

}
