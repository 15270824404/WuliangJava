/**
 * KehouZuoye1.java
 * ��2���ϻ����κ���ҵ1
 */

/* 
 * ������������number1��number2��
 * ������������ֵ�ֱ���22��44��
 * ���̽���������������ֵ��
 * �������������������ǰ��ֵ�ͽ������ֵ
 */
public class KehouZuoye1 {
	public static void main(String[] args) {
		int number1 = 22;
		int number2 = 44;
		System.out.println("����ǰ��ֵ��");
		System.out.println("number1�ǣ�" + number1);
		System.out.println("number2�ǣ�" + number2);
		int temp;// ��һ���м�����������м�ֵ
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("�������ֵ��");
		System.out.println("number1�ǣ�" + number1);
		System.out.println("number2�ǣ�" + number2);

	}
}
