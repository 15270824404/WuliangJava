class Person09 {
	public String name = "张三";
	public int age = 0;
}

public class Child09 extends Person09 {
	public String sex;
	public int age = 2;

	/*
	 * 用super访问父类对象
	 * 用this访问本类对象
	 */
	public void getInfo() {
		System.out.println("父类中的年龄是: " + super.age);
		System.out.println("本类中的年龄是: " + this.age);
	}

	public static void main(String args[]) {
		Child09 child = new Child09();
		child.getInfo();
	}
}
