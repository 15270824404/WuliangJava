import java.util.*;

/**
 * Demo009.java ��ʾbreak��switch�ṹ�е�Ӧ��
 */
public class Demo009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�鿴�ճ̱����������ڣ�1-5����");
		int day = input.nextInt();

		switch (day) {
		  case 1:
			System.out.println("��ϯIT�Ƽ�չ������ʽ");
			break;
		  case 2:
			System.out.println("�ɵ���۲μ���̫������");
			break;
		  case 3:
			System.out.println("�����������ۺ���԰");
			break;
		  case 4:
			System.out.println("�־��ٿ���˾�¶ȹɶ����");
			break;
		  case 5:
			System.out.println("����ʱ��");
			break;
		}
	}
}
