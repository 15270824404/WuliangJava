/**
 *HelloWorld6.java  ��������5λѧԱ��Java�ɼ�
 */


import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld6 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] score = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ���");
		for (int i = 0; i < 5; i++) {
			score[i] = input.nextInt(); // ����¼��5λѧԱ�ĳɼ�
		}

		Arrays.sort(score); // �����������������
		System.out.println("ѧԱ�ɼ�����������");
		for (int index = 0; index < score.length; index++) {
			System.out.println(score[index]); // ˳�����Ŀǰ�����е�Ԫ��
		}
	}
}
