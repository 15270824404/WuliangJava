import java.util.Scanner;

/*
 * �����ȿ�һ�������е����ӣ�
 * ���ǳԽ��ӣ����Ҫ�ȳ�һ����һ�£�
 * Ȼ������û�гԱ������û�гԱ���
 * ���ٳ�һ����ÿ��һ��������û�гԱ���
 * �Իش�����жϣ�ֻҪ�ش���ǣ���y����
 * �Ͳ����ˣ�Ҳ����ѭ��������
 * �ش��˷񣺡�n���ͽ��ųԣ�
 * Ҳ����ѭ��Ҫ������ 
 */
public class HelloWorld12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//�����������ڽ����û�������
		String answer;
		do {
			System.out.println("����һ�����ӣ�");
			System.out.print("�Ա���û�У�(y/n)��");
			//�����û�����
			answer = input.next();
			
		} while (!answer.equals("y"));//���û���������жϣ����ǡ�y����ѭ��
		System.out.println("���Խ����ˣ�");
	}
}
