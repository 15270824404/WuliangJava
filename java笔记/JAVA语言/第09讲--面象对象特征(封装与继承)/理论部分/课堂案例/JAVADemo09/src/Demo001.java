/*
 * �����������ˡ�����
 * û�з�װ���Ե����
 */
class Person01 {
	public String name = "tom";
	public int age = 20;

	public void salaryInfo() {
		System.out.println("��Һã����ǣ�" + name + "\t�����ǣ�" + age);
	}
}

/*
 * ������
 */
public class Demo001 {
	public static void main(String args[]) {
		// �������ˡ������
		Person01 person = new Person01();
		// Ϊ�����������Ը�ֵ�������������ԣ����ֵ������ʵ�������û���˵��������1000
		person.age = 1000;
		person.salaryInfo();
	}
}
