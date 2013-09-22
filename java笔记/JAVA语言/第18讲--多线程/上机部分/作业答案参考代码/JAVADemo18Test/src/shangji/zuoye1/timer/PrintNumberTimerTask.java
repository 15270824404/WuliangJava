package shangji.zuoye1.timer;

import java.util.*;

/**
 * 线程实现方式3
 * 
 * 使用Timer和TimerTask组合：执行多个线程
 * 
 */
public class PrintNumberTimerTask extends TimerTask {

	String name;

	public PrintNumberTimerTask(String name) {
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
		// 最好使用两个Timer对象分别启动两个线程
		Timer t1 = new Timer();
		Timer t2 = new Timer();
		PrintNumberTimerTask mtt1 = new PrintNumberTimerTask("线程1：");
		t1.schedule(mtt1, 500);
		PrintNumberTimerTask mtt2 = new PrintNumberTimerTask("线程2：");
		t2.schedule(mtt2, 500);
	}

}
