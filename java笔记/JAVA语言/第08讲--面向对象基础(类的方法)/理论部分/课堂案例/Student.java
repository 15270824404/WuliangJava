/*
 * ���ûع˲���
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
		s.name = "���ɽ��";
		s.sex = 'F';
		s.age = 18;
		s.showMessage();
	}
}
