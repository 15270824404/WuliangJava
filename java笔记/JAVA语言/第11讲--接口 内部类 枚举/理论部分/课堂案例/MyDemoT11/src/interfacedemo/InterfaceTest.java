package interfacedemo;

/*
 * ����ͷ�಻��ʵ��������������Ĺ��ܣ���ʵ����USB�ӿ�
 */
class Camera implements USB {
	public void start() {
		System.out.println("��ʼ����...");
	}

	public void stop() {
		System.out.println("ֹͣ����");
	}
}

/*
 * ��ӡ���಻��ʵ�����������ӡ�Ĺ��ܣ���ʵ����USB�ӿ�
 */
class Printer implements USB {
	public void start() {
		System.out.println("��ʼ��ӡ...");
	}

	public void stop() {
		System.out.println("ֹͣ��ӡ��");
	}
}
/*
 * ���Խӿ�
 */
public class InterfaceTest {
	public static void main(String[] args) {
		USB camera = new Camera();
		USB printer = new Printer();
		camera.start();
		printer.start();
	}
}
