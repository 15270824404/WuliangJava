/*
 * ��дһ�������࣬����д��������ʾ������Ϣ��
 * ��������
 * ��������
 */
public class Music {
	String name;//��������
	String type;//��������

	// ��ʾ�������Եķ���
	public void showMessage() {
		System.out.println("�������ƣ�" + name + "\t�������ͣ�" + type);
	}
	//��ڷ��������ڴ�����ʹ�ö���
	public static void main(String[] args) {
		Music m=new Music();
		m.name="˫�ع�";
		m.type="��������";
		m.showMessage();
	}
}
