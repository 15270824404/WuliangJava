/*
 * 课堂回顾部分
 */
public class Student {
	String name;

	char sex;

	int age;

	public void showMessage() {
		System.out.println(name + "\t" + sex + "\t" + age);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "神仙姐姐";
		s.sex = 'F';
		s.age = 18;
		s.showMessage();
	}
}
