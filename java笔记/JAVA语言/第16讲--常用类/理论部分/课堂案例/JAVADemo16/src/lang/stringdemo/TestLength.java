package lang.stringdemo;

/*
 * length()方法：返回此字符串的长度。
 * 字符串为null时，表示这个字符串对象不存在，所以不能调用length()方法。会运行出错。
 */
public class TestLength {
	public static void main(String[] args) {
		String str1 = "ZTE";
		String str2 = "";
		String str3 = null;
		int l1 = str1.length();
		int l2 = str2.length();
		int l3 = str3.length();
		System.out.println("str1的长度为：" + l1);
		System.out.println("str2的长度为：" + l2);
	}
}
