

/*
 * ��13��������
 * С��3��
 *    С��Ҫȥ��һ���ֻ�����ѯ����4�ҵ�ļ۸�
 *    �ֱ���2800Ԫ��2900Ԫ��2750Ԫ��3100Ԫ����ʾ�����ͼ�
 */
public class XiaoJie3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = { 2800, 2900, 2750, 3100 };
		int min = list[0]; // �洢��Сֵ
		for (int i = 0; i < list.length; i++) {
			if (min > list[i]) {
				min = list[i]; // ����
			}
		}
		System.out.println("�۸���͵��ǣ�" + min);
	}
}
