/*
 * ʵ��1��10�����������ͣ���whileѭ��ʵ�� 
 * HelloWorld06.java
 */

public class HelloWorld06 {
	public static void main(String[] args) {
		// ����ѭ�������������ó�ʼֵ
		int i = 1;
		// �����������ڷ���Щ���ĺ�
		int sum = 0;
		while (i <= 10) {// ֻҪû��10����ѭ���ͼ���
			//�ۼ����
			sum = sum + i;
			i++;// �ı�ѭ������������������1��
		}
		//��ѭ�������������Щ���ĺ�
		System.out.println("��1��10�ĺ��ǣ�" + sum);
	}
}
