/*
 * ��4�����ϻ���ҵ2
 * ʵ��������ת��
 * �ӿ���̨����һ��������Ȼ�������ת�����
 */
public class Zuoye2 {
	public static void main(String[] args) {
		int num = 12345; // ��ʾԭ��������
		int digit; // ��ʾ��λ������
		System.out.print("��ת��������ǣ�");
		while (num != 0) {
			digit = num % 10;
			System.out.print(digit);
			num = num / 10;
		}
	}
}
