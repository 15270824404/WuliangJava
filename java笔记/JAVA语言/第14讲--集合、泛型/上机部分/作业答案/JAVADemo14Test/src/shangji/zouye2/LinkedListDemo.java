package shangji.zouye2;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// ʹ�÷���
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("a"); // �������������
		linkedList.add("b");
		linkedList.add("c");

		linkedList.addFirst("m"); // �������ͷ��������
		linkedList.addLast("n"); // �������β��������
		System.out.println(linkedList); // �����������
	}
}
