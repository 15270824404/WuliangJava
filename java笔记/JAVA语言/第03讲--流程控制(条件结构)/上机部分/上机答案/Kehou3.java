/*
 * �ϻ���3�����κ���ҵ3��
 * �û�����������a��b��
 * ���a�ܱ�b������a��b����100��
 * �����a���������b
 * Ҫ��ʹ����Ԫ��������
 */
public class Kehou3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		int c = (a % b == 0 || (a + b) > 100) ? a : b;
		System.out.println("�������������ǣ�" + c);

	}
}
