package thread.thread;

/**
 * 线程实现方式1：
 * 
 * 继承Thread类，重写run()方法
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo extends Thread {// 自定义的多线程类需要继承Thread类
	private String name;

	public ThreadDemo(String name) {
		this.name = name;
	}

	/**
	 * 重写Thread中的run()方法，执行自定义类自己的功能
	 */
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "运行，i=" + i);
		}
	}

	public static void main(String[] args) {
		// new ThreadDemo01("线程A").run();//不能直接调用run()方法来执行
		// new ThreadDemo01("线程B").run();
		new ThreadDemo("线程A").start();// 要调用start()方法执行，会自动调用run()方法中的代码
		new ThreadDemo("线程B").start();
		new ThreadDemo("线程C").start();
		
	}
}
