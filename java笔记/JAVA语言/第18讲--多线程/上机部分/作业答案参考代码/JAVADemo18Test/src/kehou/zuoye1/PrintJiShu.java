package kehou.zuoye1;

/*
 * ��ӡ�������߳�
 */
public class PrintJiShu extends Thread {
	String name;

	public PrintJiShu() {
		this.name = "����";
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			// ʹ��ͬ������飬ȷ�����δ�ӡ
			synchronized (this) {
				if (i % 2 != 0) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(name + "��" + i);
				}
			}
		}
	}
}
