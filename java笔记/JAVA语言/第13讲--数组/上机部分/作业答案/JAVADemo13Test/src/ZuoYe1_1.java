

/*
 *  ��9��������
 *  �ϻ���ҵ1-1��
 *  ��һ�����У�8��4��2��1��23��344��12
 *  1��ѭ��������е�ֵ
 *  2����������������ֵ�ĺ�
 */
public class ZuoYe1_1 {

	public static void main(String[] args) {
		// �����������ڱ�������
		int[] numbers = { 8, 4, 2, 1, 23, 344, 12 };
		// ��������������ֵ�ĺ�
		int sum = 0;
		// ѭ��������е�ֵ����������������ֵ�ĺ�
		System.out.print("�����е���ֵ�У�");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			sum = sum + numbers[i];
		}
		// ���������������ֵ�ĺ�
		System.out.println("\n������������ֵ�ĺ��ǣ�" + sum);
	}

}
