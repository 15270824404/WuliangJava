import java.util.Scanner;

/**
 * Demo010.java ��ʾbreak,¼������˳�
 */
public class Demo010 {
	public static void main(String[] args) {
		int score; // ÿ�ſεĳɼ�
		int sum = 0; // �ɼ�֮��
		int avg; // ƽ����
		boolean wrong = true;//����һ��������Ϊ��ǣ�����ʱ������Ϊfalse
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������: ");
		String name = input.next(); // ��������

		for (int i = 0; i < 5; i++) { // ѭ��5��¼��5�ſγɼ�
			System.out.print("������5�Ź����е�" + (i + 1) + "�ſεĳɼ��� ");
			score = input.nextInt();
			if (score < 0) {
				wrong = false;//����
				break;//�˳�ѭ��
			}
			sum = sum + score;
		}

		if (wrong) {//��wrong����Ϊtrueʱ��˵��û�д��������Ӧ����
			avg = sum / 5; // ����ƽ����
			System.out.println(name + "��ƽ�����ǣ�" + avg);
		} else {//����˵���д����������������ʾ
			System.out.println("��Ǹ������¼����������½���¼�룡");
		}
	}
}
