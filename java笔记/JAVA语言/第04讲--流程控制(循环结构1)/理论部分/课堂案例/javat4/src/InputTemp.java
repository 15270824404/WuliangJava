import java.util.Scanner;

/*
 * ������һ��������ʵ��һ�����ּ����������ܹ����ǣ�
 * ���ܽ�� = ������*10+5��/2 + 3.14159
 * ���ܽ����Ϊһ����
 */
public class InputTemp {

	/**
	 * ���ߣ��ӻ��� ���ڣ�2010�C7�C18 ��������������һ��������ʵ�ּ���
	 */
	public static void main(String[] args) {
		int num;
		System.out.println("������һ������������ʵ�ּ���");
		// �ӿ���̨����һ����
		Scanner input = new Scanner(System.in);
		// ��nextInt()������ȡ����̨�����һ������
		num = input.nextInt();
		// ͨ�����ܹ�ʽ�ó����
		int result = (int) ((num * 10 + 5) / 2 + 3.14159);
		// ������ּ����ܺ�Ľ��
		System.out.println(num + "ʵ�ּ��ܺ�Ľ��Ϊ��" + result);
	}

}
