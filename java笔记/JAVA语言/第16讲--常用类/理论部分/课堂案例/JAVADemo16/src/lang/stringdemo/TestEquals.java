package lang.stringdemo;
/*
 * equals(����)������
 * �����ַ�����ָ���Ķ���Ƚϡ�
 * ���ҽ����ò�����Ϊ null��
 * ��������˶����ʾ��ͬ�ַ����е� String ����ʱ�������Ϊ true�� 
 */
public class TestEquals {
	public static void main(String[] args) {
		String str1 = new String("ZTE");
		String str2 = new String("ZTE");
		if (str1 == str2) {
			System.out.println("�������");
		} else {
			System.out.println("���ò����");
		}
		if (str1.equals(str2)) {
			System.out.println("ֵ���");
		}
	}
}
