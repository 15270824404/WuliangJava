package lang.stringdemo;

/*
 * concat(����)������
 * ��������ַ����ĳ���Ϊ 0���򷵻ش� String ����
 * ���򣬴���һ���µ� String ����
 * ������ʾ�ɴ� String �����ʾ���ַ����кͲ����ַ�����ʾ���ַ��������Ӷ��ɵ��ַ����С�
 */
public class TestConcat {
	public static void main(String[] args) {
		String str1 = "ZTE";
		String str2 = "123";
		String str3 = str1.concat(str2);
		System.out.println("str3��ֵ�ǣ�" + str3);
	}
}
