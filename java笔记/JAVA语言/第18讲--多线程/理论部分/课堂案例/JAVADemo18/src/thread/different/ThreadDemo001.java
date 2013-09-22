package thread.different;

/**
 * Thread类与Runnable接口的区别
 * 
 * 继承Thread类受单继承影响，不适合多个线程共享资源
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
				System.out.println(name + "卖票:ticket=" + ticket--);
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo001 demo1 = new ThreadDemo001("售票员1");
		ThreadDemo001 demo2 = new ThreadDemo001("售票员2");
		demo1.start();
		demo2.start();// 会导致两个线程各自卖5张票
	}

}
