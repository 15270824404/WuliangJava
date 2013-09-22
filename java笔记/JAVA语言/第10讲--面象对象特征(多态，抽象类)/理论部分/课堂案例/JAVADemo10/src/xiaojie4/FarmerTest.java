/*
 * 小结4：
 * 农民出售农产品：猪和苹果 
 * 分析： 因为“猪”和“苹果”没有共同的父类，所以这里要使用接口来解决
 */
package xiaojie4;
//农产品接口
interface IProduce {
	public String name = " produce ";

	public String getName();
}

// 实现农产品接口的类
class Pig implements IProduce {
	public String getName() {
		return " pig ";
	}
}

// 实现农产品接口的类
class Apple implements IProduce {
	public String getName() {
		return " apple ";
	}
}

// 农夫类——可以出售农产品
class Farmer {
	public void sale(IProduce produce) {
		System.out.println("出售：" + produce.getName());
	}
}

/*
 * 测试类
 */
public class FarmerTest {
	public static void main(String args[]) {
		Farmer farmer = new Farmer();
		// 具体出售什么，由农民的具体产品决定
		farmer.sale(new Apple());
		farmer.sale(new Pig());
	}
}
