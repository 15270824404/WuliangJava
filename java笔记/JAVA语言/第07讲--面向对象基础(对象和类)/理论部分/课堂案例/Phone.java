/*
 * 编写一个手机类，并编写测试类显示手机信息
 * 手机品牌
 * 手机型号
 */
public class Phone {
	String pp;// 手机品牌
	String type;// 手机型号

	// 显示对象属性的方法
	public void showMessage() {
		System.out.println("手机品牌是：" + pp + "\t手机型号是：" + type);
	}

	// 入口方法，用于创建并使用对象
	public static void main(String[] args) {
		Phone p = new Phone();
		p.pp = "Apple";
		p.type = "A101";
		p.showMessage();
	}

}
