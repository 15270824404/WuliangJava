public class Test {

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* 创建一个学生对象 */
		Student stu = new Student();
		stu.name = "张三";
		stu.age = 20;
		stu.hobby = "网球";
		stu.classNo = "中兴3G 09级01班";
		System.out.println(stu);

		/* 创建一个教师对象 */
		Teacher tea = new Teacher();
		tea.name = "张三丰";
		tea.course = "JAVA基础教程";
		tea.dep = "Java/J2EE";
		tea.teaYear = 8;
		System.out.println("\n" + tea);

	}
}
