/*
 * С��1��
 * ��1��100֮�䲻�ܱ�3��������֮�� ��ʹ��forѭ���ṹ��
 */
public class XiaoJie1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("���ǣ�" + sum);
	}
}
