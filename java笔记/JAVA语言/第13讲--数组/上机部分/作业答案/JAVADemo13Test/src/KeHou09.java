/*
 * ��9�� ����
 * �κ���ҵ9��
 * ��������
 * ʵ���������������Ĵ洢�����
 * 
 * ���ֺܹ���ʹ������˼·���
 * ˼·��
 * ����һ������n���������Ľ�
 * �����ͳ�ʼ��һ��n��n������
 * �������ݵĹ��ɣ����Ӧ����ֵΪ���к�+�к�+1��
 * ����ֵ��n��ʱ����ȡ��n��������
 */
public class KeHou09 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
		int data;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				data = row + col + 1;
				if (data <= n) {
					arr[row][col] = data;
				} else {
					arr[row][col] = data % n;
				}
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "   ");
			}
			System.out.println();
		}
	}

}
