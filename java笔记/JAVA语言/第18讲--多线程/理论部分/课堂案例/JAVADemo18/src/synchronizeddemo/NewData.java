package synchronizeddemo;

/**
 * ����ͬ����������
 * 
 * @author ZHT
 * 
 */
public class NewData {
	int n;

	public NewData() {
		n = 5;
	}

	// ͬ������
	public synchronized void saleTicket(String name) {
		if (n <= 0)
			return;
		System.out.println(name + "��" + n + "��Ʊ��");
		n--;
	}
}
