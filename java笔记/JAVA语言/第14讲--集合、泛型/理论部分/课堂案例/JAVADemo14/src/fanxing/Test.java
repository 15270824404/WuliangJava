package fanxing;

import java.util.ArrayList;
import java.util.List;

import list.Student;
import map.xiaoji4.Book;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// ����������list���Ͽ��Դ����κζ���
		List list = new ArrayList();
		list.add("JAVA�����̳�"); // �ڼ���������ַ���
		list.add(3); // �ڼ������������
		list.add(new Student()); // �ڼ��������Student����
		list.add(new Book()); // �ڼ��������Book����
		for (int i = 0; i < list.size(); i++) {
			list.get(i);// ������ȡ����Ԫ�ص����������޷�ȷ��
		}
	}
}
