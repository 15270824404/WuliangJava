package kehou02;

/*
 * �ڲ��� ���зֱ𴴽����������Ķ���
 * �������е�������Ĺ��췽������ͨ����
 * �ֱ��ø�������������ñ���Ĺ��췽������ͨ����
 */
public class Test {

	public static void main(String[] args) {
		Man man = new Man("����", "��");
		System.out.println("���������ø���ķ���");
		man.getInfo();// ���������ø���ķ���
		Father father = new Father("����", "Ů", 22, "9876543210123", "�����差");
		System.out.println("\n��������������ķ���");
		father.getFatherInfo();// ��������������ķ���
		System.out.println("\n���������ø���ķ���");
		father.getInfo();// ���������ø���ķ���
	}

}
