package thread.priority;

/**
 * 输出数字的线程类
 * 
 * @author ZHT
 * 
 */
public class PrintNumberThread extends Thread {
	String name;

	public PrintNumberThread(String name) {
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + "：" + i);
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		PrintNumberThread p1 = new PrintNumberThread("高优先级");
		PrintNumberThread p2 = new PrintNumberThread("普通优先级");
		PrintNumberThread p3 = new PrintNumberThread("低优先级");
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
	}
}
