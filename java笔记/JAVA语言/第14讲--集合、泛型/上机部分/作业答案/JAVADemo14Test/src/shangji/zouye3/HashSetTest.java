package shangji.zouye3;

import java.util.*;

public class HashSetTest {

	public static void main(String args[]) {
		// ʹ�÷���
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("pear");
		set.add("pear");// �ظ�Ԫ�ز��ܼ���
		set.add("banana");
		// ��ȡset���ϵĵ�����
		Iterator<String> iterator = set.iterator();
		// �ӵ�������ȡ��Ԫ��
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
