package shangji.zuoye1.runnable;

/**
 * 线程实现方式2
 * 
 * 实现Runnable接口实现多线程打印奇数
 * 
 * @author ZHT
 * 
 */
public class PrintNumberRunnable implements Runnable {
	String name;

	public PrintNumberRunnable(String name) {
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
		PrintNumberRunnable pn1 = new PrintNumberRunnable("线程1");
		PrintNumberRunnable pn2 = new PrintNumberRunnable("线程2");
		new Thread(pn1).start();
		new Thread(pn2).start();
	}
}
