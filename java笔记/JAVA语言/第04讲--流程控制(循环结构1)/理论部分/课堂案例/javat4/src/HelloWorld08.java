import java.util.Scanner;

/*
 * ���ǳԽ��ӣ�������ο������ԣ�
 * ֻ����ÿ��һ����Ҫ��һ�£���Ҫ��Ҫ����һ����
 * ���Ҫ�ԣ����ٳ�һ����
 * ������ѭ����ֱ������Բ�ͣ����
 * HelloWorld08.java
 */

public class HelloWorld08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ҫ��Ҫ�Խ��ӣ�");
		String answer = input.next();
		while (answer.equals("y")) {
			System.out.println("�Խ��ӡ�");
			System.out.print("���Խ���ô��(y/n)");
			answer = input.next();
		}
	}

}
