package set;

import java.util.*;

public class SetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("apple"); // 添加元素
		set.add("orange"); // 添加元素
		set.add("pear");
		set.add("pear"); // 重复元素不能加入
		set.add("banana");
		System.out.println(set);
	}
}
