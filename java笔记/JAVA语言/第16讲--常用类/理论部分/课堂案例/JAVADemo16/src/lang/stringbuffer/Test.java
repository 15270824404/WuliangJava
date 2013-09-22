package lang.stringbuffer;

public class Test {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(20);
		StringBuffer str3 = new StringBuffer("ZTE");
		str3.append(false);
		System.out.println(str3);
	}
}
