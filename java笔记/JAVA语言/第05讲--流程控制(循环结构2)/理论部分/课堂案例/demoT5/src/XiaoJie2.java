/*
 * С��2��
 * 1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��
 */
public class XiaoJie2 {
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