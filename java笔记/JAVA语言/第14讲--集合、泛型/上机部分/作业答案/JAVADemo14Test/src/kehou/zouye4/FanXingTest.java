package kehou.zouye4;
/*
 * �κ���ҵ4
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
		// list.add(" JAVA�����̳�"); //������String����Ԫ�������������
		for (int i = 0; i < list.size(); i++) {
			System.out.print("������" + list.get(i).getStuName() + " ");
			System.out.println("���䣺" + list.get(i).getAge());
		}
	}
}
