package staticdemo;

public class StaticBlock {
	static {
		System.out.println("���Ǿ�̬�����");
	}

	//���췽��
	StaticBlock() {

	}

	// ����
	public static void main(String[] args) {
		StaticBlock b = new StaticBlock();
	}
}
