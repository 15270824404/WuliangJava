package lang.stringdemo;

/*
 * substring(索引)方法：
 * 返回一个新的字符串，它是此字符串的一个子字符串。
 * 该子字符串从指定索引处的字符开始，直到此字符串末尾。
 */
public class TestSubString {
	public static void main(String[] args) {
		String str1 = "Hello ZTE";
		String str2 = str1.substring(3);
		System.out.println("str2的值是：" + str2);
	}
}
