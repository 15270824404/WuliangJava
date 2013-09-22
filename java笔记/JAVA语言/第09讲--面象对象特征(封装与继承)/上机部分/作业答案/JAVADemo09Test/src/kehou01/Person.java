package kehou01;

/*
 * 建立Person类, 
 * 提供私有属性name（姓名）、age（年龄）、gender（性别），
 * 其中gender属性的类型是boolean（true表示男性，false表示女性），
 * 提供属性对应的getter与setter方法
 * 提供marry()返回类型为boolean，
 * 如果能结婚返回为true，否则返回为false（结婚的条件是年龄大于等于22岁）
 * 建立测试类MarryTest,创建多个Person类的实例
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
	 * 判断能否结婚
	 */
	public boolean marry() {
		if (this.age >= 22)
			return true;
		else
			return false;
	}

}
