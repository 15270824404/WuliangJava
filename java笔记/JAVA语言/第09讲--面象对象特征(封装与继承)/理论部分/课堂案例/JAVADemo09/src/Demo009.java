class Person10 {
	public String name; // 姓名

	// 构造方法
	public Person10() {
		name = "无名氏";
	}
}

public class Demo009 {
	public static void main(String[] args) {
		Person10 person = new Person10();
		System.out.println(person.name);
	}
}
