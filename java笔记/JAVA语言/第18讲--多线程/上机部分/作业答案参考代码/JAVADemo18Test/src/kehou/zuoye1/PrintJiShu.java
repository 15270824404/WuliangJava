package kehou.zuoye1;

/*
 * 打印奇数的线程
 */
public class PrintJiShu extends Thread {
	String name;

	public PrintJiShu() {
		this.name = "奇数";
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			// 使用同步代码块，确保依次打印
			synchronized (this) {
				if (i % 2 != 0) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(name + "：" + i);
				}
			}
		}
	}
}
