package synchronizeddemo;
/**
 * ʹ����ͬ�������
 * @author ZHT
 *
 */
public class DataThreadBlock extends Thread {

	Data data;
	String name;

	public DataThreadBlock(Data data, String name) {
		this.data = data;
		this.name = name;
		start();
	}

	public void run() {
		try {
			while (true) {
				//ͬ�������
				synchronized (data) {
					if (data.n > 0) {
						System.out.println(name + "��" + data.n + "��Ʊ��");
						data.n--;
						Thread.sleep(100);
					} else {
						break;
					}
				}
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("ͬ�����飺");
		Data data = new Data();
		DataThreadBlock d1 = new DataThreadBlock(data, "��ƱԱ1");
		DataThreadBlock d2 = new DataThreadBlock(data, "��ƱԱ2");
	}

}