class Person {
	private String name; // ����
	private String address = "����"; // ��ַ������Ĭ��ֵ

	// ���췽�������Ƿ������صĵ���ʾ��
	public Person(String name) {
		this.name = name; // �趨����
	}

	public Person(String name, String address) {
		this.name = name; // �趨����
		this.address = address; // �趨��ַ
	}

	public String sayHai() {
		return "��Һã�����" + address + "��" + name;
	}
}

/*
 * ������
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("����"); // ��ַʹ��Ĭ��ֵ
		System.out.println(person1.sayHai());

		Person person2 = new Person("����", "���");
		System.out.println(person2.sayHai());
	}
}
