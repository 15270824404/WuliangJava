/**
 * 教师类
 */
public class Teacher {
	String name; // 姓名
	String course; // 教授课程
	String dep; // 专业方向
	int teaYear; // 教龄

	public void showMessage() {
		System.out.println(name + "\n教授课程：" + course + "\n主攻方向： " + dep + "\n教龄：" + teaYear);
	}
}
