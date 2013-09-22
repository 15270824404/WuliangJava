package thread.different;

/**
 * Thread����Runnable�ӿڵ�����
 * 
 * ʵ��Runnable�ӿڿ��Խ���������
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo002 implements Runnable {
	private int ticket = 5;

	public void run() {
		for (int i = 1; i <= 5; i++) {
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

	public static void main(String[] args) {
		ThreadDemo002 demo1 = new ThreadDemo002();
		new Thread(demo1).start();
		new Thread(demo1).start();
	}
}
