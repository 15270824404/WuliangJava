import java.util.*;

/**
 * KeHou2.java �ϻ���4�����κ���ҵ2��
 */
public class KeHou2 {
	public static void main(String[] args) {
		/* ��������� */
		int random = (int) (Math.random() * 10);
		String answer;
		do {
			/* �Ӽ��̻�ȡһ��4λ���� */
			System.out.print("������4λ������ ");
			Scanner input = new Scanner(System.in);
			int custNo = input.nextInt();

			/* �ֽ��ð�λ */
			int baiwei = custNo / 100 % 10;

			/* �ж��Ƿ����������� */
			if (baiwei == random) {
				System.out.println(custNo + "  �����֣�����ǿ��");
			} else {
				System.out.println(custNo + "  лл��");
			}
			/* ��ʾ�Ƿ���� */
			System.out.print("\n�Ƿ������y/n��: ");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\n���������");
	}
}
