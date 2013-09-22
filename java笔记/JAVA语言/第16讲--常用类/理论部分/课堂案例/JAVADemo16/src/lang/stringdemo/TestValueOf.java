package lang.stringdemo;
/*
 * valueOf(参数)方法：返回参数的字符串表示形式。
 */
public class TestValueOf {

	public static void main(String[] args) {
		boolean flag = true;
		int number = 123;
		String str1 = String.valueOf(flag);
		String str2 = String.valueOf(number);
		System.out.println("str1的值是：" + str1);
		System.out.println("str2的值是：" + str2);
	}
}
