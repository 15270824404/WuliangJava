import java.util.*;

/**
 * HelloWorld07.java ����༶ƽ����
 */
public class HelloWorld07 {
	public static void main(String[] args) {
		String classNo; // �༶��
		int stuNum; // �༶��ѧ������
		int score; // ѧ������
		int sum = 0; // ѧ�������ܺ�
		int avg; // ѧ���ɼ�ƽ��ֵ

		System.out.print("������༶�ţ� ");
		Scanner input = new Scanner(System.in);
		classNo = input.next();

		System.out.print("������ð༶��ѧԱ������");
		stuNum = input.nextInt();

		int i = 1;
		while (i <= stuNum) {
			System.out.print("������ѧ��" + i + "�ĳɼ���");
			score = input.nextInt();
			sum = sum + score;
			i++;
		}
		avg = sum / stuNum;
		System.out.println(classNo + "��ѧԱ��ƽ���ɼ�Ϊ�� " + avg);
	}
}
