/**
 * ������
 */
public class InitialSchool {
	public static void main(String[] args) {
		School center = new School(); // ���� School����
		System.out.println("***��ʼ����Ա����ǰ***\n");
		center.showMessage();
		center.schoolName = "�差ѧԺ";
		center.classNum = 100;
		center.teacherNum = 2000;
		System.out.println("***��ʼ����Ա������***\n");
		center.showMessage();
	}
}
