/*
 * �ϻ���3�����κ���ҵ4��
 * �����Ա�ɽ�Ŀ��Գɼ�����ʾ������
 * �ɼ�==100�֣��ְָ���������
 * �ɼ�>=90�֣����������MP4
 * 90��>�ɼ�>=60�֣���������򱾲ο���
 * �ɼ�<60�֣�ʲô������
 */
public class Kehou4 {

	public static void main(String[] args) {

		int score = 95; // �ɼ�
		if (score == 100) {
			System.out.println("���ְָ���������");
		} else if (score >= 90) {
			System.out.println("�����������MP4");
		} else if (score < 90 && score >= 60) {
			System.out.println("����������򱾲ο���");
		} else {
			System.out.println("ʲô������");
		}
	}

}
