public class NewPerson {
	private String name;
	private String address;

	public NewPerson(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
	}
}

class Teacher extends NewPerson {

	public Teacher(String name, String address) {
		super(name, address);
	}

	public void sayHai() {
		super.sayHai();
		System.out.println("我的工作是教学工作！");
	}
}

class Student extends NewPerson {

	public Student(String name, String address) {
		super(name, address);
	}

	public void sayHai() {
		super.sayHai();
		System.out.println("我的工作是学习知识！");
	}
}
