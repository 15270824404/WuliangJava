/*
 * 父类
 */
class Person06 {
	// 在父类中定义name属性
	public String name = "person";

	// 在父类中定义的方法
	public void getInfo() {
		System.out.println("this is a person");
	}
}

/*
 * 子类
 */
class Child extends Person06 {
	// 在子类中定义的属性
	public int age;

	// 在子类中定义的方法
	public void play() {
	}
}

/*
 * 测试类
 */
public class Demo006 {

	public static void main(String[] args) {
		// 创建子类对象
		Child child = new Child();
		// System.out.println("子类访问父类定义的属性：");
		System.out.println(child.name);
		// System.out.println("子类调用父类定义的方法：");
		child.getInfo();
	}
}
