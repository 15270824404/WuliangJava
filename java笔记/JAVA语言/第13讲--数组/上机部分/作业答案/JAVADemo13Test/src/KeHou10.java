/*
 * ��9�� ����
 * �κ���ҵ10��
 * ��ӡ�������
 */
public class KeHou10 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				if (col == 0) {// ��һ��
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
				}
			}
		}
		//�����ֵ
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
