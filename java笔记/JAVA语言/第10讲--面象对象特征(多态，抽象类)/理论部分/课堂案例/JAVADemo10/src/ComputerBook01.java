/*
 * 父类
 */
class Book {
	public float getPrice() {
		return 50;
	}
}

/*
 * 子类的方法具有和父类相同的方法名、返回值类型、参数列表
 */
public class ComputerBook01 extends Book {
	// getPrice方法重写了父类Book中的getPrice方法
	public float getPrcie() {
		return 65;
	}
}