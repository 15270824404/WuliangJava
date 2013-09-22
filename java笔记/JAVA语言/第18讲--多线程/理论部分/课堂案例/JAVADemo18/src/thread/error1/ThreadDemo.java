package thread.error1;

/**
 * 常见错误：一个线程类对象只能调用一次start()方法
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
			System.out.println(name + "运行，i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo("线程A");
		demo.start();
		demo.start();// 调用两次start()方法，运行时出现异常
	}

}
