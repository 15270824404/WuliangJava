/**
 * Demo012.java
 * ��ʾcontinue����1��100֮���λ������2��3��4��7�����Ҳ��ܱ�3����������֮�͡�
 */
public class Demo012 {

	public static void main(String[] args) {
		int sum = 0; // ����������б����ۼ�ֵ
		for (int i = 1; i <= 100; i++) {
			// �ж�i�Ƿ��ܱ�3����
			if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4 || i % 10 == 7
					|| i % 3 == 0) {
				continue;
			}
			sum = sum + i; // �����ۼ�
		}
		System.out.println("1��100֮���λ������2��3��4��7��" + "���Ҳ��ܱ�3�������������ǣ�" + sum);
	}
}
