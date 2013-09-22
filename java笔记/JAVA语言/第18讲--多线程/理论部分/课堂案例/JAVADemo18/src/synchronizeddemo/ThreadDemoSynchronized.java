package synchronizeddemo;
/**
 * �߳�ͬ��
 * @author ZHT
 *
 */
public class ThreadDemoSynchronized implements Runnable {
	private int ticket = 5;

	public void run() {
		for (int i = 1; i <= 5; i++) {
			synchronized (this) {//ͬ�������
				if (ticket > 0) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {						
						e.printStackTrace();
					}
					System.out.println("��Ʊ��ticket=" + ticket--);
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemoSynchronized demo1 = new ThreadDemoSynchronized();
		new Thread(demo1).start();
		new Thread(demo1).start();
	}

}
