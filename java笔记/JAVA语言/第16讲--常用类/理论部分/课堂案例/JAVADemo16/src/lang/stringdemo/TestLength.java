package lang.stringdemo;

/*
 * length()���������ش��ַ����ĳ��ȡ�
 * �ַ���Ϊnullʱ����ʾ����ַ������󲻴��ڣ����Բ��ܵ���length()�����������г���
 */
public class TestLength {
	public static void main(String[] args) {
		String str1 = "ZTE";
		String str2 = "";
		String str3 = null;
		int l1 = str1.length();
		int l2 = str2.length();
		int l3 = str3.length();
		System.out.println("str1�ĳ���Ϊ��" + l1);
		System.out.println("str2�ĳ���Ϊ��" + l2);
	}
}
