package kehou.zuoye3;

/*
 * 再编写测试类，完成以下功能：
 * 将华氏100度转换成摄氏温度并输出
 * 将摄氏98.6度转换成华氏温度并输出
 */
public class Test {

	public static void main(String[] args) {

		HuaShiToSheShi hs = new HuaShiToSheShi();
		System.out.println("华氏100度转换成摄氏温度是：" + hs.convert(100));
		SheShiToHuaShi sh=new SheShiToHuaShi();
		System.out.println("将摄氏98.6度转换成华氏温度是：" + sh.convert(98.6));
	}

}
