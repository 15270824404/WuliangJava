/*
 * ��9�� ����
 * �κ���ҵ2������1
 * ���ִ�֣�
 * �ڸ質�����У�����10λ��ί���д�֣��ڼ���÷�ʱ��
 * ȥ��һ����߷֣�ȥ��һ����ͷ֣�
 * Ȼ��ʣ��8λ��ί�ķ�������ƽ�����Եõ���ѡ�ֵ����յ÷֡�
 * �Ѿ�10λ��ί�����ķ����ֱ��ǣ�90��78��90��96��67��86��78��92��79��85
 * ���дJAVA�������ڼ����ѡ�ֵ����յ÷�
 * ˼·��
 * �������Ԫ�ص����ֵ����Сֵ������Ԫ�صĺ�
 * ʹ������Ԫ�صĺͼ�ȥ���ֵ ����С ֵ
 * �����õ���ֵ���� 8�����ɻ�����յ÷�
 */
public class KeHou02_1 {

	public static void main(String[] args) {
		// �������鱣�����
		int[] score = { 90, 78, 90, 96, 67, 86, 78, 92, 79, 85 };
		int sum = 0;// �洢ֵ
		int max = score[0];// �洢���ֵ
		int min = score[0];// �洢��Сֵ
		// ���
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// ������ֵ
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		// �����Сֵ
		for (int i = 1; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		// ����ƽ����
		double avg = (sum - max - min) / 8.0;
		System.out.println("ȥ��һ����߷֣�" + max);
		System.out.println("ȥ��һ����ͷ֣�" + min);
		System.out.println("���÷֣�" + avg);

	}

}
