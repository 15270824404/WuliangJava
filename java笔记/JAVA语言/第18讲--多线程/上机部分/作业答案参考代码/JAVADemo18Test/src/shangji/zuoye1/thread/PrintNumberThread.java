package shangji.zuoye1.thread;

/**
 * �߳�ʵ�ַ�ʽ1
 * 
 * ʹ�ü̳�Threadʵ�ֶ��̴߳�ӡ����
 * 
 * @author ZHT
 * 
 */
public class PrintNumberThread extends Thread {

	String name;

	public PrintNumberThread(String name) {
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
		new PrintNumberThread("�߳�1").start();
		new PrintNumberThread("�߳�2").start();
	}
}
