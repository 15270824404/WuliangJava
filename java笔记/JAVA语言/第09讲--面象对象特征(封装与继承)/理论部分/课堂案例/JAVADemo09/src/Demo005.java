class Person05 {
	// Person的四个属性
	private String name;
	private String address;
	private String sex;
	private int age;

	//带四个参数的构造方法
	public Person05(String name, String address, String sex, int age) {		
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.setAge(age);//调用封装的方法，以实现对年龄的限制
		//this.age = age;
	}

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
 * Person类有一个构造方法，
 * 在创建对象时，将使用这个构造方法，
 * 如果没有提供所需参数，就会出现编译错误
 * 可以及时提醒
 */
public class Demo005 {
	public static void main(String[] args) {
		Person05 person = new Person05("张三","北京","男",23);
		System.out.println(person.sayHai());
	}
}