package set;

import java.util.*;

public class SetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("apple"); // ���Ԫ��
		set.add("orange"); // ���Ԫ��
		set.add("pear");
		set.add("pear"); // �ظ�Ԫ�ز��ܼ���
		set.add("banana");
		System.out.println(set);
	}
}
