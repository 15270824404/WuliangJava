package xiaojie2;

import java.util.*;

/*
 * ����ը������
 */
public class TeatTimeBomb {

	public static void main(String[] args) {
		// ����һ��ը�����󣬴���ʱ���̻߳ᱻ����
		TimeBombThread tbt = new TimeBombThread();
		// ���տ���̨����
		Scanner br = new Scanner(System.in);
		String input;

		try {
			while (true) {
				System.out.println("����quit�����̣߳�");
				// ��������
				input = br.next();
				// �ж��Ƿ���quit
				if (input.equals("quit")) {
					tbt.stopThread();// ֹͣը�����߳�
					break;// ����ѭ��
				}
			}
		} catch (Exception e) {
		}
	}

}
