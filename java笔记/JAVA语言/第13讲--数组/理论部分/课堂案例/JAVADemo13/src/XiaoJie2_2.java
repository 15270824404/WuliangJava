

import java.util.Scanner;

/*
 *  ��12��������
 *  С��2-2��
 *  ��һ�����У�8��4��2��1��23��344��12
 *  3��������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
 */
public class XiaoJie2_2 {

	public static void main(String[] args) {
		// �����������ڱ�������
		int[] numbers = { 8, 4, 2, 1, 23, 344, 12 };
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int temp = input.nextInt();

		// ����һ��boolean���͵ı������ڱ������������Ƿ��������д���
		// �ȼ��費����
		boolean flag = false;
		for (int i = 0; i < numbers.length; i++) {
			// �������ͬ�ģ���������
			if (temp == numbers[i]) {
				flag = true;
				break;// ������ڣ��Ͳ������ж�ʣ�µ���ֵ��
			}
		}
		// �Խ�������ж�
		String result = flag ? "������������������д��ڣ�" : "������������������в����ڣ�";
		System.out.println(result);
	}
}
