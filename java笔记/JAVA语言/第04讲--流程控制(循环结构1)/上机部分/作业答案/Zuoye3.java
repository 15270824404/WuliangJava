import java.util.*;
/*
 * ��4�����ϻ���ҵ3
 * ����¼��ѧ�����������롰q����ϵͳ�˳�
 */
public class Zuoye3 {

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
