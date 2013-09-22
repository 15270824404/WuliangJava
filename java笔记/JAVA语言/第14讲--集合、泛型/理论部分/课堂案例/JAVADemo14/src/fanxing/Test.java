package fanxing;

import java.util.ArrayList;
import java.util.List;

import list.Student;
import map.xiaoji4.Book;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 这里声明的list集合可以存入任何对象
		List list = new ArrayList();
		list.add("JAVA基础教程"); // 在集合中添加字符串
		list.add(3); // 在集合中添加整数
		list.add(new Student()); // 在集合中添加Student对象
		list.add(new Book()); // 在集合中添加Book对象
		for (int i = 0; i < list.size(); i++) {
			list.get(i);// 这句代码取出的元素的数据类型无法确定
		}
	}
}
