package thread.method.yield;

/*
 * �߳�����
 */
public class ThreadDemoYield implements Runnable {
	private String name;

	public ThreadDemoYield() {
		this.setName("�߳�����");
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "���У�i=" + i);
			if (i == 2) {
				Thread.yield();// ��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
			}
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		new Thread(new ThreadDemoYield()).start();
		new Thread(new ThreadDemoYield()).start();
	}
}
