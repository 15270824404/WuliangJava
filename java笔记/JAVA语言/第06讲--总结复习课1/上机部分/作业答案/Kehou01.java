/*
 *ˮ�ɻ���ָ��λ���У�ÿ�����ֵ������͵�����������֣�
 *���磺370��3��3��3+ 7��7��7+ 0��0��0=370��
 *���������ˮ�ɻ���
 */
public class Kehou01 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {// ѭ��������λ��
			int a = i % 10;// ȡ����λ����
			int b = i / 10 % 10;// ȡ��ʮλ����
			int c = i / 100;// ȡ����λ����
			// �����ж�
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}
		}
	}
}
