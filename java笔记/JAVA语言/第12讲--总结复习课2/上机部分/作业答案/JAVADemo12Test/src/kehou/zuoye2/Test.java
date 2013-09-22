package kehou.zuoye2;

public class Test {

	public static void main(String[] args) {
		NumberAddition n1 = new NumberAddition(20, 30);
		Object r1 = n1.add();
		System.out.println("两个数字相加的结果是：" + r1);
		TextConcatenation t1 = new TextConcatenation("你好！", "ZTE!");
		Object r2 = t1.add();
		System.out.println("两个字符串相加的结果是：" + r2);
	}

}
