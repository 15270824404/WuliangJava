package kehou02;

/*
 * ��������Man������Father��ʹ��extends�ؼ��ֽ����̳й�ϵ
 * 
 * ����Man�࣬�ṩ����name��sex��������getInfo()��ʵ����ʾ������Ϣ
 * ΪMan�ഴ���������Ĺ��췽��
 */
public class Man {
	private String name;
	private String sex;

	/*
	 * �������Ĺ��췽��
	 */
	public Man(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void getInfo() {
		System.out.println("������" + name + "\n�Ա�" + sex);
	}
}
