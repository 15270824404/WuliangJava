package thread.error1;

/**
 * ��������һ���߳������ֻ�ܵ���һ��start()����
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo extends Thread {
	private String name;

	public ThreadDemo(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "���У�i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo("�߳�A");
		demo.start();
		demo.start();// ��������start()����������ʱ�����쳣
	}

}
