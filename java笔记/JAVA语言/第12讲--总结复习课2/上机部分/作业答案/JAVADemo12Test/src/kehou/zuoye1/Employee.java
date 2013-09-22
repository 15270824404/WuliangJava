package kehou.zuoye1;

/*
 * 编写一个程序，用于创建一个名为Employee的父类和两个名为Manager和Director的子类
 * Employee类包含3个属性和一个方法
 * 属性为：name、basic、address
 * 方法名：show()用于显示这些属性的值
 * Manager类具有自身的属性：department(部门)
 * Director类具有自身的属性：transportAllowance(交通津贴)
 * 创建Manager类和Director类的对象，并显示其详细信息
 */
public class Employee {
	private String name;
	private double basic;
	private String address;

	public void show() {
		System.out.println("姓名：" + getName() + "\t基本工资：" + getBasic() + "\t地址："
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
