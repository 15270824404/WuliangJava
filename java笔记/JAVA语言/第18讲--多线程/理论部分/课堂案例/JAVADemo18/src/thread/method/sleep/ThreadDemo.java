package thread.method.sleep;

/*
 * ʹ��sleep()����ʹ�߳�����
 */
public class ThreadDemo implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				// �߳�����5000����
				Thread.sleep(5000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		new Thread(demo1).start();
	}
}
