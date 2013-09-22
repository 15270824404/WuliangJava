class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
	}
}

class Teacher {
	private String name;
	private String address;

	public Teacher(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
		System.out.println("我的工作是教学工作！");
	}
}

class Student {
	private String name;
	private String address;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!我是来自于:" + address + "的" + name);
		System.out.println("我的工作是学习知识！");
	}
}
