class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!����������:" + address + "��" + name);
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
		System.out.println("hello!����������:" + address + "��" + name);
		System.out.println("�ҵĹ����ǽ�ѧ������");
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
		System.out.println("hello!����������:" + address + "��" + name);
		System.out.println("�ҵĹ�����ѧϰ֪ʶ��");
	}
}
