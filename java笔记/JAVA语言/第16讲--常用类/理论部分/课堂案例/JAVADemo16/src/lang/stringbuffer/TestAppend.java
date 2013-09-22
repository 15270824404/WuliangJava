package lang.stringbuffer;
/*
 * append()方法：将指定的字符串追加到此字符序列
 */
public class TestAppend {

	public static void main(String[] args) {
		//初始化可变字符串
		StringBuffer sb=new  StringBuffer("ZTE");
		//追加字符串
		sb.append("123");
		System.out.println(sb);
	}
}
