package synchronizeddemo;
/**
 * ʹ��ͬ������
 * @author ZHT
 *
 */
public class DataThreadMethod extends Thread {

	NewData data;
	String name;

	public DataThreadMethod(NewData data, String name) {
		this.data = data;
		this.name = name;
		start();
	}

	public void run() {
		try {
			while (true) {
				if (data.n > 0) {
					//��run�����е��ñ�ͬ���ķ���
					data.saleTicket(name);
					Thread.sleep(100);
				} else {
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("ͬ��������");
		NewData data = new NewData();
		DataThreadMethod d1 = new DataThreadMethod(data, "��ƱԱ1");
		DataThreadMethod d2 = new DataThreadMethod(data, "��ƱԱ2");

	}

}