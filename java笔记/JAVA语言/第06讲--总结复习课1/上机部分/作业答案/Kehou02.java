/*
 * �ڿ���̨��ӡ�����ϵ�99�˷���
 */
public class Kehou02 {
	public static void main(String[] args) {
		//���ѭ��������
		for (int row = 1; row < 10; row++) {
			//�ڲ�ѭ��������
			for (int col = 1; col <= row; col++) {
				System.out.print(row + "��" + col + "=" + row * col+"\t");
			}
			//ÿһ�д�ӡ��ɺ�Ż���
			System.out.println();
		}
	}
}
