package shangji.zouye4;

import java.util.*;

public class HashMapTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("bookName", "java oop");
		map.put("author", "john");
		map.put("price", 50); // �Զ�װ��
		map.put("price", 80); // �����ظ��ļ�:price
		map.put(null, "nothing"); // �ռ�
		Collection col = map.values(); // ȡ��Map��ȫ����value
		Iterator iterator = col.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
