package shangji.zuoye2.thread;

/**
 * 线程实现方式1
 * 
 * 使用继承Thread实现多线程打印1-10000之间素数（质数）
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
		for (int i = 1; i < 10000; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i == 2 || i == 1) {// 先把1和2打印出来					
					break;
				}
				if (i % j == 0) {
					flag = false;// 不是质数，设置标记为false
					break;// 不是质数，就进行下一次外循环
				}
			}
			if (flag)
				System.out.println(name + "：" + i);

		}
	}

	public static void main(String[] args) {
		new PrintNumberThread("线程1").start();
		new PrintNumberThread("线程2").start();
	}
}
