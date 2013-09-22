package innerclass;

/*
 * 内部类使用示例代码
 */
class OutClass {

	// 外部类声明的变量
	int i = 0;

	/*
	 * 内部类
	 */
	private class InnerClass {
		// 内部类可以直接访问外部类变量
		public void test() {
			i++;
		}
	}

	// 外部类的方法
	public void test() {
		// 声明内部类对象
		InnerClass inner = new InnerClass();
		// 调用内部类方法
		inner.test();
	}
}

/*
 * 测试类
 */
public class OutClassTest {
	public static void main(String[] args) {
		// 创建外部类对象
		OutClass out = new OutClass();
		// 调用外部类的方法
		// 此方法调用了内部类方法
		out.test();
		System.out.println(out.i);
	}
}
