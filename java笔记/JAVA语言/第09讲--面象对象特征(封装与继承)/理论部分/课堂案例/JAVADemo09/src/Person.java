/*
 * 在没有使用继承时，当相似的类增加时，
 * 每个类都必须描述所有的属性和方法
 * 造成代码的重复，扩展性变差
 */
public class Person {

}

/*
 * 教师
 */
class Teacher {
	private String name;
	private String address;

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
	}
}

/*
 * 学生
 */
class Student {
	private String name;
	private String address;

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
	}
}

/*
 * 清洁工
 */
class Cleaner {
	private String name;
	private String address;

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
	}
}
