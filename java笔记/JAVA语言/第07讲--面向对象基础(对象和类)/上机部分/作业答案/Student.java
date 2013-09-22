/**
 * 学生类
 */
public class Student {
	String name; // 姓名
	int age; // 年龄
	String hobby; // 兴趣
	String classNo; // 班级编号

	public void showMessage() {
		System.out.println(name + "\n年龄: " + age + "\n爱好: " + hobby + " \n就读于" + classNo);
	}
}
