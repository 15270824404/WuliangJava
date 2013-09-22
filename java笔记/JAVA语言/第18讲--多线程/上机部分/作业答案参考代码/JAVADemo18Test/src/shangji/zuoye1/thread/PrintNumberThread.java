package shangji.zuoye1.thread;

/**
 * 线程实现方式1
 * 
 * 使用继承Thread实现多线程打印奇数
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
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(name + "：" + i);
			}
		}
	}

	public static void main(String[] args) {
		new PrintNumberThread("线程1").start();
		new PrintNumberThread("线程2").start();
	}
}
