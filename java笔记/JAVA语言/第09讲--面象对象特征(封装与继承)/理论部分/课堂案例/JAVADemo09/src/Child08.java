/*
 * Person��
 */
class Person08 {
	public String name = "person";

	public void printInfo() {
		System.out.println("this is a person");
	}
}

/*
 * ����
 */
public class Child08 extends Person08 {
	public void printInfo() {
		System.out.println("this is a child");
	}

	public static void main(String args[]) {
		Person08 person = new Child08(); // ��������ָ���������
		person.printInfo(); // ���������еķ�������Ϊ������Ķ������Ե��õ�������ķ��������ڸ����б��붨���������
		
		// Child child = (Child)new Person(); //��������ܹ�ǿ������ת�����������
		
	}
}
