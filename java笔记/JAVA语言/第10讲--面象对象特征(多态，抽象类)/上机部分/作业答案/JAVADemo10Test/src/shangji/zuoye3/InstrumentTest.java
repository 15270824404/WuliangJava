package shangji.zuoye3;
/*
 * �ϻ���ҵ 3
 * �����ϻ���ҵ 2��
 * �����ʵ����������
 * ������Instrument����Ϊ������(Piano)��С����(Violin)
 * ��������û�й̶��ĵ��෽����ʹ�ó��󷽷�����
 * ���������ĵ��ࣨ play ������������ͬ
 * ��дһ��������InstrumentTest��Ҫ��
 * ��д����testPlay���Ը����������е�����ԡ�Ҫ���������Ĳ�ͬ��������Ӧ�ĵ���
 * ��main�����н��в���
 */
/*
 * �����ࣺ���ࡪ��������
 */
abstract class Instrument {
	abstract public void play();
}

/*
 * ������:�����������
 */
class Piano extends Instrument {
	// ʵ�ֳ��󷽷�
	public void play() {
		System.out.println("����������......");
	}
}

/*
 * С������:�����������
 */
class Violin extends Instrument {
	// ʵ�ֳ��󷽷�
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
