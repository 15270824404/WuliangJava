package lang.stringdemo;
/*
 * equals(参数)方法：
 * 将此字符串与指定的对象比较。
 * 当且仅当该参数不为 null，
 * 并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。 
 */
public class TestEquals {
	public static void main(String[] args) {
		String str1 = new String("ZTE");
		String str2 = new String("ZTE");
		if (str1 == str2) {
			System.out.println("引用相等");
		} else {
			System.out.println("引用不相等");
		}
		if (str1.equals(str2)) {
			System.out.println("值相等");
		}
	}
}
