import java.util.Scanner;

/*
 * �ӿ���̨����һ����Ȼ�����ж��ǲ�������
 * ˼·2��
 * 1����ʵֻ��Ҫ�ж�n�Ƿ���Ա�2��n�Ķ��η���֮������ּ���
 * 2��ʹ��Math.sqrt()�������ɣ��˷����������һ�����Ķ��η�����
 */
public class Kehou04_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �ӿ���̨�����������Ȼ��
		System.out.print("������һ����Ȼ����س���");
		int number = input.nextInt();
		// �����������ڱ���Ҫ�������Ϣ
		String message = "����һ��������";
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				message = "�ⲻ��һ��������";
				break;//һ�����ֲ����������Ͳ������ж���ȥ�ˡ�ֱ���˳�ѭ����
			}
		}
		// �����Ϣ
		System.out.println(message);
	}
}
