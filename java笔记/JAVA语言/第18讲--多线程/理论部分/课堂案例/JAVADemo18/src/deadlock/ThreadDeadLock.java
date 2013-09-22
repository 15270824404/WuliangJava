package deadlock;

/*
 * 死锁示例
 */
public class ThreadDeadLock implements Runnable {
	private boolean flag;
	static Father father = new Father();
	static Child child = new Child();

	public void run() {
		if (flag) {
			synchronized (father) {// 同步爸爸对象
				try {
					father.say();// 爸爸想要成绩单
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (child) {
					father.get();
				}
			}
		} else {
			synchronized (child) {// 同步小孩对象
				try {
					Thread.sleep(500);// 小孩想要玩具
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