/*
 * Person类
 */
class Person08 {
	public String name = "person";

	public void printInfo() {
		System.out.println("this is a person");
	}
}

/*
 * 子类
 */
public class Child08 extends Person08 {
	public void printInfo() {
		System.out.println("this is a child");
	}

	public static void main(String args[]) {
		Person08 person = new Child08(); // 父类引用指向子类对象
		person.printInfo(); // 调用子类中的方法，因为是子类的对象，所以调用的是子类的方法，但在父类中必须定义这个方法
		
		// Child child = (Child)new Person(); //父类对象不能够强制类型转换成子类对象
		
	}
}
