package thread.different;

/**
 * Thread����Runnable�ӿڵ�����
 * 
 * �̳�Thread���ܵ��̳�Ӱ�죬���ʺ϶���̹߳�����Դ
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo001 extends Thread {

	private int ticket = 5;
	private String name;

	public ThreadDemo001(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (ticket > 0) {
				System.out.println(name + "��Ʊ:ticket=" + ticket--);
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo001 demo1 = new ThreadDemo001("��ƱԱ1");
		ThreadDemo001 demo2 = new ThreadDemo001("��ƱԱ2");
		demo1.start();
		demo2.start();// �ᵼ�������̸߳�����5��Ʊ
	}

}
