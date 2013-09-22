package thread.timer;

import java.util.*;

/**
 * �߳�ʵ�ַ�ʽ3
 * 
 * ʹ��Timer��TimerTask��ϣ�ִ�ж���߳�
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
		// ���ʹ������Timer����ֱ����������߳�
		Timer t1 = new Timer();
		Timer t2 = new Timer();
		MyTimerTask mtt1 = new MyTimerTask("�߳�1��");
		t1.schedule(mtt1, 1000);
		MyTimerTask mtt2 = new MyTimerTask("�߳�2��");
		t2.schedule(mtt2, 500);
	}
}
