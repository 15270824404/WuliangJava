/*
 * �ϻ���ҵ1
 */
public class Zuoye1 {

	/*
	 * �ͻ�	������Ʒ	����		����	�ۿ�
	 *	1	T��		��420.78 	1	9.5
	 *	2	����		��45 		3	��
	 */
	public static void main(String[] args) {
		double shirtPrice = 420.78;  //��������
		int shirtNo = 1;  //����������
		double tennisPrice = 45;  //���򵥼�
		int tennisNo = 3;  //���������
		
		double shirtMoney = shirtPrice * shirtNo * 0.95;  //�������ѽ��
		double tennisMoney = tennisPrice * tennisNo;     //�������ѽ��
		
		System.out.println("�ͻ�\t" + "���ѽ��");
		System.out.println("����\t" + shirtMoney);
		System.out.println("����\t" + tennisMoney);
	}
}
