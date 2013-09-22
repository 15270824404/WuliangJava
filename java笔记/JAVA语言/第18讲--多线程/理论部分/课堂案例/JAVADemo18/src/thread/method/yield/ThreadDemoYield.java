package thread.method.yield;

/*
 * 线程礼让
 */
public class ThreadDemoYield implements Runnable {
	private String name;

	public ThreadDemoYield() {
		this.setName("线程阻塞");
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
			if (i == 2) {
				Thread.yield();// 暂停当前正在执行的线程对象，并执行其他线程。
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
