/*
 * �ϻ���ҵ2
 * ��̼���8349��λ����֮��
 */
public class Zuoye2 {
	public static void main(String[] args) {
		int number = 8349; 					// ���ֽ������
		int gewei = number % 10; 			// �ֽ��ø�λ��
		int shiwei = number / 10 % 10; 		// �ֽ���ʮλ��
		int baiwei = number / 100 % 10; 	// �ֽ��ð�λ��
		int qianwei = number / 1000; 		// �ֽ���ǧλ��
		int sum = gewei + shiwei + baiwei + qianwei; 	// ���
		System.out.println(number + "��λ֮�ͣ�" + sum);// ������
	}
}
