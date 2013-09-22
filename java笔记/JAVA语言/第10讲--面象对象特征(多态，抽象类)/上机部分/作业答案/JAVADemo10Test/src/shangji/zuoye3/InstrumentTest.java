package shangji.zuoye3;
/*
 * 上机作业 3
 * 改造上机作业 2：
 * 请编码实现如下需求：
 * 乐器（Instrument）分为：钢琴(Piano)、小提琴(Violin)
 * 乐器本身没有固定的弹奏方法，使用抽象方法即可
 * 各种乐器的弹奏（ play ）方法各不相同
 * 编写一个测试类InstrumentTest，要求：
 * 编写方法testPlay，对各种乐器进行弹奏测试。要依据乐器的不同，进行相应的弹奏
 * 在main方法中进行测试
 */
/*
 * 乐器类：父类——抽象类
 */
abstract class Instrument {
	abstract public void play();
}

/*
 * 钢琴类:乐器类的子类
 */
class Piano extends Instrument {
	// 实现抽象方法
	public void play() {
		System.out.println("钢琴在演奏......");
	}
}

/*
 * 小提琴类:乐器类的子类
 */
class Violin extends Instrument {
	// 实现抽象方法
	public void play() {
		System.out.println("小提琴在演奏......");
	}
}

/*
 * 测试类
 */
public class InstrumentTest {
	// 测试方法
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
