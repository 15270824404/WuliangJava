
/**
 * Kehou2.java �ϻ���3�����κ���ҵ2��ʹ��if-else�ṹ
 */
public class Kehou2 {

	public static void main(String[] args) {
		/* ��������� */
		int random = (int) (Math.random() * 10);

		//��������
		int number =1234;

		/* �ֽ���number�İ�λ */
		int baiwei = number / 100 % 10;

		/* �ж��Ƿ����������� */
		if (baiwei == random) {
			System.out.println(number + "���������֣�����ǿ��");
		} else {
			System.out.println(number + "  �������ԣ�");
		}
	}
}
