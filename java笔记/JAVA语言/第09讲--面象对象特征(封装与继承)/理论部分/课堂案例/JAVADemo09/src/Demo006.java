/*
 * ����
 */
class Person06 {
	// �ڸ����ж���name����
	public String name = "person";

	// �ڸ����ж���ķ���
	public void getInfo() {
		System.out.println("this is a person");
	}
}

/*
 * ����
 */
class Child extends Person06 {
	// �������ж��������
	public int age;

	// �������ж���ķ���
	public void play() {
	}
}

/*
 * ������
 */
public class Demo006 {

	public static void main(String[] args) {
		// �����������
		Child child = new Child();
		// System.out.println("������ʸ��ඨ������ԣ�");
		System.out.println(child.name);
		// System.out.println("������ø��ඨ��ķ�����");
		child.getInfo();
	}
}
