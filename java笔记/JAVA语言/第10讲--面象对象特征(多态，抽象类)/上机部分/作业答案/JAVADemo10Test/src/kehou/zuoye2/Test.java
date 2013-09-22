package kehou.zuoye2;

public class Test {

	/**
	 * 建立测试类Test，在Test类中实例化Book，并输出书籍的总金额
	 */
	public static void main(String[] args) {
		Book b1 = new Book("JAVA基础教程", 60, 20);
		b1.detail();
	}

}
