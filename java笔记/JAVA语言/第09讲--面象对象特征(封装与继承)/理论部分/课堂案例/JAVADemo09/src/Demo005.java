class Person05 {
	// Person���ĸ�����
	private String name;
	private String address;
	private String sex;
	private int age;

	//���ĸ������Ĺ��췽��
	public Person05(String name, String address, String sex, int age) {		
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.setAge(age);//���÷�װ�ķ�������ʵ�ֶ����������
		//this.age = age;
	}

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
 * Person����һ�����췽����
 * �ڴ�������ʱ����ʹ��������췽����
 * ���û���ṩ����������ͻ���ֱ������
 * ���Լ�ʱ����
 */
public class Demo005 {
	public static void main(String[] args) {
		Person05 person = new Person05("����","����","��",23);
		System.out.println(person.sayHai());
	}
}