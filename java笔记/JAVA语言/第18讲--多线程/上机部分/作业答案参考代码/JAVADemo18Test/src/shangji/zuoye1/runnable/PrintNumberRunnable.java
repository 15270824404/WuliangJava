package shangji.zuoye1.runnable;

/**
 * �߳�ʵ�ַ�ʽ2
 * 
 * ʵ��Runnable�ӿ�ʵ�ֶ��̴߳�ӡ����
 * 
 * @author ZHT
 * 
 */
public class PrintNumberRunnable implements Runnable {
	String name;

	public PrintNumberRunnable(String name) {
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
		PrintNumberRunnable pn1 = new PrintNumberRunnable("�߳�1");
		PrintNumberRunnable pn2 = new PrintNumberRunnable("�߳�2");
		new Thread(pn1).start();
		new Thread(pn2).start();
	}
}
