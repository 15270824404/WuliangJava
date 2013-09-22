package thread.timer;

import java.util.*;

/**
 * 线程实现方式3
 * 
 * 使用Timer和TimerTask组合：执行多个线程
 * 
 * @author ZHT
 * 
 */
public class MyTimerTask extends TimerTask {

	String s;

	public MyTimerTask(String s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(s + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// 最好使用两个Timer对象分别启动两个线程
		Timer t1 = new Timer();
		Timer t2 = new Timer();
		MyTimerTask mtt1 = new MyTimerTask("线程1：");
		t1.schedule(mtt1, 1000);
		MyTimerTask mtt2 = new MyTimerTask("线程2：");
		t2.schedule(mtt2, 500);
	}
}
