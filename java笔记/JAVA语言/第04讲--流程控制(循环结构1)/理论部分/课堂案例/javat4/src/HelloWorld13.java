import java.util.*;
/*
 * ����¼��ѧ�����������롰q����ϵͳ�˳�
 */
public class HelloWorld13 {

	public static void main(String[] args) {
		String name; // ����
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("������ѧ��������");
			name = input.next(); // �ӿ���̨�������������
		} while (!name.equals("q"));

		System.out.println("�������");
	}
}
