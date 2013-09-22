public class NewPerson {
	private String name;
	private String address;

	public NewPerson(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void sayHai() {
		System.out.println("hello!����������:" + address + "��" + name);
	}
}

class Teacher extends NewPerson {

	public Teacher(String name, String address) {
		super(name, address);
	}

	public void sayHai() {
		super.sayHai();
		System.out.println("�ҵĹ����ǽ�ѧ������");
	}
}

class Student extends NewPerson {

	public Student(String name, String address) {
		super(name, address);
	}

	public void sayHai() {
		super.sayHai();
		System.out.println("�ҵĹ�����ѧϰ֪ʶ��");
	}
}
