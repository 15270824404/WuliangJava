package lang.stringbuffer;

/*
 * insert()���������ַ���������ַ�������
 */
public class TestInsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ZTE");
		sb.insert(2, "123");
		System.out.println(sb);
	}
}
