import java.util.Scanner;

/*
 * JAVA��5�����ϻ���ҵ2��
 * ZuoYe02.java ��ʾbreak,¼������˳�
 */
public class ZuoYe02{
	public static void main(String[] args) {
		int score; // ÿ�ſεĳɼ�
		int sum = 0; // �ɼ�֮��
		int avg; // ƽ����
		boolean wrong = true;
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������: ");
		String name = input.next(); // ��������

		for (int i = 0; i < 5; i++) { // ѭ��5��¼��5�ſγɼ�
			System.out.print("������5�Ź����е�" + (i + 1) + "�ſεĳɼ��� ");
			score = input.nextInt();
			if (score < 0) {
				wrong = false;
				break;
			}
			sum = sum + score;
		}

		if (wrong) {
			avg = sum / 5; // ����ƽ����
			System.out.println(name + "��ƽ�����ǣ�" + avg);
		} else {
			System.out.println("��Ǹ������¼����������½���¼�룡");
		}
	}
}
