/**
 * School类
 */
public class School {
	// 定义学校的属性
	String schoolName; // 学校的名称
	int classNum; // 教学楼的数目
	int teacherNum; // 教师的数目

	// 定义学校的方法
	public void showMessage() {
		System.out.println(schoolName + "\t" + "拥有：" + classNum + "栋教学楼\t"
				+ teacherNum + "位教师");
	}
}
