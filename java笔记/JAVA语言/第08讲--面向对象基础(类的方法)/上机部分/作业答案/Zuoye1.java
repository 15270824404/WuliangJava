/*
 * ��8��
 * ��ҵ1
 * Ҫ��
 * 1���ӿ���̨����һ��С��
 * 2����д��С����������������ķ���
 * 3����׼ʹ��API���ֳɵķ���
 * ˼·��
 * 1����double���ͱ��� �ӿ���̨����һ��С��
 * 2�������յ���С������10��ȡ����λ����ģ���㣩
 * 3���Ը�λ�����ֽ����жϣ�
 * ���С��5�ͶԽ��յ�С������ǿ������ת��Ϊint����
 * �������5�ͶԽ��յ�С����1�����ǿ������ת��Ϊint����
 */
import java.util.Scanner;

public class Zuoye1 {
	// ����ת���ķ�����ֱ���ڷ����ڴ����������񣬲���Ҫ����ֵ
	public void convert() {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		// ���տ���̨������
		double number = input.nextDouble();
		// ȡ����λ
		int ge = ((int) (number * 10)) % 10;
		// �Ը�λ�����жϡ�����������ʹ������Ԫ�������Ҳ����ʹ��if...else...�ṹ
		int result = ge < 5 ? (int) number : (int) (number + 1);
		// ��������Ϣ
		System.out.println(number + "�����������������ǣ�" + result);
	}

	// ��ڷ���
	public static void main(String[] args) {
		// ��������
		Zuoye1 z = new Zuoye1();
		// ���ö���ķ���
		z.convert();
	}
}
