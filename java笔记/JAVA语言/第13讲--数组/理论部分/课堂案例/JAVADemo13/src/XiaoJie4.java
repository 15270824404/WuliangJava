

import java.util.Arrays;

/*
 *  ��12��������
 *  С��4��
 *    ��һ��������ַ���'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'�����򲢰���Ӣ����ĸ����������
 */
public class XiaoJie4 {

	public static void main(String[] args) {
		char list[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.println("����ǰ��");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		// ����
		Arrays.sort(list);
		System.out.println("\n�����");
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i] + "\t");
		}

	}

}
