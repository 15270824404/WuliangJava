public class Test {

	/**
	 * ����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* ����һ��ѧ������ */
		Student stu = new Student();
		stu.name = "����";
		stu.age = 20;
		stu.hobby = "����";
		stu.classNo = "����3G 09��01��";
		System.out.println(stu);

		/* ����һ����ʦ���� */
		Teacher tea = new Teacher();
		tea.name = "������";
		tea.course = "JAVA�����̳�";
		tea.dep = "Java/J2EE";
		tea.teaYear = 8;
		System.out.println("\n" + tea);

	}
}
