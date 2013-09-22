package lang.integer;
/*
 * 包装类案例
 */
public class IntegerTest {
	public static void main(String[] args) {
		// 定义两个数字字符串
		String str1 = "123";
		String str2 = "10";
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		System.out.println("两数之和是：" + (a + b));
	}
}
