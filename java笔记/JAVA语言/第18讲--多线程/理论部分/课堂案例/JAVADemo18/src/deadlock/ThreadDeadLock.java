package deadlock;

/*
 * ����ʾ��
 */
public class ThreadDeadLock implements Runnable {
	private boolean flag;
	static Father father = new Father();
	static Child child = new Child();

	public void run() {
		if (flag) {
			synchronized (father) {// ͬ���ְֶ���
				try {
					father.say();// �ְ���Ҫ�ɼ���
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (child) {
					father.get();
				}
			}
		} else {
			synchronized (child) {// ͬ��С������
				try {
					Thread.sleep(500);// С����Ҫ���
					child.say();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (father) {
					child.get();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadDeadLock aaa = new ThreadDeadLock();
		ThreadDeadLock bbb = new ThreadDeadLock();
		aaa.flag = true;
		bbb.flag = false;
		Thread thA = new Thread(aaa);
		Thread thB = new Thread(bbb);
		thA.start();
		thB.start();
	}
}