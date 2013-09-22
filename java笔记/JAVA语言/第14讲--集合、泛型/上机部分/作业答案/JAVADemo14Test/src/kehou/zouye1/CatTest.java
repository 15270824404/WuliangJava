package kehou.zouye1;

import java.util.ArrayList;
import java.util.List;

/*
 * 课后作业1
 * a)	创建一个类Cat 
 * 		1.	包含属性name，在构造方法中进行初始化
 * 		2.	添加一个方法show()，用以打印name属性的值
 * b)	创建一个类CatTest，添加main方法，实现
 * 		1.	创建一个ArrayList，向其中添加几个Cat对象
 * 		2.	遍历该集合，并且对每个Cat对象调用show()方法
 */
class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * 打印name属性的值
	 */
	public void show() {
		System.out.println("名字：" + getName());
	}
}

public class CatTest {
	public static void main(String[] args) {
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("小花"));
		list.add(new Cat("小灰"));
		list.add(new Cat("小白"));
		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			((Cat) list.get(i)).show();
		}
	}
}
