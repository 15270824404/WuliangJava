package thread.runnable;

/**
 * �߳�ʵ�ַ�ʽ2
 * 
 * ʵ��Runnable�ӿڣ���дrun()����
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo implements Runnable {// �Զ���Ķ��߳�����Ҫʵ��Runnable�ӿ�
	private String name;

	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(name + "����,i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		ThreadDemo demo2 = new ThreadDemo();
		new Thread(demo1).start();// ���Զ�����߳���������һ��Thread�����������߳�
		new Thread(demo2).start();// ע������ʱ�뷽ʽһ������

	}
}
