package lang.stringdemo;

/*
 * concat(参数)方法：
 * 如果参数字符串的长度为 0，则返回此 String 对象。
 * 否则，创建一个新的 String 对象，
 * 用来表示由此 String 对象表示的字符序列和参数字符串表示的字符序列连接而成的字符序列。
 */
public class TestConcat {
	public static void main(String[] args) {
		String str1 = "ZTE";
		String str2 = "123";
		String str3 = str1.concat(str2);
		System.out.println("str3的值是：" + str3);
	}
}
