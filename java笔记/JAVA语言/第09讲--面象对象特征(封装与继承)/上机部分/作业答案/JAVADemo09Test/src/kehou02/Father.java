package kehou02;

/*
 * ��������Man������Father��ʹ��extends�ؼ��ֽ����̳й�ϵ
 * 
 * ����Father�࣬�ṩ����age��telephone��address��������getFatherInfo()��ʵ����ʾ������Ϣ
 * ΪFather�ഴ���������Ĺ��췽��
 * ʹ��extends�ؼ��ֽ����̳й�ϵ(Man��Father��ĸ���)
 */
public class Father extends Man {

	private int age;
	private String telephone;
	private String address;

	/*
	 * �������Ĺ��췽��
	 */
	public Father(String name, String sex, int age, String telephone,
			String address) {
		// ���ø���Ĺ��췽��
		super(name, sex);
		this.age = age;
		this.telephone = telephone;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getFatherInfo() {
		super.getInfo();// ���ø���ķ���
		System.out.println("���䣺" + age + "\n�绰��" + telephone + "\n��ַ��"
				+ address);
	}
}
