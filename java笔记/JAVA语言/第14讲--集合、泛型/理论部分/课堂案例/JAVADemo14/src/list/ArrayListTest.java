package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list = new ArrayList(); // list�ӿ�ָ��ʵ�����ʵ��
		Student stu = new Student(); // ʵ����Student
		list.add("JAVA�����̳�");
		list.add(1); // �Զ�װ�佫int�����Զ���װ��Integer
		list.add("JSPӦ�ü���");
		list.add(stu); // ���Student����
		// ɾ��ǰ��Ԫ��
		System.out.println("ɾ��ǰ��Ԫ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// ����������ȡָ��λ�õ�Ԫ��
		}
		list.remove(stu); // ɾ��ָ��������
		list.remove(1); // ɾ��ָ��λ�õ�Ԫ��
		System.out.println("---------------------------");
		// ɾ�����Ԫ��
		System.out.println("ɾ�����Ԫ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// ����������ȡָ��λ�õ�Ԫ��
		}
		System.out.println("---------------------------");
		list.removeAll(list); // ɾ�������е�����Ԫ��
		System.out.println("���Ԫ�ظ����ǣ�" + list.size()); // ��ȡ������Ԫ�صĸ���
	}
}
