class Person04 {
	// Person���ĸ�����
	private String name;
	private String address;
	private String sex;
	private int age;

	// �����Ƕ����Եķ�װ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

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

	public String sayHai() {
		return "��Һã����ǣ�"+this.name+"���ҽ��꣺"+this.age+"�꣬�Ա�"+this.sex+"����ַ�ǣ�"+this.address;
	}
}
/*
 * Person����̫������Լ���Ӧ��setter������
 * �ڳ�ʼ��ʱ�������׾�������
 * ���´���û�г�ʼ����ַ
 * ���Ե�ַ����String���͵�Ĭ��ֵ��null
 */
public class Demo004 {
	public static void main(String[] args) {
		Person04 person = new Person04();
		person.setName("����");
		person.setAge(23);
		person.setSex("��");
		System.out.println(person.sayHai());
	}
}


