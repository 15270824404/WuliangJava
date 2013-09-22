package thread.thread;

/**
 * �߳�ʵ�ַ�ʽ1��
 * 
 * �̳�Thread�࣬��дrun()����
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo extends Thread {// �Զ���Ķ��߳�����Ҫ�̳�Thread��
	private String name;

	public ThreadDemo(String name) {
		this.name = name;
	}

	/**
	 * ��дThread�е�run()������ִ���Զ������Լ��Ĺ���
	 */
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "���У�i=" + i);
		}
	}

	public static void main(String[] args) {
		// new ThreadDemo01("�߳�A").run();//����ֱ�ӵ���run()������ִ��
		// new ThreadDemo01("�߳�B").run();
		new ThreadDemo("�߳�A").start();// Ҫ����start()����ִ�У����Զ�����run()�����еĴ���
		new ThreadDemo("�߳�B").start();
		new ThreadDemo("�߳�C").start();
		
	}
}
