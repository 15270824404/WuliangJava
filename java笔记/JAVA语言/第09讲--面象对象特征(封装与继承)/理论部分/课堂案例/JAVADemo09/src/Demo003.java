/*
 * �������η�
 */
class Person03 {
	private String name = "����";
	protected String address = "����";
	String sex = "��";
	public int age = 0;
}

public class Demo003 {
	public String grade;

	public static void main(String args[]) {
		Person03 person = new Person03();
		// �������,�޷�������ⲿ����˽������
		System.out.println(person.name);
		System.out.println(person.address);
		System.out.println(person.sex);
		System.out.println(person.age);
	}
}
