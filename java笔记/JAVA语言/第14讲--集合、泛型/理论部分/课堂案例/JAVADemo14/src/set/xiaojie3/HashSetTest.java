package set.xiaojie3;

import java.util.*;

public class HashSetTest {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("apple");
		set.add("orange");
		set.add("pear");
		set.add("pear");// �ظ�Ԫ�ز��ܼ���
		set.add("banana");
		// ��ȡset���ϵĵ�����
		Iterator iterator = set.iterator();
		// �ӵ�������ȡ��Ԫ��
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
