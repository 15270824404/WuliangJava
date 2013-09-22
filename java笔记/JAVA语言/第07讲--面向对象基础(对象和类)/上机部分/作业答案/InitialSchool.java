/**
 * 测试类
 */
public class InitialSchool {
	public static void main(String[] args) {
		School center = new School(); // 创建 School对象
		System.out.println("***初始化成员变量前***\n");
		center.showMessage();
		center.schoolName = "襄樊学院";
		center.classNum = 100;
		center.teacherNum = 2000;
		System.out.println("***初始化成员变量后***\n");
		center.showMessage();
	}
}
