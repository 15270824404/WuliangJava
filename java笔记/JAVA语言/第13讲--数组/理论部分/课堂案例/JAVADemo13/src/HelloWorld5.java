/**
 *HelloWorld5.java  ����Java�ڲ�������λѧ������߷�
 */


import java.util.*;

public class HelloWorld5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������
		int[] score = new int[5];
		int max;

		// ѭ�������鸳ֵ
		System.out.println("������¼��5λѧ����Java�ɼ�:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
		}

		// ����ɼ����ֵ
		max = score[0];
		for (int index = 1; index < 5; index++) {
			if (score[index] > max) {
				max = score[index];
			}
		}

		// ��ʾ���ֵ
		System.out.println("���ο��Ե���λѧ������߷��ǣ� " + max);
	}
}
