package kehou01;

/*
 * ����Person��, 
 * �ṩ˽������name����������age�����䣩��gender���Ա𣩣�
 * ����gender���Ե�������boolean��true��ʾ���ԣ�false��ʾŮ�ԣ���
 * �ṩ���Զ�Ӧ��getter��setter����
 * �ṩmarry()��������Ϊboolean��
 * ����ܽ�鷵��Ϊtrue�����򷵻�Ϊfalse������������������ڵ���22�꣩
 * ����������MarryTest,�������Person���ʵ��
 */
public class Person {
	private String name;
	private int age;
	private boolean gender;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}	

	/*
	 * �ж��ܷ���
	 */
	public boolean marry() {
		if (this.age >= 22)
			return true;
		else
			return false;
	}

}
