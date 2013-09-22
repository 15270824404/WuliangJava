package kehou02;

/*
 * 创建父类Man、子类Father，使用extends关键字建立继承关系
 * 
 * 建立Man类，提供属性name、sex，方法：getInfo()，实现显示本类信息
 * 为Man类创建带参数的构造方法
 */
public class Man {
	private String name;
	private String sex;

	/*
	 * 带参数的构造方法
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
		System.out.println("姓名：" + name + "\n性别：" + sex);
	}
}
