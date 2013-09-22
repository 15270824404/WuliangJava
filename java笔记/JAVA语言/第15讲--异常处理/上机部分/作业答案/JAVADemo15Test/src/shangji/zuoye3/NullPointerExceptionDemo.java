package shangji.zuoye3;

public class NullPointerExceptionDemo {
	public static void main(String args[]) {
		Student stu = null;
		System.out.println(stu.getName());
	}
}

class Student {
	private String name;
	private int age;

	// 属性对应的getter/setter
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

}
