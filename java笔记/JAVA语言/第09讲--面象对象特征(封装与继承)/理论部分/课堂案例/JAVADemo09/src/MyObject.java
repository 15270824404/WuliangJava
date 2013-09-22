/*
 * 在Java 中，所有的Java类都直接或间接地继承了java.lang.Object类
 * 定义一个类时，如果没有使用extends关键字，那么该类实际上隐式继承了Object
 */
public class MyObject extends Object {// 后面的extends Object即使不写，也是默认有的

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj.toString();// 这个方法就是继承自Object类的
	}

}
