import java.util.*;

/**
 * Demo003.java ��ʾforѭ����¼��5�ſγɼ���������ƽ��ֵ
 */
public class Demo003 {
	public static void main(String[] args) {
		int score; // ÿ�ſεĳɼ�
		int sum = 0; // �ɼ�֮��
		int avg; // ƽ����
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������: ");
		String name = input.next(); // ��������

		for (int i = 0; i < 5; i++) { // ѭ��5��¼��5�ſγɼ�
			System.out.print("������5�Ź����е�" + (i + 1) + "�ſεĳɼ��� ");
			score = input.nextInt();
			sum = sum + score;
		}

		avg = sum / 5; // ����ƽ����
		System.out.println(name + "��ƽ�����ǣ�" + avg);
	}
}
