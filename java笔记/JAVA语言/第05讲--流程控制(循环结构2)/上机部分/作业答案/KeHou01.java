/*
 * JAVA��5�����κ���ҵ1��
 * 1��10֮���������ӣ�����ۼ�ֵ����20�ĵ�ǰ����
 */
public class KeHou01 {
	public static void main(String[] args) {
		int sum = 0; // ��
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // �ۼ�
			if (sum > 20) {
				System.out.print("��ǰ����:" + i);
				break;
			}
		}
	}
}