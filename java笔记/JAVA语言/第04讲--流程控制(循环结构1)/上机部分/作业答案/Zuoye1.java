/*
 * ��4�����ϻ���ҵ1
 * 2006������ѧԱ8���ˣ�
 * ÿ������25%�����ʰ��������ٶȣ�
 * ����һ����ѵѧԱ�������ﵽ20���ˣ�
 */
public class Zuoye1 {
	public static void main(String[] args) {
		int year = 2006; // ���
		int students = 80000; // ѧ����
		while (students < 200000) {
			students = (int) (students * (1 + 0.25));
			year++;
			System.out.println(year + "�꣬��ѵ " + students + "��");
		}
		System.out.println(year + "�꣬����ѵ�˵���20����");
	}
}
