package kehou.zouye4;
/*
 * 课后作业4
 */
import java.util.ArrayList;
import java.util.List;

public class FanXingTest {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student();
		stu1.setStuName("tom");
		stu1.setAge(20);
		Student stu2 = new Student();
		stu2.setStuName("john");
		stu2.setAge(19);
		list.add(stu1);
		list.add(stu2);
		// list.add(" JAVA基础教程"); //不允许将String类型元素添加至集合中
		for (int i = 0; i < list.size(); i++) {
			System.out.print("姓名：" + list.get(i).getStuName() + " ");
			System.out.println("年龄：" + list.get(i).getAge());
		}
	}
}
