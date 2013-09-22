package thread.method.getname;

/*
 * 使用getName()方法获取线程名称
 */
public class ThreadDemo implements Runnable {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			//获取线程名称
			System.out.println(Thread.currentThread().getName() + "运行,i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		new Thread(demo1).start();
		new Thread(demo1).start();
		new Thread(demo1).start();
	}
}
