import java.util.Arrays;

/*
 *  ��9��������
 *  �ϻ���ҵ3��
 *    ��һ��������ַ���'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'�����򲢰���Ӣ����ĸ����������
 */
public class ZuoYe3 {

	public static void main(String[] args) {
		// �����������ڱ����ṩ���ַ�
		char list[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		// �������ǰ���ַ�����
		System.out.println("����ǰ��");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		// ʹ��Arrays��sort��������
		Arrays.sort(list);
		// ����������ַ�����
		System.out.println("\n�����");
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i] + "\t");
		}
	}
}
