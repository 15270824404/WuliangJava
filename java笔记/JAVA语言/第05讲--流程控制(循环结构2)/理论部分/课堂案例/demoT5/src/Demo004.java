import java.util.*;

/**
 * Demo004.java ��ʾforѭ���ĸ�����ʽ
 */
public class Demo004 {
	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ֵ�� ");
		int val = input.nextInt();

		System.out.println("�������ֵ����������¼ӷ��� ");
		for (i = 0, j = val; i <= val; i++, j--) {
			System.out.println(i + " + " + j + " = " + (i + j));
		}
	}
}
