package staticdemo;

class Monkey02 {
	// ��̬����
	static void play() {
		System.out.println("��Ƥ��");
	}
}

public class Test02 {
	public static void main(String[] args) {
		// ʾ����10������
		for (int i = 1; i <= 10; i++) {
			Monkey02 houge = new Monkey02();
			// ͨ���������þ�̬����
			Monkey02.play();
		}
	}
}
