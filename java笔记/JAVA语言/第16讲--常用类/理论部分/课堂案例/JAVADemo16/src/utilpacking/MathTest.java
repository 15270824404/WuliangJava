package utilpacking;

/*
 * ��һ��double���͵���ֵ������������
 * ���������ֵ�бȽϴ��һ����
 */
public class MathTest {
	public static void main(String[] args) {
		double number1 = 123.456;
		double number2 = Math.round(number1);
		System.out.println(number1 + "�������������ǣ�" + number2);
		double max = Math.max(number1, number2);
		System.out.println(number1 + "��" + number2 + "���������бȽϴ�����ǣ�" + max);
	}
}
