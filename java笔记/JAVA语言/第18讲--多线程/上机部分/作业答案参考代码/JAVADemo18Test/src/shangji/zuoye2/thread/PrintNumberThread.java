package shangji.zuoye2.thread;

/**
 * �߳�ʵ�ַ�ʽ1
 * 
 * ʹ�ü̳�Threadʵ�ֶ��̴߳�ӡ1-10000֮��������������
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
		for (int i = 1; i < 10000; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i == 2 || i == 1) {// �Ȱ�1��2��ӡ����					
					break;
				}
				if (i % j == 0) {
					flag = false;// �������������ñ��Ϊfalse
					break;// �����������ͽ�����һ����ѭ��
				}
			}
			if (flag)
				System.out.println(name + "��" + i);

		}
	}

	public static void main(String[] args) {
		new PrintNumberThread("�߳�1").start();
		new PrintNumberThread("�߳�2").start();
	}
}
