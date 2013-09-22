package shangji.zuoye1;

/*
 * 编写测试类Book1Test进行测试：
 * 分别以两种方式完成对两个Book1对象的初始化工作，并分别调用它们的detail方法，看看输出是否正确
 */
public class Book1Test {

	public static void main(String[] args) {
		Book1 b1 = new Book1("JAVA基础教程", 377);
		b1.detail();
		Book1 b2 = new Book1("大学英语\t", 277, "语言");
		b2.detail();

	}

}
