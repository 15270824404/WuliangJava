package lang.stringdemo;
/*
 * valueOf(����)���������ز������ַ�����ʾ��ʽ��
 */
public class TestValueOf {

	public static void main(String[] args) {
		boolean flag = true;
		int number = 123;
		String str1 = String.valueOf(flag);
		String str2 = String.valueOf(number);
		System.out.println("str1��ֵ�ǣ�" + str1);
		System.out.println("str2��ֵ�ǣ�" + str2);
	}
}
