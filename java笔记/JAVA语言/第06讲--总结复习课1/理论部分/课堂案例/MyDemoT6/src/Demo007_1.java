import java.util.Scanner;

/*
 * �ӿ���̨����һ����Ȼ�����ж��ǲ�������
 * ˼·1��
 * 1�������֤���������Ȼ�����Ա�����1�������������������Ȼ������������������Ȼ����������
 * 2��ֻ��Ҫ�ж�2��n-1֮������ּ��ɣ���Ϊ����ѧ��n�����ܱ�����n����������
 */
public class Demo007_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �ӿ���̨�����������Ȼ��
		System.out.print("������һ����Ȼ����س���");
		int number = input.nextInt();
		// �����������ڱ���Ҫ�������Ϣ
		String message = "����һ��������";
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				message = "�ⲻ��һ��������";
				break;//һ�����ֲ����������Ͳ������ж���ȥ�ˡ�ֱ���˳�ѭ����
			}
		}
		// �����Ϣ
		System.out.println(message);
	}
}
