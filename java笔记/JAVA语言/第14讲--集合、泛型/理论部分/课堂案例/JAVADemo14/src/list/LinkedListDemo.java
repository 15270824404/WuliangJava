package list;

import java.util.LinkedList;

public class LinkedListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.add("a"); // �������������
		linkedList.add("b");
		linkedList.add("c");

		linkedList.addFirst("m"); // �������ͷ��������
		linkedList.addLast("n"); // �������β��������
		System.out.println(linkedList); // �����������
	}
}
