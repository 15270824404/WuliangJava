/*
 * ��ӡͼ�Σ��ڿ���̨�д�ӡͼ��
 * ˼·2��
 * 1���ⲿѭ��Ҫѭ���δ�ӡ5��
 * 2���ڲ�ÿ�д�ӡ�����ַ�������4+�к�
 * 3������ǰ5-�кŸ��ַ��ǿո񣬺������ַ����Ǻ�
 * 4�������ַ���ӡ��ɺ���
 */
public class Kehou03_2 {
	public static void main(String[] args) {
		// ���ѭ��������
		for (int row = 1; row <= 5; row++) {
			// ���� col < 5 - row �����жϣ�Ϊ�����ӡ�ո񣬷����ӡ�Ǻ�
			for (int col = 0; col < 4 + row; col++) {
				System.out.print(col < 5 - row ? ' ' : '*');
			}
			// ����
			System.out.println();
		}
	}
}
