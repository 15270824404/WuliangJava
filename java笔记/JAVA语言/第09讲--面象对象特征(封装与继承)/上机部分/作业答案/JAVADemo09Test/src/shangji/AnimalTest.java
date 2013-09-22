package shangji;

/*
 * 上机作业3
 * 
 * 请编码实现动物世界的继承关系：
 * 动物（Animal）具有行为：吃（eat）、睡觉（sleep）
 * 动物包括：兔子（Rabbit），老虎（Tiger）
 * 这些动物吃的行为各不相同（兔子吃草，老虎吃肉）；但睡觉的行为是一致的
 * 请通过继承实现以上需求，并编写测试类AnimalTest进行测试
 */
public class AnimalTest {
	public static void main(String[] args) {
		// 创建兔子对象
		Animal a1 = new Rabbit();
		a1.eat();
		// 创建老虎对象
		Animal a2 = new Tiger();
		a2.eat();
	}
}

/*
 * 动物类
 */
class Animal {
	public void eat() {
		System.out.println("动物在吃东西！");
	}
}

// 兔子类
class Rabbit extends Animal {
	public void eat() {
		System.out.println("兔子吃草！");
	}
}

// 老虎类
class Tiger extends Animal {
	public void eat() {
		System.out.println("老虎吃肉！");
	}
}