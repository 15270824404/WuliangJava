/**
 *HelloWorld1.java
 *���㼶��Java���Ե�ƽ���ɼ�
 */



public class HelloWorld1 {
	public static void main(String[] args) {
		// ��������
		int[] score = { 60, 80, 90, 70, 85 }; // �ɼ�����
		int sum = 0; // �ɼ��ܺ�
		double avg; // �ɼ�ƽ��ֵ

		// ����ƽ��ֵ
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// ��ʾ������
		System.out.println("Java���Գɼ�ƽ�����ǣ� " + avg);

	}
}
