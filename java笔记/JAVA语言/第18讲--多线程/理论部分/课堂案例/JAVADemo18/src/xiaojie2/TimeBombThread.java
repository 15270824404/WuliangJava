package xiaojie2;
/*
 * ʵ��Runnable�ӿڵķ�ʽ��������ʱը���߳���
 */
public class TimeBombThread implements Runnable {

	int n;// ʱ��
	boolean isRun;// �Ƿ�����

	public TimeBombThread() {
		n = 60;
		isRun = true;
		new Thread(this).start();// �����߳�
	}

	public void run() {
		try {
			while (isRun) {
				Thread.sleep(100);// �ӳ�1��
				System.out.println("ʣ��ʱ�䣺" + n + "�룡");
				// ���ʱ�䵽��
				if (n <= 0) {
					isRun = false;// ֹͣѭ��
					System.out.println("ը����ը�ˣ�����������");
					break;
				}
				n--;// ʱ�����
			}
		} catch (Exception e) {
		}
	}

	// ����ֹͣ�߳�
	public void stopThread() {
		isRun = false;
	}

}
