package map;

import java.util.*;

public class HashTableTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put("1", null); // ��ֵ
		map.put(null, "JAVA�����̳�"); // �ռ�
		Collection col = map.values();
		Iterator iterator = col.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
