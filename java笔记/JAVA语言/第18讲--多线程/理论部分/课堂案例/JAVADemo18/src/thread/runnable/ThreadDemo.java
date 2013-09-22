package thread.runnable;

/**
 * 线程实现方式2
 * 
 * 实现Runnable接口，重写run()方法
 * 
 * @author ZHT
 * 
 */
public class ThreadDemo implements Runnable {// 自定义的多线程类需要实现Runnable接口
	private String name;

	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(name + "运行,i=" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		ThreadDemo demo2 = new ThreadDemo();
		new Thread(demo1).start();// 将自定义的线程类对象放入一个Thread对象中启动线程
		new Thread(demo2).start();// 注意启动时与方式一的区别

	}
}
