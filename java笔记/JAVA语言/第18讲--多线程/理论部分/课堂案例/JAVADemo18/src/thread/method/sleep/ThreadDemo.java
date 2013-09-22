package thread.method.sleep;

/*
 * 使用sleep()方法使线程休眠
 */
public class ThreadDemo implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				// 线程休眠5000毫秒
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
