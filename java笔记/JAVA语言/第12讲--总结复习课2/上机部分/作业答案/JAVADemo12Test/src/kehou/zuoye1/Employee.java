package kehou.zuoye1;

/*
 * ��дһ���������ڴ���һ����ΪEmployee�ĸ����������ΪManager��Director������
 * Employee�����3�����Ժ�һ������
 * ����Ϊ��name��basic��address
 * ��������show()������ʾ��Щ���Ե�ֵ
 * Manager�������������ԣ�department(����)
 * Director�������������ԣ�transportAllowance(��ͨ����)
 * ����Manager���Director��Ķ��󣬲���ʾ����ϸ��Ϣ
 */
public class Employee {
	private String name;
	private double basic;
	private String address;

	public void show() {
		System.out.println("������" + getName() + "\t�������ʣ�" + getBasic() + "\t��ַ��"
				+ getAddress());
	}

	public Employee(String name, double basic, String address) {
		this.name = name;
		this.basic = basic;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
