/**
 *HelloWorld1_2.java
 *����Java�ڲ����Ե�ƽ���ɼ�
 */


import java.util.Scanner;

public class HelloWorld1_2 {

	public static void main(String[] args) {
		// ��������
		int[] score = new int[3]; // �ɼ�����
		int sum = 0; // �ɼ��ܺ�
		double avg; // �ɼ�ƽ��ֵ

		// �����鶯̬��ֵ
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ѧ���ɼ���");
		for (int index = 0; index < score.length; index++) {
			score[index] = sc.nextInt();
		}

		// ����ƽ��ֵ
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// ��ʾ������
		System.out.println("Java�ڲ����Գɼ�ƽ�����ǣ� " + avg);
	}
}
