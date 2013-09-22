package staticdemo;

class Order {
	int a = 1;
	// 静态变量
	static int b = 1;
	// 普通代码块
	{
		System.out.println("实例变量a=" + a);
		System.out.println("代码块执行！");
	}
	// 静态代码块
	static {
		System.out.println("静态变量b=" + b);
		System.out.println("静态代码块执行！");
	}

	// 构造方法
	Order() {
		System.out.println("构造方法执行");
	}
}

// 测试类
public class OrderTest {
	public static void main(String[] args) {
		// 创建对象
		Order order = new Order();
	}
}
