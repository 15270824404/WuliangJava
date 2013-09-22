package kehou02;

/*
 * 创建父类Man、子类Father，使用extends关键字建立继承关系
 * 
 * 建立Father类，提供属性age、telephone、address，方法：getFatherInfo()，实现显示本类信息
 * 为Father类创建带参数的构造方法
 * 使用extends关键字建立继承关系(Man是Father类的父类)
 */
public class Father extends Man {

	private int age;
	private String telephone;
	private String address;

	/*
	 * 带参数的构造方法
	 */
	public Father(String name, String sex, int age, String telephone,
			String address) {
		// 调用父类的构造方法
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
		super.getInfo();// 调用父类的方法
		System.out.println("年龄：" + age + "\n电话：" + telephone + "\n地址："
				+ address);
	}
}
