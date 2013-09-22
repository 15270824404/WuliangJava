/*
 * 访问修饰符
 */
class Person03 {
	private String name = "张三";
	protected String address = "湖北";
	String sex = "男";
	public int age = 0;
}

public class Demo003 {
	public String grade;

	public static void main(String args[]) {
		Person03 person = new Person03();
		// 编译错误,无法在类的外部访问私有属性
		System.out.println(person.name);
		System.out.println(person.address);
		System.out.println(person.sex);
		System.out.println(person.age);
	}
}
