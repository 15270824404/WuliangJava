/*
 * 用于描述“人”的类
 * 对属性进行封装
 */
class Person02 {
	// 私有的属性
	private String name = "tom";

	// 对name属性进行封装
	// 如果只有get封装，表明属性是只读的
	// 如果只有set封装，表明属性是只写的
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 私有的属性
	private int age = 20;

	// 对age属性进行封装
	public int getAge() {
		return age;
	}

	// 在属性封装中将年龄限制在0～100之间
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("年龄必须在0～100之间，将使用默认值！");
		} else {
			this.age = age;
		}
	}

	public void salaryInfo() {
		System.out.println("大家好，我是：" + name + "\t年龄是：" + age);
	}
}

/*
 * 测试类
 */
public class Demo002 {
	public static void main(String args[]) {
		// 创建“人”类对象
		Person02 person = new Person02();
		person.setName("张三");
		String sName = person.getName();
		// 为人类对象的属性赋值————很明显，这个值不符合实际情况：没有人的年龄会是1000，
		// 而这里，因为有封装，程序不会将1000赋值给age变量
		person.setAge(1000);
		person.salaryInfo();
	}
}
