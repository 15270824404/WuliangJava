package kehou.zuoye1;

/*
 * Manager类具有自身的属性：department(部门)
 */
public class Manager extends Employee {
	private String department;

	public void show() {
		System.out.println("姓名：" + getName() + "\t基本工资：" + getBasic() + "\t地址："
				+ getAddress() + "\t部门：" + getDepartment());
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
