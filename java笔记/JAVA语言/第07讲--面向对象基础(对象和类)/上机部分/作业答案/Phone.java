/*
 * ��дһ���ֻ��࣬����д��������ʾ�ֻ���Ϣ
 * �ֻ�Ʒ��
 * �ֻ��ͺ�
 */
public class Phone {
	String pp;// �ֻ�Ʒ��
	String type;// �ֻ��ͺ�

	// ��ʾ�������Եķ���
	public void showMessage() {
		System.out.println("�ֻ�Ʒ���ǣ�" + pp + "\t�ֻ��ͺ��ǣ�" + type);
	}

	// ��ڷ��������ڴ�����ʹ�ö���
	public static void main(String[] args) {
		Phone p = new Phone();
		p.pp = "Apple";
		p.type = "A101";
		p.showMessage();
	}

}
