package thread.method.getname;

/*
 * ʹ��getName()������ȡ�߳�����
 */
public class ThreadDemo implements Runnable {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			//��ȡ�߳�����
			System.out.println(Thread.currentThread().getName() + "����,i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		new Thread(demo1).start();
		new Thread(demo1).start();
		new Thread(demo1).start();
	}
}
