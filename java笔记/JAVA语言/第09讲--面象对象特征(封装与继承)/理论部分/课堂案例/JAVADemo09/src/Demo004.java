class Person04 {
	// Person的四个属性
	private String name;
	private String address;
	private String sex;
	private int age;

	// 以下是对属性的封装
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	// 在属性封装中将年龄限制在0～100之间
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("年龄必须在0～100之间，将使用默认值！");
		} else {
			this.age = age;
		}
	}

	public String sayHai() {
		return "大家好！我是："+this.name+"，我今年："+this.age+"岁，性别："+this.sex+"，地址是："+this.address;
	}
}
/*
 * Person中有太多的属性及对应的setter方法，
 * 在初始化时，很容易就忘记了
 * 以下代码没有初始化地址
 * 所以地址就是String类型的默认值：null
 */
public class Demo004 {
	public static void main(String[] args) {
		Person04 person = new Person04();
		person.setName("张三");
		person.setAge(23);
		person.setSex("男");
		System.out.println(person.sayHai());
	}
}


