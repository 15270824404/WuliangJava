package kehou.zuoye2;

import java.util.Scanner;

/*
 * ������1ʱ���Ǻ��
 * ������2ʱ���ǻƵ�
 * ������3ʱ�����̵�
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("������һ����������1�����\t2���Ƶ�\t3���̵ƣ�");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Color color = Color.getColor(number);
		System.out.println("�Ƶ���ɫ�ǣ�" + color);
	}
}
