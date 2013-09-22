package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list = new ArrayList(); // list接口指向实现类的实例
		Student stu = new Student(); // 实例化Student
		list.add("JAVA基础教程");
		list.add(1); // 自动装箱将int类型自动包装成Integer
		list.add("JSP应用技术");
		list.add(stu); // 添加Student对象
		// 删除前的元素
		System.out.println("删除前的元素");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// 根据索引获取指定位置的元素
		}
		list.remove(stu); // 删除指定的内容
		list.remove(1); // 删除指定位置的元素
		System.out.println("---------------------------");
		// 删除后的元素
		System.out.println("删除后的元素");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// 根据索引获取指定位置的元素
		}
		System.out.println("---------------------------");
		list.removeAll(list); // 删除集合中的所有元素
		System.out.println("最后元素个数是：" + list.size()); // 获取集合中元素的个数
	}
}
