package shangji.zuoye2;
/*
 * �ϻ���ҵ2��
 * �����ʵ����������
 * ������Instrument����Ϊ������(Piano)��С����(Violin)
 * ���������ĵ��ࣨ play ������������ͬ
 * ��дһ��������InstrumentTest��Ҫ��
 * ��д����testPlay���Ը����������е�����ԡ�Ҫ���������Ĳ�ͬ��������Ӧ�ĵ���
 * ��main�����н��в���
 */
/*
 * �����ࣺ����
 */
class Instrument {
	public void play() {
		System.out.println("����������......");
	}
}

/*
 * ������:�����������
 */
class Piano extends Instrument {
	public void play() {
		System.out.println("����������......");
	}
}

/*
 * С������:�����������
 */
class Violin extends Instrument {
	public void play() {
		System.out.println("С����������......");
	}
}

/*
 * ������
 */
public class InstrumentTest {
	// ���Է���
	public void testPlay() {
		Instrument i1 = new Piano();
		i1.play();
		Instrument i2 = new Violin();
		i2.play();
	}

	public static void main(String[] args) {
		InstrumentTest test = new InstrumentTest();
		test.testPlay();
	}
}
