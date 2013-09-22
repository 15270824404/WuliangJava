package xiaojie2;
/*
 * 实现Runnable接口的方式来创建定时炸弹线程类
 */
public class TimeBombThread implements Runnable {

	int n;// 时间
	boolean isRun;// 是否运行

	public TimeBombThread() {
		n = 60;
		isRun = true;
		new Thread(this).start();// 启动线程
	}

	public void run() {
		try {
			while (isRun) {
				Thread.sleep(100);// 延迟1秒
				System.out.println("剩余时间：" + n + "秒！");
				// 如果时间到了
				if (n <= 0) {
					isRun = false;// 停止循环
					System.out.println("炸弹爆炸了！！！！！！");
					break;
				}
				n--;// 时间减少
			}
		} catch (Exception e) {
		}
	}

	// 用于停止线程
	public void stopThread() {
		isRun = false;
	}

}
