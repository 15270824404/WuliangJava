/**
 *HelloWorld1_1.java
 *����0901���һ��Java�ڲ����Ե�ƽ���ɼ�(ʹ�õ�����ֵ)
 */



public class HelloWorld1_1 {

	/**
	 * @param args
	 *            String[]
	 */
	public static void main(String[] args) {
		// ��������
		int[] score = new int[5]; // �ɼ�����
		int sum = 0; // �ɼ��ܺ�
		double avg; // �ɼ�ƽ��ֵ

		// �����龲̬��ֵ
		score[0] = 60;
		score[1] = 80;
		score[2] = 90;
		score[3] = 70;
		score[4] = 85;

		// ����ƽ��ֵ
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// ��ʾ������
		System.out.println("0901��Java�ڲ����Գɼ�ƽ�����ǣ� " + avg);
	}
}
