/*
 * �����������ˡ�����
 * �����Խ��з�װ
 */
class Person02 {
	// ˽�е�����
	private String name = "tom";

	// ��name���Խ��з�װ
	// ���ֻ��get��װ������������ֻ����
	// ���ֻ��set��װ������������ֻд��
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ˽�е�����
	private int age = 20;

	// ��age���Խ��з�װ
	public int getAge() {
		return age;
	}

	// �����Է�װ�н�����������0��100֮��
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("���������0��100֮�䣬��ʹ��Ĭ��ֵ��");
		} else {
			this.age = age;
		}
	}

	public void salaryInfo() {
		System.out.println("��Һã����ǣ�" + name + "\t�����ǣ�" + age);
	}
}

/*
 * ������
 */
public class Demo002 {
	public static void main(String args[]) {
		// �������ˡ������
		Person02 person = new Person02();
		person.setName("����");
		String sName = person.getName();
		// Ϊ�����������Ը�ֵ�������������ԣ����ֵ������ʵ�������û���˵��������1000��
		// �������Ϊ�з�װ�����򲻻Ὣ1000��ֵ��age����
		person.setAge(1000);
		person.salaryInfo();
	}
}
