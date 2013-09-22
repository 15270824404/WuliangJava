package map.xiaoji4;

/*
 * ����һ��BookTest�����࣬���main������Ҫ�� 
 * ʹ��HashMap���д洢����ΪBook����ı�ţ�ֵΪBook���� 
 * ͨ��ĳһ����Ż�ȡBook���󣬲���ӡ��Book����ı���
 */
import java.util.*;

public class BookTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// ����һ��HashMap����
		Map map = new HashMap();
		// ������������
		Book b1 = new Book("A001", "JAVA�����̳�");
		Book b2 = new Book("A002", "JSPӦ�ü���");
		Book b3 = new Book("A003", "���ݿ�");
		// ������������뼯����
		map.put(b1.getId(), b1);
		map.put(b2.getId(), b2);
		map.put(b3.getId(), b3);
		// ͨ����ֵȡ������һ������ע��Ҫǿ������ת��
		Book book = (Book) map.get("A001");
		// �����Ϣ
		System.out.println(book);
	}
}
