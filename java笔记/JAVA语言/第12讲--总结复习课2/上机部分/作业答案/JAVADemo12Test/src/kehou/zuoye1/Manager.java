package kehou.zuoye1;

/*
 * Manager�������������ԣ�department(����)
 */
public class Manager extends Employee {
	private String department;

	public void show() {
		System.out.println("������" + getName() + "\t�������ʣ�" + getBasic() + "\t��ַ��"
				+ getAddress() + "\t���ţ�" + getDepartment());
	}

	public Manager(String name, double basic, String address, String department) {
		super(name, basic, address);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
