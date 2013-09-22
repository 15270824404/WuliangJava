
final class Base {
	/*
	 * 常量必须赋初值，且不可以重新赋值
	 */
	public final int age;

	public void getInfo() {
		System.out.println("这是父类");
	}
}
/*
 * 类型 Student 不能成为终态类 Base 的子类
 */
class Student extends Base {
	private String name;
}

public class Demo008 {
	public static void main(String[] args) {		

	}
}
