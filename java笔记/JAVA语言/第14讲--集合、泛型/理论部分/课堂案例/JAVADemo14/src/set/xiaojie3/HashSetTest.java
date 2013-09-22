package set.xiaojie3;

import java.util.*;

public class HashSetTest {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("apple");
		set.add("orange");
		set.add("pear");
		set.add("pear");// 重复元素不能加入
		set.add("banana");
		// 获取set集合的迭代器
		Iterator iterator = set.iterator();
		// 从迭代器中取出元素
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
