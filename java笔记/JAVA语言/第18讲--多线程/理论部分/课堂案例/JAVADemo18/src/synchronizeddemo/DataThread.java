package synchronizeddemo;
/**
 * û��ʹ���߳�ͬ��
 * @author ZHT
 *
 */
public class DataThread extends Thread {

	Data data;
	String name;

	public DataThread(Data data, String name) {
		this.data = data;
		this.name = name;
		start();
	}

	public void run() {
		try {
			while (true) {
				if (data.n > 0) {
					System.out.println(name + "��" + data.n + "��Ʊ��");
					data.n--;
					Thread.sleep(100);
				} else {
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Data data = new Data();
		DataThread d1 = new DataThread(data, "��ƱԱ1");
		DataThread d2 = new DataThread(data, "��ƱԱ2");
	}

}
