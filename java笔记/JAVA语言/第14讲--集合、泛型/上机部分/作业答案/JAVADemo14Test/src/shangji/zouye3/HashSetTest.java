package shangji.zouye3;

import java.util.*;

public class HashSetTest {

	public static void main(String args[]) {
		// 使用泛型
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("pear");
		set.add("pear");// 重复元素不能加入
		set.add("banana");
		// 获取set集合的迭代器
		Iterator<String> iterator = set.iterator();
		// 从迭代器中取出元素
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
