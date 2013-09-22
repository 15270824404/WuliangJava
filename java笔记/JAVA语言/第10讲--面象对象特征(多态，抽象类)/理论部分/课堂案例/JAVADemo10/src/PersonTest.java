class Person {
	private String name; // 姓名
	private String address = "北京"; // 地址——有默认值

	// 构造方法重载是方法重载的典型示例
	public Person(String name) {
		this.name = name; // 设定姓名
	}

	public Person(String name, String address) {
		this.name = name; // 设定姓名
		this.address = address; // 设定地址
	}

	public String sayHai() {
		return "大家好！我是" + address + "的" + name;
	}
}

/*
 * 测试类
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("张三"); // 地址使用默认值
		System.out.println(person1.sayHai());

		Person person2 = new Person("李四", "天津");
		System.out.println(person2.sayHai());
	}
}
