package shangji.zuoye1.timer;

import java.util.*;

/**
 * �߳�ʵ�ַ�ʽ3
 * 
 * ʹ��Timer��TimerTask��ϣ�ִ�ж���߳�
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
				System.out.println(name + "��" + i);
			}
		}
	}

	public static void main(String[] args) {
		// ���ʹ������Timer����ֱ����������߳�
		Timer t1 = new Timer();
		Timer t2 = new Timer();
		PrintNumberTimerTask mtt1 = new PrintNumberTimerTask("�߳�1��");
		t1.schedule(mtt1, 500);
		PrintNumberTimerTask mtt2 = new PrintNumberTimerTask("�߳�2��");
		t2.schedule(mtt2, 500);
	}

}
