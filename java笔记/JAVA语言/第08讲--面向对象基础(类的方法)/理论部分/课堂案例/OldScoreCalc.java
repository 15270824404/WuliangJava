import java.util.Scanner;

public class OldScoreCalc {

	/**
	 * ����ƽ���ֺ��ܳɼ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* ���ճɼ� */
		Scanner input = new Scanner(System.in);
		System.out.print("������Java�ɼ���");
		int java = input.nextInt();
		System.out.print("������HTML�ɼ���");
		int html = input.nextInt();
		System.out.print("������SQL�ɼ���");
		int sql = input.nextInt();

		/* ���㲢��ʾ��� */
		int total = java + sql + html;
		double avg = total / 3;
		System.out.print("�ܳɼ���" + total);
		System.out.print("\nƽ����: " + avg);
	}
}
