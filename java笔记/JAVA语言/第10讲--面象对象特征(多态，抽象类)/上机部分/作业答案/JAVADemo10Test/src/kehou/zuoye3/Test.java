package kehou.zuoye3;

public class Test {

	/**
	 * 建立测试类Test，在Test类中实例化Pet、Dog、Cat，并分别调用各自的speakInfo方法
	 */
	public static void main(String[] args) {
		Pet p = new Pet("宠物", "宠物的语言");
		Pet d = new Dog("小花狗", "汪汪汪");
		Pet c = new Cat("小馋猫", "喵喵喵");
		p.speakInfo();
		d.speakInfo();
		c.speakInfo();
	}

}
