/*
 * 用于描述“人”的类
 * 没有封装属性的情况
 */
class Person01 {
	public String name = "tom";
	public int age = 20;

	public void salaryInfo() {
		System.out.println("大家好，我是：" + name + "\t年龄是：" + age);
	}
}

/*
 * 测试类
 */
public class Demo001 {
	public static void main(String args[]) {
		// 创建“人”类对象
		Person01 person = new Person01();
		// 为人类对象的属性赋值————很明显，这个值不符合实际情况：没有人的年龄会是1000
		person.age = 1000;
		person.salaryInfo();
	}
}
