package kehou.zuoye1;

/*
 * 建立测试类Test，在Test类中实例化Book，根据传入的参数个数自动调用Book类的构造方法，并输出书籍的信息
 */
public class Test {

	public static void main(String[] args) {
		Book1 b1 = new Book1("JAVA基础教程");
		b1.detail();
		Book1 b2 = new Book1("JSP应用技术", 200, 48.8);
		b2.detail();
	}

}
